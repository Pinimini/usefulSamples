package org.example.creational.builder.website;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder {
    @Override
    WebSiteBuilder buildName() {
        website.setName("EnterPrise web site");
        return this;
    }

    @Override
    WebSiteBuilder buildCms() {
        website.setCms(Cms.ALIFRESCO);
        return this;
    }

    @Override
    WebSiteBuilder buildPrice() {
        website.setPrice(10000);
        return this;
    }
}
