package lsp.printercontex

import lsp.dao.SecretPerson
import lsp.printer.SecretPersonPrinter
import lsp.xlsx.XlsToSecretPersonParser

class SecretPersonPrinterContext implements PersonPrinterContext {
    private String XLS_PATH = "lsp/src/main/resources/SecretPersons.xls"

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
    List<SecretPerson> getPersons() {
        return new ArrayList<SecretPerson>(persons)
    }

    @Override
    SecretPersonPrinter getPrinter() {
        return printer
    }
}
