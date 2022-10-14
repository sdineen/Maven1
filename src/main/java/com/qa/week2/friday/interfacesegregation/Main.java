package com.qa.week2.friday.interfacesegregation;

public class Main {

	public static void main(String[] args) {
		Converter converter = new ConverterImpl();
		converter.CsvToExcel();

	}

}
