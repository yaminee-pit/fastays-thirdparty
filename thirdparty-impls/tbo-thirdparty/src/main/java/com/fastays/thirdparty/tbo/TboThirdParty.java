package com.fastays.thirdparty.tbo;

import com.fastays.thirdparty.api.ThirdParty;
import com.fastays.thirdparty.api.bus.BusSearchService;
import com.fastays.thirdparty.api.city.CitySearchService;
import com.fastays.thirdparty.api.flight.FlightSearchService;
import com.fastays.thirdparty.api.hotel.HotelSearchService;
import com.fastays.thirdparty.tbo.bus.TboBusSearchService;
import com.fastays.thirdparty.tbo.city.TboCitySearchService;

import java.util.Optional;

public class TboThirdParty implements ThirdParty {

    @Override
    public Optional<BusSearchService> getBusSearchService() {
        return Optional.of(new TboBusSearchService());
    }

    @Override
    public Optional<CitySearchService> getCitySearchService() {
        return  Optional.of(new TboCitySearchService());
    }


    @Override
    public Optional<HotelSearchService> getHotelSearchService() {
        return Optional.empty();
    }

    @Override
    public Optional<FlightSearchService> getFlightSearchService() {
        return Optional.empty();
    }


}
