package dip.printer

import dip.dao.Person

class PersonPrinter implements Printer{
    private List<Person> persons

    void setPersons(List<Person> persons){
        println("Persons list contains ${persons.size()} persons")
        this.persons = persons
    }

    @Override
    void printPersonsCount() {
        println("Print persons count ${persons.size()}")
    }

    @Override
    void printPerson(int index) {
        println("Person by index $index: ${personToString(persons.get(index))}")
    }

    @Override
    void printFullName(int index) {
        println("Full person name by index $index: ${persons.get(index)?.firstName} ${persons.get(index)?.lastName}")
    }

    @Override
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
