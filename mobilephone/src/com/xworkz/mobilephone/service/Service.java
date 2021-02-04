package com.xworkz.mobilephone.service;

import com.xworkz.mobilephone.dto.DTO;

public interface Service {
	
	boolean ServiceAndSave(DTO dto);
	
	
	
	boolean validAndupdatePriceAndQuality(int price, int quality, String Brand);
	
	void deleteByBrand(String Brand);



}
