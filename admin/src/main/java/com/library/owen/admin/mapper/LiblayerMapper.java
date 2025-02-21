package com.library.owen.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.library.owen.admin.model.Liblayer;

public interface LiblayerMapper extends MyBatisBaseDao<Liblayer, String>{
    List<Liblayer> findPageByMap(@Param("params") Map<String,Object> params);
    List<Liblayer> findPage();
}
