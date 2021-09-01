package ocp.xlsx

import ocp.dao.Person

interface XlsToPersonParser {
    List<Person> parsePerson(String path)
}