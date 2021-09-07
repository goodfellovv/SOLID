package dip

import dip.dao.Person
import dip.printer.PersonPrinter
import dip.printer.Printer
import dip.xlsx.XlsToPersonParser

class DipMain {
    static void main(String[] args) {
        println "********* Start Main *********"
        List<Person> persons = XlsToPersonParser.parsePerson("dip/src/main/resources/Persons.xls")
        Printer printer = new PersonPrinter()
        printer.setPersons(persons)
        printer.printPersonsCount()
        persons.eachWithIndex { person, index ->
            printer.printFullName(index)
            printer.printPerson(index)
        }
        printer.printAllPersons()
        println "********* Stop Main *********"
    }
}
