package lsp.xlsx

import lsp.dao.Laborer

class XlsToLaborerParser implements XlsToPersonParser {

    @Override
    List<Laborer> parsePerson(String path) {
        println("Parsing persons from: $path")
        List<Laborer> persons = new ArrayList<>()
        new ExcelBuilder(path).eachLine([labels: true]) {
            persons.add(new Laborer(
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