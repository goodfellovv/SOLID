package lsp.printer

import lsp.dao.PublicPerson

abstract class PublicPersonPrinter implements PersonPrinter {
    protected List<PublicPerson> persons

    void printPerson(int index) {
        println "$index: ${personToString(persons.get(index))}"
    }

    void printFullName(int index) {
        println " $index: ${persons.get(index)?.firstName} ${persons.get(index)?.lastName}"
    }

    @Override
    void printPersonsCount() {
        println(persons.size())
    }

    @Override
    void printAllPersons() {
        persons.eachWithIndex { person, index ->
            println("$index" + ":" + personToString(person) + " Who are you? - ${person.whoAmI()}")
        }
    }

    abstract protected String personToString(PublicPerson person)
}