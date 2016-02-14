package pt.adrz.hellojee.webservices.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class HelloWs {
	
	@WebMethod
	public String sayHello(String name) {

		if ( name == null ) {
			return "Hello";
		}
		
		return "Hello, " + name + "!";
	}
	
	@WebMethod
	public int sum(int add1, int add2) { 
		return add1 + add2;
	}
	
	@WebMethod
	public int multiply(int m1, int m2) {
		return m1 * m2;
	}
}
