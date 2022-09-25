package com.atguigu.yygh.hosp.mapper;

import com.atguigu.yygh.model.hosp.HospitalSet;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


//BaseMapper是mybatis封装的类，泛型里写实体类，这里是HospitalSetMapper，那实体类就写HospitalSet
//因为这里用到了HospitalSet，然而service模块里并没有他，他在model模块里，所以需要去service模块的pom文件里引入model模块
public interface HospitalSetMapper extends BaseMapper<HospitalSet> {

}
