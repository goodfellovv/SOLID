package isp.xlsx

import isp.dao.FamousPerson
import isp.dao.PublicPerson

class XlsToFamousPersonParser implements XlsToPersonParser {

    @Override
    List<PublicPerson> parsePerson(String path) {
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
