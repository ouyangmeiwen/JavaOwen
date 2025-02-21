package com.library.owen.admin.mapper;

import com.library.owen.admin.model.Liblayer;
import com.library.owen.admin.model.LiblayerQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiblayerMapper {
    long countByExample(LiblayerQuery example);

    int deleteByExample(LiblayerQuery example);

    int deleteByPrimaryKey(String id);

    int insert(Liblayer record);

    int insertSelective(Liblayer record);

    List<Liblayer> selectByExample(LiblayerQuery example);

    Liblayer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Liblayer record, @Param("example") LiblayerQuery example);

    int updateByExample(@Param("record") Liblayer record, @Param("example") LiblayerQuery example);

    int updateByPrimaryKeySelective(Liblayer record);

    int updateByPrimaryKey(Liblayer record);
}