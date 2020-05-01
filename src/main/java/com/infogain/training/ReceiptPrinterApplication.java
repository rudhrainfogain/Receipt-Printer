package com.infogain.training;

import com.infogain.training.dto.Barcode;
import com.infogain.training.dto.Image;
import com.infogain.training.dto.ReceiptText;
import com.infogain.training.service.ReceiptPrinterService;
import com.infogain.training.utilities.ReceiptPrinterUtility;

import jpos.POSPrinter;

public class ReceiptPrinterApplication {

	public static void main(String[] args) {
		POSPrinter posPrinter = null;
		try {
			ReceiptPrinterUtility receiptPrinterUtility = new ReceiptPrinterUtility();
			posPrinter = receiptPrinterUtility.getPrinter("TM-T88VWin10EpsonPrinter");
			ReceiptText  receiptText = new ReceiptText("Store number : 12345", "left");
			ReceiptPrinterService receiptPrinterService = new ReceiptPrinterService();
			receiptPrinterService.printReceiptLogo(posPrinter, new Image("left", "D:\\fedexPOCs\\receipt-printer-poc\\src\\main\\resources\\static\\logo.jpg"));
			receiptPrinterService.printReceiptLogo(posPrinter, new Image("left", "D:\\fedexPOCs\\receipt-printer-poc\\src\\main\\resources\\static\\logo.jpg"));
			receiptPrinterService.cutReceiptPaper(posPrinter);
			receiptPrinterService.printReceiptLogo(posPrinter, new Image("left", "D:\\fedexPOCs\\receipt-printer-poc\\src\\main\\resources\\static\\logo.jpg"));
			receiptPrinterService.printReceiptBarcode(posPrinter, new Barcode("1234567", "Code39", 100, 100, "Below", "Right"));
			receiptPrinterService.printReceiptBarcode(posPrinter, new Barcode("1234567", "Code39", 100, 100, "Below", "Right"));
			receiptPrinterService.cutReceiptPaper(posPrinter);
			receiptPrinterService.printReceiptBarcode(posPrinter, new Barcode("1234567", "Code39", 100, 100, "Below", "Right"));
			receiptPrinterService.printReceiptText(posPrinter, receiptText.getText());
			receiptPrinterService.printReceiptText(posPrinter, receiptText.getText());
			receiptPrinterService.printReceiptText(posPrinter, receiptText.getText());
			receiptPrinterService.printReceiptText(posPrinter, receiptText.getText());
			receiptPrinterService.printReceiptText(posPrinter, receiptText.getText());
			receiptPrinterService.printReceiptText(posPrinter, receiptText.getText());
			receiptPrinterService.cutReceiptPaper(posPrinter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				posPrinter.release();
				posPrinter.close();
			} catch (Exception e) {
			}
		}
		
		
		
	}
}
