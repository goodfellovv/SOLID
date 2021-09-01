package ocp.printer


import ocp.dao.Person

class FamousPersonPrinter implements PersonPrinter {
    private List<Person> persons

    FamousPersonPrinter(List<Person> persons) {
        println("Famous persons list contains ${persons.size()} persons")
        this.persons = persons
    }

    void printPersonsCount() {
        println("Print famous persons count ${persons.size()}")
    }

    void printPerson(int index) {
        println("Famous person by index $index: ${personToString(persons.get(index))}")
    }

    void printFullName(int index) {
        println("Full famous person name by index $index: ${persons.get(index).getFirstName()} ${persons.get(index).getLastName()}")
    }

    void printAllPersons() {
        println("All famous persons: ")
        persons.eachWithIndex { person, index ->
            println("$index" + ":" + personToString(person))
        }
    }

    private String personToString(Person person) {
        String stringPerson =
                "Famous person - |" +
                        " First name: ${person.getFirstName()}" +
                        "; Last name: ${person.getLastName()}" +
                        "; Age: ${person.getAge()}" +
                        "; Gender: ${person.getGender()}" +
                        " |"
        return stringPerson
    }
}
