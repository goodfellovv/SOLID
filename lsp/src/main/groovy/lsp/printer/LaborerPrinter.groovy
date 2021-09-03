package lsp.printer

import lsp.dao.PublicPerson

class LaborerPrinter extends PublicPersonPrinter implements PersonPrinter {

    LaborerPrinter(List<PublicPerson> persons) {
        println("Laborer list contains ${persons.size()} persons")
        super.persons = persons
    }

    @Override
    void printPersonsCount() {
        print("Laborer count ")
        super.printPersonsCount()
    }

    @Override
    void printPerson(int index) {
        print("Laborer by index ")
        super.printPerson(index)
    }

    @Override
    void printFullName(int index) {
        print("Full laborer name by index ")
        super.printFullName(index)
    }

    @Override
    void printAllPersons() {
        println("All laborer: ")
        super.printAllPersons()
    }

    @Override
    protected String personToString(PublicPerson person) {
        String stringPerson =
                "Laborer - |" +
                        " First name: ${person?.firstName}" +
                        "; Last name: ${person?.lastName}" +
                        "; Age: ${person?.age}" +
                        "; Gender: ${person?.gender}" +
                        " |"
        return stringPerson
    }
}
