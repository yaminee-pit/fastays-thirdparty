package com.fastays.thirdparty.api.bus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusSearchResponse {
	private String travelName;
	private String busType;
	private int availableSeats;
	private String departureDate;
	private String departureTime;
	private String departureLocation;
	private String arrivalDate;
	private String arrivalTime;
	private String arrivalLocation;
	private String travelDuration;
	private double publishedPrice;
	private double OfferedPrice;
	private int maxSeatsPerTicket;
	private List<CancellationPolicyDTO> cancellationPolicies;
	private Map<String, Object> immutableData;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class CancellationPolicyDTO {
		private int cancellationCharge;
		private int cancellationChargeType;
		private String policyString;
		private String timeBeforeDept;
		private String fromDate;
		private String toDate;
	}

}




