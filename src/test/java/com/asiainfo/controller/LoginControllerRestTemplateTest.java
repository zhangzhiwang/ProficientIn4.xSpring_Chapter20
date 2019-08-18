package com.asiainfo.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.asiainfo.BaseTest;

/**
 * 使用RestTmplate测试Controller
 *
 * @author zhangzhiwang
 * @date Aug 18, 2019 8:21:20 PM
 */
public class LoginControllerRestTemplateTest extends BaseTest {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private LoginController loginController;

	@Test
	public void testLogin() {
		// 构造访问参数
		MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap();
		multiValueMap.add("name", "bbb");
		multiValueMap.add("password", "11223344");

		// 说明：使用RestTmplate测试Controller必修要启动Web容器
		String result = restTemplate.postForObject("http://localhost:8080/ProficientIn4.xSpring_Chapter20/login2", multiValueMap, String.class);
		System.out.println(result);
	}
}
