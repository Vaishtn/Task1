package com.xworkz.mobilephone.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.mobilephone.dao.DAO;
import com.xworkz.mobilephone.dao.DAOImpl;
import com.xworkz.mobilephone.dto.DTO;



public class ServiceImpl implements Service {
	public DAO cell = new DAOImpl();
	
	private List<DTO> List = new ArrayList<DTO>();
	
	

	public ServiceImpl(DAO cell) {
		System.out.println("Create ServiceImpl");
		this.cell = cell;

	}

	public ServiceImpl() {
	}

	@Override
	public boolean ServiceAndSave(DTO dto) {
		boolean validData = false;
		if (dto != null) {
			System.out.println("dto is not null, will validate fields");
			String brand = dto.getBrand();
			if (brand != null && brand.length() >= 10 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is invalid");
				validData = false;
			}
		}

		int prize = dto.getPrize();
		if (validData && dto != null) {
			System.out.println("prize is valid");
			validData = true;
		} else {
			System.out.println("prize is not valid");
			validData = false;
		}

		String color = dto.getColor();
		if (validData && dto != null) {
			System.out.println("color is valid");
			validData = true;
		} else {
			System.out.println("color is not valid");
			validData = false;
		}

		float rating = dto.getRating();
		if (validData && dto != null) {
			System.out.println("rating is valid");
			validData = true;
		} else {
			System.out.println("rating is not valid");
			validData = false;
		}

		int quality = dto.getQuality();
		if (validData && dto != null) {
			System.out.println("quality is valid");
			validData = true;
		} else {
			System.out.println("quality is not valid");
			validData = false;
		}
	
		return false;
	}

	@Override
	public boolean validAndupdatePriceAndQuality(int price, int quality, String Brand) {
		System.out.println("invoked updatePriceAndQuantity");
		System.out.println("prize " + price);
		System.out.println("type " + quality);
		System.out.println("brand " + Brand);
		DTO phone1 = this.findByBrand(Brand);
		if (phone1 != null) {
			System.out.println("can update,price found");
			phone1.setQuality(quality);
			phone1.setBrand(Brand);
			return true;
		} else {
			System.out.println("can update,price not found");
		}
		
	
		return false;
	
	}

	private DTO findByBrand(String brand) {
		System.out.println("invoked findByBrand");
		System.out.println("brand" + brand);
		for (DTO mobileDTO : List) {
			String brandFromDTO = mobileDTO.getBrand();
			if (brandFromDTO.equals(brand)) {
				System.out.println("rating found");
				return mobileDTO;

			}

		}
	
		return null;
	}

	@Override
	public void deleteByBrand(String Brand) {
		System.out.println("DeleteByBrand");
		if(Brand !=null && !Brand.isEmpty() && !Brand.contains(" ") && Brand.length()>=3 ) {
			System.out.println("delete");
			this.cell.deleteByBrand(Brand);
				
	}

	}
}
