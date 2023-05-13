package org.example.structural.bridge.developers;

public class ProgramCreator {

    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program p :
                programs) {
            p.developProgram();
        }
    }
}
