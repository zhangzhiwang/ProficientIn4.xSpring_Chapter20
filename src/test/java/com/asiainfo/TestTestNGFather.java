package com.asiainfo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestTestNGFather {
	@BeforeClass
	public static void beforeClassFather() {
		System.out.println("父类的@BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethodFather() {
		System.out.println("父类的@BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethodFather() {
		System.out.println("父类的@AfterMethod");
	}

	@AfterClass
	public static void afterClassFather() {
		System.out.println("父类的@AfterClass");
	}
}
