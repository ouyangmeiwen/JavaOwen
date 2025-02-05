package com.huawei.owen.admin.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huawei.owen.admin.model.Libitem;
import com.huawei.owen.core.page.PageRequest;
import com.huawei.owen.core.page.PageResult;
import com.huawei.owen.core.service.CurdCustomService;

public interface LibitemService extends CurdCustomService<Libitem, String> {

        /**
         * 根据设置名拿到设置对象
         *
         * @param barcode 设置名
         * @return 设置对象
         */
        List<Libitem> findByBarcode(@Param("barcode") String barcode);

        /**
         * 获取系统配置的分页结果
         *
         * @return 系统配置
         */
        List<Libitem> findPage();

        /**
         * 获取系统配置的分页结果
         *
         * @return 系统配置
         */
        PageResult findPageByParams(PageRequest pageRequest);

        /**
         * 获取系统配置的分页结果
         *
         * @return 系统配置
         */

         PageResult findPageByMap(PageRequest pageRequest);
}
