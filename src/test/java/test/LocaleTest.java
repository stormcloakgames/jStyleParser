package test;

import java.io.IOException;
import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import cz.vutbr.web.css.CSSException;
import cz.vutbr.web.css.CSSFactory;
import cz.vutbr.web.css.NodeData;
import cz.vutbr.web.css.StyleSheet;
import cz.vutbr.web.css.TermColor;
import cz.vutbr.web.css.TermFactory;
import cz.vutbr.web.css.TermList;
import cz.vutbr.web.domassign.Analyzer;
import cz.vutbr.web.domassign.StyleMap;

public class LocaleTest {

	private static TermFactory tf = CSSFactory.getTermFactory();

	private static Document doc;
	private static StyleSheet sheet;
	private static Analyzer analyzer;
	private static ElementMap elements;
	private static StyleMap decl;

	@Test
	public void init() throws IOException, CSSException, SAXException {

		Locale.setDefault(new Locale("tr", "TR"));
		
        DOMSource ds = new DOMSource(AdvancedCSSTest.class.getResourceAsStream("/advanced/style.html"));
        doc = ds.parse();

		sheet = CSSFactory.parse(AdvancedCSSTest.class.getResource("/advanced/style.css"), null);

		analyzer = new Analyzer(sheet);
		decl = analyzer.evaluateDOM(doc, "all", true);

		elements = new ElementMap(doc);


		Element bp = elements.getElementById("bp");

		Assert.assertNotNull("Element bp exists", bp);

		NodeData data = decl.get(bp);

		Assert.assertNotNull("Data for #bp exist", data);


		Assert.assertEquals("Background position is list of two", 2, data
				.getValue(TermList.class, "background-position", 0).size());

		Assert.assertEquals(tf.createPercent(100.0f), data.getValue(
				TermList.class, "background-position", 0).get(0));
		Assert.assertEquals(tf.createPercent(50.0f), data.getValue(
				TermList.class, "background-position", 0).get(1));
		Assert.assertEquals(tf.createColor(255, 255, 255), data.getValue(
				TermColor.class, "color"));

	}


}
