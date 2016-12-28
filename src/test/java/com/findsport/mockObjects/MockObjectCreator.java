package com.findsport.mockObjects;

import com.findsport.DataAccessor.StadiumDAO;
import com.findsport.DataObjects.Stadium;

public class MockObjectCreator {
	
	public static Stadium getMockStadiumObject() {
		Stadium mockStadium = new Stadium();
		mockStadium.setStadiumAddress("testStadiumaddress");
		mockStadium.setStadiumLatitude("1234.123");
		mockStadium.setStadiumLongitude("1234.1234");
		mockStadium.setStadiumName("testStadiumName");
		mockStadium.setStadiumPhoneNo("1234567890");	
		return mockStadium;
	}

	public static void main (String[] args) {

		Stadium stadiumDataObject = MockObjectCreator.getMockStadiumObject();
		System.out.println(" success : " + StadiumDAO.insertData(stadiumDataObject));

	}


}
