package cn.marrycar;

import java.util.List;

import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.marrycar.bean.User;
import cn.marrycar.bean.UserExample;
import cn.marrycar.service.IUserService;

public class Test {

	private static IUserService service;

	@BeforeClass
	public static void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		service = (IUserService) context.getBean("userService");
	}
	
	@org.junit.Test
	public void test() {
		
		UserExample userExample = new UserExample();
		userExample.setOrderByClause("u_id ASC"); //…˝–Ú≈≈¡–£¨descŒ™Ωµ–Ú≈≈¡–°£  
		
		List<User> example = service.selectByExample(userExample);
		
		System.out.println(example.get(1));
//		User user = service.selectByPrimaryKey(1);
//		System.out.println(user);
//		service.deleteByPrimaryKey(1);
	}

}
