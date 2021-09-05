package isp

import isp.printer.AnonymousPersonPrinter
import isp.printer.PublicPersonPrinter
import isp.printercontex.FamousPersonPrinterContext
import isp.printercontex.PersonPrinterContext
import isp.printercontex.SecretPersonPrinterContext

class IspMain {
    static void main(String[] args) {
        println "********* Start Main *********"
        try {
            if (args[0] == "1") {
                println "********* Execute famous person printing *********"
                executePublic(new FamousPersonPrinterContext())
            } else if (args[0] == "2") {
                println "********* Execute secret person printing *********"
                executeSecret(new SecretPersonPrinterContext())
            } else {
                throw new Exception()
            }
        } catch (Exception e) {
            println "********* Person type not set *********"
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
        AnonymousPersonPrinter printer = printerContext.getPrinter() as AnonymousPersonPrinter
        printer.printPersonsCount()
        printerContext.getPersons().eachWithIndex { person, index ->
            printer.printJob(index)
        }
        printer.printAllPersons()
    }
}
