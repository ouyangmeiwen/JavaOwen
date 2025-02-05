package com.huawei.owen.admin.mapper;

import com.huawei.owen.admin.model.Libitem;
import com.huawei.owen.admin.model.LibitemQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibitemMapper {
    long countByExample(LibitemQuery example);

    int deleteByExample(LibitemQuery example);

    int deleteByPrimaryKey(String id);

    int insert(Libitem record);

    int insertSelective(Libitem record);

    List<Libitem> selectByExampleWithBLOBs(LibitemQuery example);

    List<Libitem> selectByExample(LibitemQuery example);

    Libitem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Libitem record, @Param("example") LibitemQuery example);

    int updateByExampleWithBLOBs(@Param("record") Libitem record, @Param("example") LibitemQuery example);

    int updateByExample(@Param("record") Libitem record, @Param("example") LibitemQuery example);

    int updateByPrimaryKeySelective(Libitem record);

    int updateByPrimaryKeyWithBLOBs(Libitem record);

    int updateByPrimaryKey(Libitem record);
}