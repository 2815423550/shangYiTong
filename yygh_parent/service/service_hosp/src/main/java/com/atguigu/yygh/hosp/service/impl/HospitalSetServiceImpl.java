package com.atguigu.yygh.hosp.service.impl;


import com.atguigu.yygh.hosp.mapper.HospitalSetMapper;
import com.atguigu.yygh.hosp.service.HospitalSetService;
import com.atguigu.yygh.model.hosp.HospitalSet;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//因为这里是service的实现类，所以加上@Service注解，让该类交给spring进行管理
@Service
//ServiceImpl是mybatis-plus封装的类，他的泛型里需要两个参数，第一个是mapper，第二个是实体类
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {

    /*service里最终是要调用mapper，所以我们需要将mapper注入；但是上面的ServiceImpl里面已经将mapper进行注入了，
    所以我们这里无需进行任何操作
     */

}
