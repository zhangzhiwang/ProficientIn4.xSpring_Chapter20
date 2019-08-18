package com.asiainfo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.asiainfo.service.UserServiceImpl;

/**
 * 在JUnit中进行Spring测试
 *
 * @author zhangzhiwang
 * @date Aug 17, 2019 10:18:16 AM
 */
public class JUnitSpringTest extends BaseTest {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Test
	public void testJUnitSpring() {
		userServiceImpl.add();
	}
}
