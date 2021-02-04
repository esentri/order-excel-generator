package com.esentri.order.excel.generator;

enum Company {

    TECICON("Tecicon"),
    DONTON("Donton"),
    TUMTUM("TumTum"),
    YAM("yam"),
    LANGINC("Lang Inc."),
    BERND("Bernd");

    private final String name;

    Company(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
