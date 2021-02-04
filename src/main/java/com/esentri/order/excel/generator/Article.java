package com.esentri.order.excel.generator;

enum Article {

    TONER("Toner",1, 3),
    PAPER_CLIP("Büroklammern", 1, 10),
    PEN("Stift", 1, 10),
    PAPER("Druckerpapier", 1, 100),
    MARKERS("Whiteboard Marker", 1, 5),
    FOLDER("Ordner", 1, 100);

    private final String name;
    private final int min;
    private final int max;

    Article(String name, int min, int max) {
        this.name = name;
        this.min = min;
        this.max = max;
    }

    String getName() {
        return this.name;
    }

    int getMin() {
        return min;
    }

    int getMax() {
        return max;
    }
}
