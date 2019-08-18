package com.asiainfo.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

import com.asiainfo.BaseTest;

/**
 * 对Controller进行单元测试
 *
 * @author zhangzhiwang
 * @date Aug 18, 2019 7:53:17 PM
 */
public class LoginControllerTest extends BaseTest {
	@Autowired
	private LoginController loginController;
	private MockHttpServletRequest request;
	private MockHttpServletResponse response;
	
	@Before
	public void init() {
		request = new MockHttpServletRequest();
 		request.setCharacterEncoding("UTF-8");
		response = new MockHttpServletResponse();
	}

	@Test
	public void testLogin() {
		request.setRequestURI("/ProficientIn4.xSpring_Chapter20/login");
		request.addParameter("name", "aaa");
		request.addParameter("password", "1234");
		
		ModelAndView modelAndView = loginController.login(request);
		String userName = (String) request.getSession().getAttribute("userName");
		System.out.println(modelAndView.getViewName());
		System.out.println(userName);
	}

}
