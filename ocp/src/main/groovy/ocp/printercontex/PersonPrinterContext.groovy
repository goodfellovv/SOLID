package ocp.printercontex

import ocp.dao.Person
import ocp.printer.PersonPrinter

interface PersonPrinterContext {

    List<Person> getPersons()

    PersonPrinter getPrinter()
}