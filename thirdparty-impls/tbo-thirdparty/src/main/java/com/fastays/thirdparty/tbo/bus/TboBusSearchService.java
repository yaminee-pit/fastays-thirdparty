package com.fastays.thirdparty.tbo.bus;

import com.fastays.thirdparty.api.bus.BusSearchService;
import com.fastays.thirdparty.api.bus.model.BusSearchRequest;
import com.fastays.thirdparty.api.bus.model.BusSearchResponse;
import com.fastays.thirdparty.api.bus.model.BusSeatLayout;

import java.util.List;
import java.util.Map;

public class TboBusSearchService implements BusSearchService {


    @Override
    public List<BusSearchResponse> getBusSearch(BusSearchRequest busSearchRequest) {

        return List.of();
    }

    @Override
    public BusSeatLayout getBusSeatLayout(Map<String, Object> busIdentifier) {
        return null;
    }
}
