package lsp.printercontex

import lsp.dao.Person
import lsp.printer.PersonPrinter


interface PersonPrinterContext {

    List<Person> getPersons()

    PersonPrinter getPrinter()
}