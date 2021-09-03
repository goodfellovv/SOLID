package lsp

import lsp.printer.PersonPrinter
import lsp.printer.PublicPersonPrinter
import lsp.printercontex.FamousPersonPrinterContext
import lsp.printercontex.LaborerPrinterContext
import lsp.printercontex.PersonPrinterContext
import lsp.printercontex.SecretPersonPrinterContext

class LspMain {
    static void main(String[] args) {
        println "********* Start Main *********"
        try {
            if (args[0] == "1") {
                println "********* Execute famous person printing *********"
                executePublic(new FamousPersonPrinterContext())
            } else if (args[0] == "2") {
                println "********* Execute laborer printing *********"
                executePublic(new LaborerPrinterContext())
            } else if (args[0] == "3") {
                println "********* Execute secret person printing *********"
                executeSecret(new SecretPersonPrinterContext())
            } else {
                println "********* Person type not set *********"
                throw new Exception()
            }
        } catch (Exception e) {
            e.printStackTrace()
        }

        println "********* Stop Main *********"
    }

    static executePublic(PersonPrinterContext printerContext) {
        PublicPersonPrinter printer = printerContext.getPrinter() as PublicPersonPrinter
        printer.printPersonsCount()
        printerContext.getPersons().eachWithIndex { person, index ->
            printer.printFullName(index)
            printer.printPerson(index)
        }
        printer.printAllPersons()
    }

    static executeSecret(PersonPrinterContext printerContext) {
        PersonPrinter printer = printerContext.getPrinter()
        printer.printPersonsCount()
        printer.printAllPersons()
    }
}
