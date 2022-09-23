package com.atguigu.yygh.hosp.controller;


import com.atguigu.yygh.hosp.service.HospitalSetService;
import com.atguigu.yygh.model.hosp.HospitalSet;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RestController:1.让该类交给spring管理。2.让该类返回数据（默认json数据）
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {

    /*注入service（因为@RestController返回的数据是json形式，然而下面的方法里return的却不是json数据，
    所以在这里@Autowired注解会把返回的数据转换成json形式，使用到的底层原理是jackson）
     */
    @Autowired
    private HospitalSetService hospitalSetService;

    //1 查询医院设置表所有信息
    @ApiOperation(value = "获取所有医院设置")
    @GetMapping("findAll")
    public List findAllHospitalSet() {
        //这里返回一个List集合，集合里的数据类型是HospitalSet类
        //hospitalSetService.list() 这里的list方法是mybatis-plus封装好的，使用该方法即可查出该类的所有数据
        List<HospitalSet> list = hospitalSetService.list();
        return list;
    }

    //2 逻辑删除医院设置
    @ApiOperation(value = "逻辑删除医院设置")
    @DeleteMapping("{id}")
    public boolean removeHospSet(@PathVariable Long id) {
        //removeById方法也是mybatis-plus封装的方法，根据id删除数据
        boolean flag = hospitalSetService.removeById(id);
        return flag;
    }
}
