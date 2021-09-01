package ocp.printercontex


import ocp.dao.Laborer
import ocp.printer.LaborerPrinter
import ocp.xlsx.XlsToLaborerParser

class LaborerPrinterContext implements PersonPrinterContext {

    private String XLS_PATH = "ocp/src/main/resources/Laborers.xls"

    private XlsToLaborerParser parser
    private List<Laborer> persons
    private LaborerPrinter printer

    LaborerPrinterContext(String XLS_PATH) {
        this.XLS_PATH = XLS_PATH
        initialize()
    }

    LaborerPrinterContext() {
        initialize()
    }

    private initialize() {
        parser = new XlsToLaborerParser()
        persons = new ArrayList<Laborer>()
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
        printer = new LaborerPrinter(persons)
        println("Printer initialized")
    }

    List<Laborer> getPersons() {
        return new ArrayList<Laborer>(persons)
    }

    LaborerPrinter getPrinter() {
        return printer
    }
}
