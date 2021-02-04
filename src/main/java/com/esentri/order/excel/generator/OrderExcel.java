package com.esentri.order.excel.generator;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

class OrderExcel {

    void createExcel() throws IOException {
        try (
            final Workbook wb = new XSSFWorkbook();
            final FileOutputStream fileOut = new FileOutputStream("order_overview.xlsx")
        ) {
            Sheet sheet = wb.createSheet("Bestellungen");
            Row row = sheet.createRow(0);
            generateCaptions(row, "Firma", "Abteilung", "Artikel", "Menge", "Einzelpreis", "Gesamtpreis");
            generateColumns(sheet);
            wb.write(fileOut);
        }
    }

    private void generateColumns(Sheet sheet) {
        final int entries = RandomDataGenerator.randomPositiveIntInRange(200000, 300000);
        RandomDataGenerator.createRandomOrders(entries).forEach(order -> {
            Row row = sheet.createRow(sheet.getLastRowNum()+1);
            row.createCell(0).setCellValue(order.getCompany().getName());
            row.createCell(1).setCellValue(order.getDepartment().getName());
            row.createCell(2).setCellValue(order.getArticle().getName());
            row.createCell(3).setCellValue(order.getAmount());
        });
    }


    private void generateCaptions(Row captionRow, String... captions) {
        for (int i = 0; i < captions.length; i++) {
            Cell cell = captionRow.createCell( i);
            cell.setCellValue(captions[i]);
        }
    }
}
