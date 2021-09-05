package isp.printercontex

import isp.dao.Person
import isp.printer.PersonPrinter


interface PersonPrinterContext {

    List<Person> getPersons()

    PersonPrinter getPrinter()
}