package com.hsbc.gbb.insight.controller;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hsbc.gbb.insight.exception.ServiceException;
import com.hsbc.gbb.insight.model.UserModel;
import com.hsbc.gbb.insight.service.UserService;
import com.hsbc.gbb.insight.utils.Result;
import com.hsbc.gbb.insight.utils.ResultCode;
import com.hsbc.gbb.insight.utils.ResultGenerator;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/08/21.
*/
@RestController
@RequestMapping(value="/user",produces="application/json;charset=UTF-8")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public Result add(UserModel user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UserModel user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/detail/{id}")
    public Result detail(@PathVariable("id") Integer id) {
        UserModel user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    @RequestMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserModel> list = userService.findAll();
        PageInfo<UserModel> pageInfo = new PageInfo<>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @RequestMapping("/test")
    public Result test(){
        return new Result(ResultCode.FAIL);
    }

    @RequestMapping("/e")
    public Result e() throws ServiceException {
        throw new ServiceException(ResultCode.INVALID_PARAM);
    }
}
