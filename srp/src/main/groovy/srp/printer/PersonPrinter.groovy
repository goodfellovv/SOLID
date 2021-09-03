package srp.printer

import srp.dao.Person

class PersonPrinter {
    private List<Person> persons

    PersonPrinter(List<Person> persons) {
        println("Persons list contains ${persons.size()} persons")
        this.persons = persons
    }

    void printPersonsCount() {
        println("Print persons count ${persons.size()}")
    }

    void printPerson(int index) {
        println("Person by index $index: ${personToString(persons.get(index))}")
    }

    void printFullName(int index) {
        println("Full person name by index $index: ${persons.get(index)?.firstName} ${persons.get(index)?.lastName}")
    }

    void printAllPersons() {
        println("All persons: ")
        persons.eachWithIndex { person, index ->
            println("$index" + ":" + personToString(person))
        }
    }

    private String personToString(Person person) {
        String stringPerson =
                "Person - |" +
                        " First name: ${person?.firstName}" +
                        "; Last name: ${person?.lastName}" +
                        "; Age: ${person?.age}" +
                        "; Gender: ${person?.gender}" +
                        " |"
        return stringPerson
    }
}
