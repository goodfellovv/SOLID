package isp.printercontex

import isp.dao.AnonymousPerson
import isp.dao.SecretPerson
import isp.printer.AnonymousPersonPrinter
import isp.printer.SecretPersonPrinter
import isp.xlsx.XlsToSecretPersonParser

class SecretPersonPrinterContext implements PersonPrinterContext {
    private String XLS_PATH = "isp/src/main/resources/SecretPersons.xls"

    private XlsToSecretPersonParser parser
    private List<SecretPerson> persons
    private SecretPersonPrinter printer

    SecretPersonPrinterContext(String XLS_PATH) {
        this.XLS_PATH = XLS_PATH
        initialize()
    }

    SecretPersonPrinterContext() {
        initialize()
    }

    private initialize() {
        parser = new XlsToSecretPersonParser()
        persons = new ArrayList<SecretPerson>()
        loadPersons()
        initializePrinter()
    }

    private void loadPersons() {
        println("Run parsing process")
        persons = parser.parsePerson(XLS_PATH)
        println("Parsing finished")
    }

    private void initializePrinter() {
        println("Initialize printer")
        printer = new SecretPersonPrinter(persons)
        println("Printer initialized")
    }

    @Override
    List<AnonymousPerson> getPersons() {
        return new ArrayList<SecretPerson>(persons)
    }

    @Override
    AnonymousPersonPrinter getPrinter() {
        return printer
    }
}
