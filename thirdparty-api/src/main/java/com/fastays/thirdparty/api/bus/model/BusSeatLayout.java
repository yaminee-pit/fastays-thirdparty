package com.fastays.thirdparty.api.bus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusSeatLayout {
	private String availableSeats;
	private int noOfColumns;
	private int noOfRows;
	private List<List<SeatDetails>> seatDetails;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class SeatDetails {

		private String columnNo;
		private int height;
		private boolean isLadiesSeat;
		private boolean isMalesSeat;
		private boolean isUpper;
		private String rowNo;
		private double seatFare;
		private int seatIndex;
		private String seatName;
		private boolean seatStatus;
		private int seatType;
		private int width;
		private double publishedPrice;
		private double offeredPrice;
	}
}
