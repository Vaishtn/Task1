package com.xworkz.mobilephone;

import com.xworkz.mobilephone.dto.DTO;
import com.xworkz.mobilephone.service.Service;
import com.xworkz.mobilephone.service.ServiceImpl;

public class ServiceTester {

	public static void main(String[] args) {
			DTO dto2=new DTO();
			dto2.setBrand("1+");
			dto2.setColor("white");
			dto2.setPrize(100000);
			dto2.setQuality(5);
			dto2.setRating(4.5f);
			
			Service service=new ServiceImpl();
			service.ServiceAndSave(dto2);
			
			service.validAndupdatePriceAndQuality(20000, 5, "iphone");
			
			service.deleteByBrand("1+");
	}

}
