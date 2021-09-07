package dip.xlsx

import dip.dao.PersonImp

class XlsToPersonParser {

    static List<PersonImp> parsePerson(String path) {
        println("Parsing persons from: $path")
        List<PersonImp> persons = new ArrayList<>()
        new ExcelBuilder(path).eachLine([labels: true]) {
            persons.add(new PersonImp(
                    firstName: delegate.'First name',
                    lastName: delegate.'Last name',
                    age: delegate.'Age',
                    gender: (delegate.'Gender').toUpperCase()
            ))
        }
        println("Parsed ${persons.size()} persons")
        return persons
    }
}
