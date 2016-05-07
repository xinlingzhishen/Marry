package cn.marrycar.service;

import java.util.List;

import cn.marrycar.bean.User;
import cn.marrycar.bean.UserExample;

public interface IUserService {
	public User selectByPrimaryKey(Integer id);
	public  int deleteByPrimaryKey(Integer id);
	public List<User> selectByExample(UserExample example);
	
}
