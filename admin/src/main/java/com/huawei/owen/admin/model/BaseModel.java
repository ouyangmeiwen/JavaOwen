/***********************************************************
 * @Description : 各个表都有的字段
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 17:47
 * @email       : owen@qq.com
 ***********************************************************/
package com.huawei.owen.admin.model;

import lombok.Data;

import java.util.Date;

@Data
public class BaseModel {
    /**
     * 编号
     */
    private Long id;
    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String lastUpdateBy;

    /**
     * 更新时间
     */
    private Date lastUpdateTime;
}
