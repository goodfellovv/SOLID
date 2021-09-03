package lsp.xlsx

import lsp.dao.Person

interface XlsToPersonParser {
    List<Person> parsePerson(String path)
}