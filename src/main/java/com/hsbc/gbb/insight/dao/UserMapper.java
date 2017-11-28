package com.hsbc.gbb.insight.dao;

import com.hsbc.gbb.insight.mapper.Mapper;
import com.hsbc.gbb.insight.model.UserModel;

import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends Mapper<UserModel> {
}