package isp.printercontex

import isp.dao.FamousPerson
import isp.dao.PublicPerson
import isp.printer.FamousPersonPrinter
import isp.printer.PublicPersonPrinter
import isp.xlsx.XlsToFamousPersonParser


class FamousPersonPrinterContext implements PersonPrinterContext {

    private String XLS_PATH = "isp/src/main/resources/Celebrities.xls"

    private XlsToFamousPersonParser parser
    private List<FamousPerson> persons
    private FamousPersonPrinter printer

    FamousPersonPrinterContext(String XLS_PATH) {
        this.XLS_PATH = XLS_PATH
        initialize()
    }

    FamousPersonPrinterContext() {
        initialize()
    }

    private initialize() {
        parser = new XlsToFamousPersonParser()
        persons = new ArrayList<FamousPerson>()
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
        printer = new FamousPersonPrinter(persons)
        println("Printer initialized")
    }

    @Override
    List<PublicPerson> getPersons() {
        return new ArrayList<FamousPerson>(persons)
    }

    @Override
    PublicPersonPrinter getPrinter() {
        return printer
    }
}
