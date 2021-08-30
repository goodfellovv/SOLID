package srp.xlsx

import srp.dao.Person

class XlsToPersonParser {

    List<Person> parsePerson(String path) {
        println("Parsing persons from: $path")
        List<Person> persons = new ArrayList<>();
        new ExcelBuilder(path).eachLine([labels: true]) {
            persons.add(new Person(
                    firstName: delegate.'First name',
                    lastName: delegate.'Last name',
                    age: delegate.'Age',
                    gender: (delegate.'Gender').toUpperCase()
            ))
        }
        println("Parsed ${persons.size()} persons")
        return persons;
    }
}
