package org.example.creational.prototype.vcs;

public class VersionControlRunner {

    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", new SourceCode("SuperSourceCode"));
        System.out.println("master: " + master);

        //Создание копии с приведением типов (плохой вариант)
        Project bugfix = (Project) master.copy();
        System.out.println("bugfix: " + bugfix);

        //Создание копии с применением фабрики
        ProjectFactory projectFactory = new ProjectFactory(master);
        Project feature = projectFactory.cloneProject();
        System.out.println("feature: " + feature);
    }
}
