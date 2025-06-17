jStyleParser
============

[![Build with Maven](https://github.com/radkovo/jStyleParser/actions/workflows/maven.yml/badge.svg)](https://github.com/radkovo/jStyleParser/actions/workflows/maven.yml)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.sf.cssbox/jstyleparser/badge.png)](https://maven-badges.herokuapp.com/maven-central/net.sf.cssbox/jstyleparser)
[![](https://jitpack.io/v/stormcloakgames/jStyleParser.svg)](https://jitpack.io/#stormcloakgames/jStyleParser)


jStyleParser is a Java library for parsing CSS style sheets and assigning styles to the HTML or XML document elements according to the CSS 3 specifications.
It allows parsing the individual CSS files as well as computing the efficient style of the DOM elements.

See the project page for more information:
[http://cssbox.sourceforge.net/jstyleparser](http://cssbox.sourceforge.net/jstyleparser)

Installation
------------
With Maven, use the following dependency:
```xml
<dependency>
    <groupId>net.sf.cssbox</groupId>
    <artifactId>jstyleparser</artifactId>
    <version>4.0.1</version>
</dependency>
```

With Gradle:

```kotlin
// add to build.gradle.kts
repositories {
    // ...
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.stormcloakgames:jStyleParser:1.0.0") // or 'main-SNAPSHOT' for the latest build
}
```

You can then refresh your Gradle dependencies to pick up the library.

(If you're using `main-SNAPSHOT`, use `gradlew --refresh-dependencies` to force Gradle to pull the latest copy of all your dependencies.)


Parsing CSS
-----------
The basic `CSSFactory` interface provides functions parsing CSS strings, files or URLs. The parsed style sheet
is represented by the corresponding data structures that allow accessing all parts of the style sheet
in a type-safe way.
```java
String css = "div { background-color: red; width: 12px; }";

//parse the style sheet
StyleSheet sheet = CSSFactory.parseString(css, new URL("http://base.url"));

//access the rules and declarations
RuleSet rule = (RuleSet) sheet.get(0);       //get the first rule
CombinedSelector selector = rule.getSelectors()[0]; //read the 'div' selector
Declaration bgDecl = rule.get(0);            //read the 'background-color' declaration
String bgProperty = bgDecl.getProperty();    //read the property name
TermColor color = (TermColor) bgDecl.get(0); //read the color

//print the results
System.out.println(selector);   //prints 'div'
System.out.println(bgProperty); //prints 'background-color'
System.out.println(color);      //prints '#ff0000'

//or even print the entire style sheet (formatted)
System.out.println(sheet);
```

See the details in the [documentation](http://cssbox.sourceforge.net/jstyleparser/manual.php#parsing).

Computing style for DOM elements
--------------------------------
jStyleParser allows to map the style rules to the individual elements in a DOM tree based on their selectors. This allows
obtaining the exact style for any HTML element.

```java
org.w3c.dom.Document doc = ... //source DOM

MediaSpec media = new MediaSpecAll(); //use styles for all media

//create the style map
StyleMap map = CSSFactory.assignDOM(doc, "UTF-8", new URL("https://base.url/"), media, true);

//get the style of a single element
Element div = doc.getElementById("searchelement"); //choose a DOM element
NodeData style = map.get(div); //get the style map for the element
//get the type of the assigned value
CSSProperty.Margin mm = style.getProperty("margin-top");
System.out.println("margin-top=" + mm);
//if a length is specified, obtain the exact value
if (mm == Margin.length) {
    TermLength mtop = style.getValue(TermLength.class, "margin-top");
    System.out.println("value=" + mtop);
}

```

Multi-value properties
----------------------

Some properties (e.g. `background`) allow multiple values. In that case, the `NodeData` interface
includes the `getListSize()` method for getting the number of values specified and the `getProperty()`
and `getValue()` functions with an index argument:

```java
//get the style of a single element
Element div = doc.getElementById("searchelement"); //choose a DOM element
NodeData style = map.get(div); //get the style map for the element

//get the number of background images specified for the element
int bgcnt = style.getListSize("background-image", true);

//read all images
for (int index = 0; index < bgcnt; index++>) {
    CSSProperty.BackgroundImage image = style.getProperty("background-image", index);
    if (image == CSSProperty.BackgroundImage.uri) { //if the image is specified by its url
        TermURI urlstring = style.getValue(TermURI.class, "background-image", index);
        //... do something with the image url
    }
}

```

See the details in the [documentation](http://cssbox.sourceforge.net/jstyleparser/manual.php#dom).

Gradle and Jitpack support
--------------------------

This project now supports Gradle and Jitpack. After making a change, create a new release using the x.x.x format
(See: https://docs.github.com/en/repositories/releasing-projects-on-github/managing-releases-in-a-repository)

If using in conjunction with CSSBox, you will then also need to update CSSBox's build.gradle.kts file and increment the version of jStyleParser
with the new version number.

ANTLR4 File generation
--------------------------

jStyleParser uses pre-generated ANTLR4 files. If any changes are made to any .g4 files, these files will need to be re-generated.

To do so, use ANTRL4 version 4.13.2 for compatibility. Inside of any folder containing CSSLexer.g4 and CSSParser.g4 (these files can be found in src/main/antlr4/cz/vutbr/web/csskit/antlr4/)
and the antlr-4.13.2-complete.jar file, use the following commands in this order:
```
Java -jar antlr-4.13.2-complete.jar CSSLexer.g4
Java -jar antlr-4.13.2-complete.jar CSSParser.g4 -visitor
```
This should generate 8 files. Place these files in src/main/java/cz/vutbr/web/csskit/antlr4/
At the top of each of the generated .java files, write the following package information if not already present:
```
package cz.vutbr.web.csskit.antlr4;
```

License
-------

All the source code of jStyleParser itself is licensed under the GNU Lesser General
Public License (LGPL), version 3. A copy of the LGPL can be found 
in the LICENSE file.
