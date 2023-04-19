package org.example.creational.factorymethod.developerfactory;

public class Programm {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpecialty("cpp");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
