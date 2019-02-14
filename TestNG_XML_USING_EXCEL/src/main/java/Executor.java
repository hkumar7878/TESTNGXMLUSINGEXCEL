
public class Executor {

	public static void main(String[] args) {
		XLSReader suite = new XLSReader("D:\\Project Work\\Selenium Automation Framework\\TestNG_XML_USING_EXCEL\\tests.xlsx");
		suite.getTests("select * from TestCase where module='Order'");

	}

}
