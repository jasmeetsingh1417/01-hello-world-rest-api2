package com.amazon.clone.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.amazon.clone.entity.Girls;

public class Service {


	static HashMap<Integer,Girls> countryIdMap=getCountryIdMap();
	 
    public Service() {
        super();
 
        if(countryIdMap==null)
        {
            countryIdMap=new HashMap<Integer,Girls>();
            // Creating some objects of Country while initializing
            Girls indiaCountry=new Girls(1,"pooja",32,"pooja@xxx");
            Girls chinaCountry=new Girls(2,"stella",32,"stella@xxx");
            Girls nepalCountry=new Girls(3,"Mango",32,"Mango@xxx");
           
 
            countryIdMap.put(1,indiaCountry);
            countryIdMap.put(4,chinaCountry);
            countryIdMap.put(3,nepalCountry);
          
        }
    }

    public List getALLgirls() {
		List allgirls =new ArrayList(countryIdMap.values());
		return allgirls;
	}
    
	private static HashMap<Integer, Girls> getCountryIdMap() {
		// TODO Auto-generated method stub
		return countryIdMap;
	}


}

