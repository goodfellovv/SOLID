package lsp.printer

import lsp.dao.Person

class SecretPersonPrinter implements PersonPrinter {
    private List<Person> persons

    SecretPersonPrinter(List<Person> persons) {
        println("Secret persons list contains ${persons.size()} persons")
        this.persons = persons
    }

    @Override
    void printPersonsCount() {
        println("Secret persons count ${persons.size()}")
    }

    @Override
    void printAllPersons() {
        println("All secret persons: ")
        persons.eachWithIndex { person, index ->
            println("$index" + ":" + person.toString())
        }
    }
}
