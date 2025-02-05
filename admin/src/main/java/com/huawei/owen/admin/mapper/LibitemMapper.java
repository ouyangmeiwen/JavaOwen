package com.huawei.owen.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huawei.owen.admin.model.Libitem;
import com.huawei.owen.admin.vo.LibitemParams;

public interface LibitemMapper extends MyBatisBaseDao<Libitem, String>{
           /**
     * 获取系统配置的分页结果
     *
     * @return 系统配置
     */
    List<Libitem> findPage();

    /**
     * 根据设置名拿到设置对象
     *
     * @param label 设置名
     * @return 设置对象
     */
    List<Libitem> findByBarcode(@Param("barcode") String barcode);

    /**
     * 根据设置名拿到设置分页对象
     *
     * @param label 设置名
     * @return 设置对象
     */
    List<Libitem> findPageByParams(LibitemParams criteria);

    /**
     * 根据设置名拿到设置分页对象
     *
     * @param params 设置名
     * @return 设置对象
     */
    List<Libitem> findPageByMap(@Param("params") Map<String,Object> params);
}
