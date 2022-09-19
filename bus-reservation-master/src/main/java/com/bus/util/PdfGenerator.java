package com.bus.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.bus.entities.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PdfGenerator {

	public void generateItinerary(Reservation reservation, String filePath) {
		
		Document document = new Document();
		
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			
			document.open();

			document.add(generateTable(reservation));
			
			document.close();
			
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
	}

	private PdfPTable generateTable(Reservation reservation) {
		PdfPTable table = new PdfPTable(2);
		
		PdfPCell cell;
		
		cell = new PdfPCell(new Phrase("Bus Itinerary:"));
		cell.setColspan(2);
		table.addCell(cell);
		
		cell = new PdfPCell(new Phrase("Trip Details"));
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("Bus Company");
		table.addCell(reservation.getBus().getBusCompany());
		
		table.addCell("Departure City");
		table.addCell(reservation.getBus().getDepartureCity());
		
		table.addCell("Arrival City");
		table.addCell(reservation.getBus().getArrivalCity());
		
		table.addCell("Bus Number");
		table.addCell(reservation.getBus().getBusNumber());
		
		table.addCell("Departure Date");
		table.addCell(reservation.getBus().getDateOfDeparture().toString());
		
		table.addCell("Departure Time");
		table.addCell(reservation.getBus().getEstimatedDepartureTime().toString());
		
		cell = new PdfPCell(new Phrase("Passenger Details"));
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("First Name");
		table.addCell(reservation.getPassenger().getFirstName());
		
		table.addCell("Last Name");
		table.addCell(reservation.getPassenger().getLastName());
		
		table.addCell("Email");
		table.addCell(reservation.getPassenger().getEmail());
		
		table.addCell("Phone");
		table.addCell(reservation.getPassenger().getPhone());
		
		return table;
	}
}
