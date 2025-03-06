package com.fastays.thirdparty.api.city.model;

import lombok.Data;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

//@Document(collection = "#{@environment.getProperty('tbo.collections.cities')}")
@Data
public class City {
	//@Id
	private String id;
	private String name;
	private Map<String, Boolean> scope;
	private Map<String, Products> products;

	@Data
	public static class Products {
		private Map<String, String> thirdPartyIds;
	}
}
