/***********************************************************
 * @Description : 分页查询助手
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 12:59
 * @email       : owen@qq.com
 ***********************************************************/
package com.huawei.owen.core.page;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huawei.owen.common.utils.ReflectionUtils;

import java.util.List;

public class MyBatisPageHelper {
    public static final String findPage = "findPage";

    /**
     * 分页查询，约定查询方法为"findPage"
     *
     * @param pageRequest 分页请求
     * @param mapper      dao对象，MyBatis的Mapper
     * @return 分页结果
     */
    public static PageResult findPage(PageRequest pageRequest, Object mapper) {
        return findPage(pageRequest, mapper, findPage);
    }

    /**
     * 调用分页插件进行分页查询  注意Map不可以传
     *
     * @param pageRequest     分页请求
     * @param mapper          dao对象，MyBatis的Mapper
     * @param queryMethodName 查询方法名
     * @param args            额外的参数  Map不可以传
     * @return 查询结果
     */
    public static PageResult findPage(PageRequest pageRequest, Object mapper, String queryMethodName, Object... args) {
        // 设置分页参数
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        // 里用反射调用方法
        Object result = ReflectionUtils.invoke(mapper, queryMethodName, args);
        return getPageResult(pageRequest, new PageInfo((List) result));
    }

    /**
     * 将分页信息封装到统一的接口
     *
     * @param pageRequest 请求参数
     * @param pageInfo    分页信息对象
     * @return 分页结果
     */
    public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }

    /**
     * 开启分页
     * @param pageRequest
     */
    public static void  startPage(PageRequest pageRequest){
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
    }
}
