package com.amdocs;

import org.tempuri.*;

<<<<<<< HEAD
public class Main{

	public static void main(String[] args){

		System.setProperty("java.net.useSystemProxies","true");
		
		Calculator calculator = new Calculator();
		CalculatorSoap soapObject = calculator.getCalculatorSoap();
		int result = soapObject.add (100,200);
		System.out.println("Theresult is " + result );



	}
=======
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;

public class Main {

	public static void main ( String[] args ) {

		HttpHost proxy = new HttpHost( "192.168.101.52", 8080,"http");
		HttpClient client = new DefaultHttpClient();
		client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);

		Calculator calculator = new Calculator();
		
		CalculatorSoap soapObject = calculator.getCalculatorSoap();
	
		int result = soapObject.add ( 100, 200 );
	
		System.out.println ( "The result is " + result );

	}

>>>>>>> fac0afe5065c16e8fa0cad54beaedcee46f1103c
}
