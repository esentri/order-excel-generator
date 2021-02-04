package com.esentri.order.excel.generator;

enum Department {

    IT("IT Abteilung"),
    SALES("Vertrieb"),
    MARKETING("Marketing"),
    HR("Personal"),
    PRODUCTMANAGEMENT("Produktmanagement"),
    CONTROLLING("Controlling");

    private final String name;

    Department(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

}
