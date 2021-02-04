package com.esentri.order.excel.generator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ExcelGenerator {

    private static final Logger logger = LoggerFactory.getLogger(ExcelGenerator.class);

    public static void main(String... args) {
        final OrderExcel orderExcel = new OrderExcel();
        try {
            orderExcel.createExcel();
        } catch (IOException e) {
            logger.error("Es gab einen Fehler beim Schreiben der Excel.", e);
        }
    }

}
