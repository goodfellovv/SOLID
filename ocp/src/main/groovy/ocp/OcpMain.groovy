package ocp


import ocp.printer.PersonPrinter
import ocp.printercontex.FamousPersonPrinterContext
import ocp.printercontex.LaborerPrinterContext
import ocp.printercontex.PersonPrinterContext

class OcpMain {
    static void main(String[] args) {
        println "********* Start Main *********"
        try {
            if (args[0] == "1") {
                println "********* Execute famous person printing *********"
                execute(new FamousPersonPrinterContext())
            } else if (args[0] == "2") {
                println "********* Execute laborer printing *********"
                execute(new LaborerPrinterContext())
            } else {
                println "********* Person type not set *********"
                throw new Exception()
            }
        } catch (Exception e) {
            e.printStackTrace()
        }

        println "********* Stop Main *********"
    }

    static execute(PersonPrinterContext printerContext) {
        PersonPrinter printer = printerContext.getPrinter()
        printer.printPersonsCount()
        printerContext.getPersons().eachWithIndex { person, index ->
            printer.printFullName(index)
            printer.printPerson(index)
        }
        printer.printAllPersons()
    }
}
