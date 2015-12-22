package pt.adrz.hellojee.services.soap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class HelloWs {
	
	public String sayHello(String name) {

		if ( name == null ) {
			return "Hello";
		}
		
		return "Hello, " + name + "!";
	}
	
	public int sum(int add1, int add2) { 
		return add1 + add2;
	}
	
	public int multiply(int m1, int m2) {
		return m1 * m2;
	}
}
