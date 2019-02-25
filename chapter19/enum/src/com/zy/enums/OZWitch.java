package com.zy.enums;

public enum OZWitch {
    WEST("WEST"),
    NORTH("NORTH"),
    EAST("EAST"),
    SOUTH("SOUTH");
    private String description;
    private OZWitch(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public static void main(String[] args) {
        for (OZWitch oz : OZWitch.values()) {
            System.out.println(oz + ":" + oz.getDescription());
        }
    }
}
