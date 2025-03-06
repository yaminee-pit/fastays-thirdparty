package com.fastays.thirdparty.api.bus.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class BusSearchRequest {
    private String dateOfJourney;
    private String destinationCityId;
    private String originCityId;
    private String preferredCurrency;
}