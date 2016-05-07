package cn.marrycar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.marrycar.bean.User;
import cn.marrycar.bean.UserExample;
import cn.marrycar.mapper.UserMapper;
import cn.marrycar.service.IUserService;

public class UserService implements IUserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectByPrimaryKey(Integer id) {
		User user = userMapper.selectByPrimaryKey(1);
		return user;
	}
	
	public  int deleteByPrimaryKey(Integer id){
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<User> selectByExample(UserExample example) {
		return userMapper.selectByExample(example);
	}
}
