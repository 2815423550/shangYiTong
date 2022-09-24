package com.atguigu.yygh.hosp.service;

import com.atguigu.yygh.model.hosp.HospitalSet;
import com.baomidou.mybatisplus.extension.service.IService;


//IService是mybatis-plus封装的类，因为这里是HospitalSetService，所以泛型里写HospitalSet
public interface HospitalSetService extends IService<HospitalSet> {
}
