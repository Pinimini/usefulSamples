package org.example.creational.builder.website;

public class VisitCardWebsuteBuilder extends WebSiteBuilder {

    @Override
    WebSiteBuilder buildName() {
        website.setName("Visit card");
        return this;
    }

    @Override
    WebSiteBuilder buildCms() {
        website.setCms(Cms.WORDPRESS);
        return this;
    }

    @Override
    WebSiteBuilder buildPrice() {
        website.setPrice(500);
        return this;
    }

}
