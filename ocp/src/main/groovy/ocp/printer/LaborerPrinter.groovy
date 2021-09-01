package ocp.printer

import ocp.dao.Person

class LaborerPrinter implements PersonPrinter {
    private List<Person> persons

    LaborerPrinter(List<Person> persons) {
        println("Laborer list contains ${persons.size()} persons")
        this.persons = persons
    }

    void printPersonsCount() {
        println("Print laborer count ${persons.size()}")
    }

    void printPerson(int index) {
        println("Laborer by index $index: ${personToString(persons.get(index))}")
    }

    void printFullName(int index) {
        println("Full laborer name by index $index: ${persons.get(index).getFirstName()} ${persons.get(index).getLastName()}")
    }

    void printAllPersons() {
        println("All laborer: ")
        persons.eachWithIndex { person, index ->
            println("$index" + ":" + personToString(person))
        }
    }

    private String personToString(Person person) {
        String stringPerson =
                "Laborer - |" +
                        " First name: ${person.getFirstName()}" +
                        "; Last name: ${person.getLastName()}" +
                        "; Age: ${person.getAge()}" +
                        "; Gender: ${person.getGender()}" +
                        " |"
        return stringPerson
    }
}
