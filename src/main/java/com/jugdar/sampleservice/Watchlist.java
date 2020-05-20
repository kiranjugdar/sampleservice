package com.jugdar.sampleservice;

public class Watchlist {

    private String name;
    private int displayOrder;

    @Override
    public String toString() {
        return "Watchlist{" +
                "name='" + name + '\'' +
                ", displayOrder=" + displayOrder +
                '}';
    }

    public Watchlist(String name, int displayOrder) {
        this.name = name;
        this.displayOrder = displayOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }
}
