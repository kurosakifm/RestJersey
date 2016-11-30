package com.home.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/get")
public class Service {

	@GET
	@Path("/xml")
	@Produces("application/xml")
	public String convertCtoF() {
 
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
 

	@GET
	@Path("/text")
	@Produces("plain/text")
	public String plainText() {
 
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return result;
	}

	
}
