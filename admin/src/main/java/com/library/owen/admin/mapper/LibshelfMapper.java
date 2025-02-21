package com.library.owen.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.library.owen.admin.model.Libshelf;

public interface LibshelfMapper extends MyBatisBaseDao<Libshelf, String>{
    List<Libshelf> findPageByMap(@Param("params") Map<String,Object> params);
    List<Libshelf> findPage();
}
