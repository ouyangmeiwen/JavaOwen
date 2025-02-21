package com.library.owen.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.library.owen.admin.model.Librow;

public interface LibrowMapper extends MyBatisBaseDao<Librow, String>{
    List<Librow> findPageByMap(@Param("params") Map<String,Object> params);
    List<Librow> findPage();
}
