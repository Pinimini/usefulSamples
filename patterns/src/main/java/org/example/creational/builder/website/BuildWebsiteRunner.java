package org.example.creational.builder.website;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsuteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
