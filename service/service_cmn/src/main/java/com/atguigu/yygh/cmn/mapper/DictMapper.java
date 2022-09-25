package com.atguigu.yygh.cmn.mapper;

import com.atguigu.yygh.model.cmn.Dict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * @author lijian
 * @create 2021-04-22 15:45
 */
@Mapper
@Service
public interface DictMapper extends BaseMapper<Dict> {

}
