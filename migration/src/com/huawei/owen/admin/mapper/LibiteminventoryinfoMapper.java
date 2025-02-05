package com.huawei.owen.admin.mapper;

import com.huawei.owen.admin.model.Libiteminventoryinfo;
import com.huawei.owen.admin.model.LibiteminventoryinfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibiteminventoryinfoMapper {
    long countByExample(LibiteminventoryinfoQuery example);

    int deleteByExample(LibiteminventoryinfoQuery example);

    int deleteByPrimaryKey(String id);

    int insert(Libiteminventoryinfo record);

    int insertSelective(Libiteminventoryinfo record);

    List<Libiteminventoryinfo> selectByExample(LibiteminventoryinfoQuery example);

    Libiteminventoryinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Libiteminventoryinfo record, @Param("example") LibiteminventoryinfoQuery example);

    int updateByExample(@Param("record") Libiteminventoryinfo record, @Param("example") LibiteminventoryinfoQuery example);

    int updateByPrimaryKeySelective(Libiteminventoryinfo record);

    int updateByPrimaryKey(Libiteminventoryinfo record);
}