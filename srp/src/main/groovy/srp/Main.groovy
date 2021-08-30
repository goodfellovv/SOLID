package srp

import srp.printer.PersonPrinter

class Main {
    static void main(String[] args) {
        println "********* Start Main *********"
        PrinterContext printerContext = new PrinterContext();
        PersonPrinter printer = printerContext.getPrinter();
        printer.printPersonsCount()
        printerContext.getPersons().eachWithIndex { person, index ->
            printer.printFullName(index)
            printer.printPerson(index)
        }
        printer.printAllPersons()
        println "********* Stop Main *********"
    }
}
