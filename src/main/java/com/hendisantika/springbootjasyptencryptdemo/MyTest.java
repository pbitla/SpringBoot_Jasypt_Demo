package com.hendisantika.springbootjasyptencryptdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class MyTest {

	@Value("${userdemo.name}")
	private String username;

	@Value("${usercity.name}")
	private String cityname;

	public void testPrint() {
		System.out.println("##############################");
		System.out.println("Username is --------> {}" + username);
		System.out.println("Cityname is --------> {}" + cityname);
		System.out.println("##############################");
	}
}
