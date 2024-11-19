package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtility {

    public static String testDataHandler(String dataName) throws IOException {
        String data = "";
        int firstRow = 0;
        int secondRow = 1;
        String excelFilePath = "testData.xlsx";

        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Row rowForHeader = sheet.getRow(firstRow);

        for (int i = 0; i < rowForHeader.getLastCellNum(); i++) {
            if (rowForHeader.getCell(i).getStringCellValue().equals(dataName)) {
                Row rowForValue = sheet.getRow(secondRow);
                data = rowForValue.getCell(i).getStringCellValue();
            }
        }

        return data.toString();
    }
}
