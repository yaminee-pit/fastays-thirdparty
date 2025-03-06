package com.fastays.thirdparty.tbo.common;

import lazydevs.mapper.utils.SerDe;
import lazydevs.persistence.impl.rest.auth.RestAuth;
import lazydevs.persistence.impl.rest.reader.RestGeneralReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class BeanConfig {


    @Bean
    public RestGeneralReader tboReader() {
        RestGeneralReader reader = new RestGeneralReader();
        reader.setRestAuth(new RestAuth() {
            @Override
            public void authorize(lazydevs.persistence.impl.rest.reader.RestGeneralReader.RestInstruction restInstruction) {
                var newPayload = SerDe.JSON.deserializeToMap(restInstruction.getRequest().getPayload());
                newPayload.putAll(Map.of(
                        "endUserIp", "",
                        "token", ""
                ));
                restInstruction.getRequest().setPayload(SerDe.JSON.serialize(newPayload));
            }
        });
        return reader;
    }
}

