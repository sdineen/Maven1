package com.qa.week2.friday.interfacesegregation;

public interface SpreadsheetConverter extends ExcelToCsvConverter, CsvToExcelConverter {

	Pdf ExcelToPdf() throws UnsupportedOperationException;

	Pdf CsvToPdf() throws UnsupportedOperationException;

}