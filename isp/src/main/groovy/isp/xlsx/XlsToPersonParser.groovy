package isp.xlsx

import isp.dao.Person

interface XlsToPersonParser {
    List<Person> parsePerson(String path)
}