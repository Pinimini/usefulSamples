package org.example.creational.builder.website;


public class Website {
    public Website() {
    }

    public Website(String name, Cms cms, int price) {
        this.name = name;
        this.cms = cms;
        this.price = price;
    }

    private String name;
    private Cms cms;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", price=" + price +
                '}';
    }
}
