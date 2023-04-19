package org.example.creational.builder.website;

public abstract class WebSiteBuilder {
   Website website;

    WebSiteBuilder createWebsite() {
       website = new Website();
       return this;
   }

   abstract WebSiteBuilder buildName();
   abstract WebSiteBuilder buildCms();
   abstract WebSiteBuilder buildPrice();

   Website getWebsite() {
       return website;
   }
}
