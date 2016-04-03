package com.sip.business;

import java.util.concurrent.ThreadLocalRandom;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class RandomNumberGenerator {
	
	public RandomNumberGenerator(){
	}
	
	@WebMethod
	public int randomNumber(@WebParam(partName = "lowerBound") int lowerBound, 
			                @WebParam(partName = "upperBound") int upperBound){
		return ThreadLocalRandom.current().nextInt(lowerBound, upperBound + 1);
	}

}

