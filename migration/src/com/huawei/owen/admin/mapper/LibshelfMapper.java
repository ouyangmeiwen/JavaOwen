package com.huawei.owen.admin.mapper;

import com.huawei.owen.admin.model.Libshelf;
import com.huawei.owen.admin.model.LibshelfQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibshelfMapper {
    long countByExample(LibshelfQuery example);

    int deleteByExample(LibshelfQuery example);

    int deleteByPrimaryKey(String id);

    int insert(Libshelf record);

    int insertSelective(Libshelf record);

    List<Libshelf> selectByExample(LibshelfQuery example);

    Libshelf selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Libshelf record, @Param("example") LibshelfQuery example);

    int updateByExample(@Param("record") Libshelf record, @Param("example") LibshelfQuery example);

    int updateByPrimaryKeySelective(Libshelf record);

    int updateByPrimaryKey(Libshelf record);
}