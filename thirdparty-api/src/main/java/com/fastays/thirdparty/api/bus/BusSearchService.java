package com.fastays.thirdparty.api.bus;

import com.fastays.thirdparty.api.bus.model.BusSearchRequest;
import com.fastays.thirdparty.api.bus.model.BusSearchResponse;
import com.fastays.thirdparty.api.bus.model.BusSeatLayout;

import java.util.List;
import java.util.Map;

public interface BusSearchService {


    List<BusSearchResponse> getBusSearch(BusSearchRequest busSearchRequest);

    BusSeatLayout getBusSeatLayout(Map<String, Object> busIdentifier);
}
