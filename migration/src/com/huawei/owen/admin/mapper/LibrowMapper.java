package com.huawei.owen.admin.mapper;

import com.huawei.owen.admin.model.Librow;
import com.huawei.owen.admin.model.LibrowQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibrowMapper {
    long countByExample(LibrowQuery example);

    int deleteByExample(LibrowQuery example);

    int deleteByPrimaryKey(String id);

    int insert(Librow record);

    int insertSelective(Librow record);

    List<Librow> selectByExample(LibrowQuery example);

    Librow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Librow record, @Param("example") LibrowQuery example);

    int updateByExample(@Param("record") Librow record, @Param("example") LibrowQuery example);

    int updateByPrimaryKeySelective(Librow record);

    int updateByPrimaryKey(Librow record);
}