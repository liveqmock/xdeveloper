package jjwu.xdeveloper.app.xml.unit;

public class TestAccountHistoryXMLMapping {

	public static void main(String[] args) {
		System.out.println("Test for the BeanXMLMapping component.");
		System.out.println();
		try {
			AccountHistory accountHistory = new AccountHistory("testing");

			System.out.println("Test 1: from JavaBean to XML");
			System.out.println("Below is the XML for the AccountHistory JavaBean. ");
			System.out.println("This XML is generated by invoking accountHistory.toXML()");
			System.out.println();

			System.out.println(accountHistory.toXML());

			String xmlStr = accountHistory.getAccountHistoryContext().toXML();

			System.out.println();
			System.out.println("Test 2: from XML to JavaBean");
			System.out.println();

			System.out.println("Test 2 part1. Generating the original XML");
			System.out.println("Below is the XML for the AccountHistoryContext JavaBean. ");
			System.out.println("This XML is generated by invoking accountHistory.getAccountHistoryContext().toXML()");
			System.out.println();

			System.out.println(xmlStr);

			AccountHistoryContext accountHistoryContext = (AccountHistoryContext) AccountHistoryContext.fromXML(xmlStr);

			System.out.println();
			System.out.println("Test 2 part2. Obtaining the JavaBean for the XML. ");
			System.out.println("The JavaBean is obtained and then its XML is printed out for verification.");
			System.out
					.println("The bean is obtained by the code (AccountHistoryContext) AccountHistoryContext.fromXML(xmlStr)");
			System.out.println();

			System.out.println(accountHistoryContext.toXML());

		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}
