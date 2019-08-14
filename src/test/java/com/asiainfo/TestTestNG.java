package com.asiainfo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * 测试TestNG
 *
 * @author zhangzhiwang
 * @date Aug 14, 2019 5:45:10 PM
 */
@Test(groups = {"class-group1"}) // 类级分组
public class TestTestNG extends TestTestNGFather {
	private double l;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("子类的@BeforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("子类的@BeforeMethod：" + l);
		l = Math.random();
	}

	@DataProvider(name = "prepareParams") // 参数化测试
	public static Object[][] prepareParams() {
		String[][] s = new String[][] {{"a","b","c"},{"1","2","3"}};
		return s;
	}
	
	@Test(dataProvider = "prepareParams")
	public void test1() {
		System.out.println("test1:" + l);
	}

	@Test(groups = {"method-group1", "method-group2"})
	public void test2() {
		System.out.println("test2:" + l);
	}

	@Test(dependsOnMethods = {"test1", "test2"}) // 依赖测试，指定在运行test3之前先运行test1和test2。这种依赖是强依赖，也是testng默认的依赖方式，即所以来的方法必须测试通过才运行本测试方法，否则本测试方法不会被运行
	public void test3() {
		System.out.println("test3:" + l);
	}
	
	@Test(dependsOnMethods = {"test1", "test2"}, alwaysRun = true) // 当@Test注解的alwaysRun属性设置为true时为软依赖，即无论依赖方法是否执行成功本测试方法肯定会被执行
	public void test3_1() {
		System.out.println("test3:" + l);
	}

	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class) // 预计抛出ArrayIndexOutOfBoundsException异常
	public void testException() {
		String[] s = new String[1];
		String a = s[12];
	}
	
	@Test(timeOut = 10) // 测试超时
	public void testTimeout() throws InterruptedException {
		Thread.sleep(1000000);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("子类的，每个测试方法之行结束后都清理。。。");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("子类的@AfterClass");
	}
}
