package org.example.creational.builder.website;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite() {
        builder.createWebsite()
                .buildName()
                .buildCms()
                .buildPrice();

        return builder.getWebsite();
    }

    Website buildWebsiteWithoutCms() {
        builder.createWebsite()
                .buildName()
                .buildPrice();

        return builder.getWebsite();
    }
}
