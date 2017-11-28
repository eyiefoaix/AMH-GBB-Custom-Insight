package com.hsbc.gbb.insight.service.impl;

import com.hsbc.gbb.insight.dao.UserMapper;
import com.hsbc.gbb.insight.exception.ServiceException;
import com.hsbc.gbb.insight.model.UserModel;
import com.hsbc.gbb.insight.service.UserService;

import tk.mybatis.mapper.entity.Condition;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/08/21.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

	@Override
	public void save(UserModel model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<UserModel> models) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByIds(String ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserModel model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserModel findById(Integer id) {
		return userMapper.queryObject(id);
	}

	@Override
	public UserModel findBy(String fieldName, Object value) throws TooManyResultsException, ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserModel> findByIds(String ids) {
		return null;
	}

	@Override
	public List<UserModel> findByCondition(Condition condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
