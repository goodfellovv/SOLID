package srp

import srp.dao.Person
import srp.printer.PersonPrinter
import srp.xlsx.XlsToPersonParser


class PrinterContext {

    private String XLS_PATH = "srp/src/main/resources/Source.xls"

    private XlsToPersonParser parser;
    private List<Person> persons;
    private PersonPrinter printer;

    PrinterContext(String XLS_PATH) {
        this.XLS_PATH = XLS_PATH
        initialize()
    }

    PrinterContext() {
        initialize()
    }

    private initialize() {
        parser = new XlsToPersonParser()
        persons = new ArrayList<Person>()
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
        printer = new PersonPrinter(persons)
        println("Printer initialized")
    }

    List<Person> getPersons() {
        return new ArrayList<Person>(persons)
    }

    PersonPrinter getPrinter() {
        return printer
    }
}
