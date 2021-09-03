package ocp.xlsx

import ocp.dao.FamousPerson

class XlsToFamousPersonParser implements XlsToPersonParser {

    @Override
    List<FamousPerson> parsePerson(String path) {
        println("Parsing persons from: $path")
        List<FamousPerson> persons = new ArrayList<>()
        new ExcelBuilder(path).eachLine([labels: true]) {
            persons.add(new FamousPerson(
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
