package com.findsport.BusinessObjects;

import com.findsport.DataAccessor.StadiumDAO;
import com.findsport.DataObjects.Stadium;

public class StadiumHandler {
	
	public static String handleStadiumInsertRequest(Stadium stadiumDataObject) {
		boolean statusFlag = StadiumDAO.insertData(stadiumDataObject);
		if (statusFlag)
			return "Success";
		return "Failed";
		
	}

}
