package com.nt.factory;

public class BajajbikeFactoryLocator {
	public static BajajBikeFactory buildBikeFactory(String location){
		if(location.equalsIgnoreCase("chennai"))
		return new BajajChennaiFactory();
		else if(location.equalsIgnoreCase("Noida")) 
			return new BajajNoidaFactory();
		else
			throw new IllegalArgumentException("Invalid location");
			
		}
		
	}

