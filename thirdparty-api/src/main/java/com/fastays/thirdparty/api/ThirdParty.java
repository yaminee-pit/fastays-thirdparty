package com.fastays.thirdparty.api;

import com.fastays.thirdparty.api.bus.BusSearchService;
import com.fastays.thirdparty.api.city.CitySearchService;
import com.fastays.thirdparty.api.flight.FlightSearchService;
import com.fastays.thirdparty.api.hotel.HotelSearchService;

import java.util.Optional;

public interface ThirdParty {

    Optional<BusSearchService> getBusSearchService();
    Optional<HotelSearchService> getHotelSearchService();
    Optional<FlightSearchService> getFlightSearchService();
    Optional<CitySearchService> getCitySearchService();

}
