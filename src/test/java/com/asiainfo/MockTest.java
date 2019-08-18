package com.asiainfo;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;

import com.asiainfo.service.IUserService;
import com.asiainfo.service.User;
import com.asiainfo.service.UserServiceImpl;

/**
 * Mock测试
 *
 * @author zhangzhiwang
 * @date Aug 14, 2019 9:49:52 PM
 */
public class MockTest {
	/** 对接口进行模拟 */
	private IUserService userService = Mockito.mock(IUserService.class);
	/** 对类进行模拟 */
	private UserServiceImpl userServiceImpl = Mockito.mock(UserServiceImpl.class);
	/** 基于注解进行模拟 */
	@Mock
	private User user;

	@BeforeClass
	public void initMock() {
		MockitoAnnotations.initMocks(this);
	}
}
