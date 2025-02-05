package com.huawei.owen.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huawei.owen.admin.model.Libiteminventoryinfo;

public interface LibiteminventoryinfoMapper extends MyBatisBaseDao<Libiteminventoryinfo, String>{
    List<Libiteminventoryinfo> findPageByMap(@Param("params") Map<String,Object> params);
    List<Libiteminventoryinfo> findPage();
}
