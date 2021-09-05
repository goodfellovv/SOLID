package isp.printer

import isp.dao.AnonymousPerson

class SecretPersonPrinter implements AnonymousPersonPrinter {
    private List<AnonymousPerson> persons

    SecretPersonPrinter(List<AnonymousPerson> persons) {
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
            println("$index" + ":" + personToString(person))
        }
    }

    @Override
    void printJob(int index) {
        println("Secret person job by index $index: ${persons.get(index)?.job}")

    }

    private String personToString(AnonymousPerson person) {
        String stringPerson =
                "Secret person - |" +
                        " First name: ********" +
                        "; Last name: ********" +
                        "; Age: ${person.age}" +
                        "; Gender: ${person.gender}" +
                        "; Job: ${person.job}" +
                        " |"
        return stringPerson
    }
}
