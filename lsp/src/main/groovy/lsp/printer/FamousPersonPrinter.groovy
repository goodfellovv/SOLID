package lsp.printer

import lsp.dao.PublicPerson

class FamousPersonPrinter extends PublicPersonPrinter implements PersonPrinter {
    FamousPersonPrinter(List<PublicPerson> persons) {
        println("Famous persons list contains ${persons.size()} persons")
        super.persons = persons
    }

    @Override
    void printPersonsCount() {
        print("Famous persons count ")
        super.printPersonsCount()
    }

    @Override
    void printPerson(int index) {
        print("Famous person by index ")
        super.printFullName(index)
    }

    @Override
    void printFullName(int index) {
        print("Full famous person name by index ")
        super.printFullName(index)
    }

    @Override
    void printAllPersons() {
        println("All famous persons: ")
        super.printAllPersons()
    }

    @Override
    protected String personToString(PublicPerson person) {
        String stringPerson =
                "Famous person - |" +
                        " First name: ${person?.firstName}" +
                        "; Last name: ${person?.lastName}" +
                        "; Age: ${person?.age}" +
                        "; Gender: ${person?.gender}" +
                        " |"
        return stringPerson
    }
}
