package isp.xlsx

import isp.dao.SecretPerson

class XlsToSecretPersonParser implements XlsToPersonParser {
    @Override
    List<SecretPerson> parsePerson(String path) {
        println("Parsing persons from: $path")
        List<SecretPerson> persons = new ArrayList<>()
        new ExcelBuilder(path).eachLine([labels: true]) {
            persons.add(new SecretPerson(
                    age: delegate.'Age',
                    gender: (delegate.'Gender').toUpperCase(),
                    job: (delegate.'Job').toUpperCase()
            ))
        }
        println("Parsed ${persons.size()} persons")
        return persons
    }
}
