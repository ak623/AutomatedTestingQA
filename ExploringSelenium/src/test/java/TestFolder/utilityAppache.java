package TestFolder;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class utilityAppache {


    //This method is to write in the Excel cell, Row num and Col num are the parameters

    public static void setCellData(String Result,  int RowNum, int ColNum, String Path, String doc, XSSFSheet ExcelWSheet, XSSFWorkbook ExcelWBook, XSSFCell Cell, XSSFRow row) throws Exception	{

        try{

            row  = ExcelWSheet.getRow(RowNum);

            Cell = row.getCell(ColNum);

            if (Cell == null) {

                Cell = row.createCell(ColNum);

                Cell.setCellValue(Result);

            } else {

                Cell.setCellValue(Result);

            }

            // Constant variables Test Data path and Test Data file name

            FileOutputStream fileOut = new FileOutputStream(Path + doc);

            ExcelWBook.write(fileOut);

            fileOut.flush();

            fileOut.close();

        }catch(Exception e){

            throw (e);

        }

    }
}
