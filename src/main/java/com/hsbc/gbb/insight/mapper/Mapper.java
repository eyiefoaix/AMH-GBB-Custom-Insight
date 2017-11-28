package com.hsbc.gbb.insight.mapper;

import java.util.List;
import java.util.Map;

/**
 * 定制版MyBatis Mapper插件接口，如需其他接口参考官方文档自行添加。
 */
public interface Mapper<T> {
	
    int save(T t);

    void save(Map<String, Object> map);

    void saveBatch(List<T> list);

    int update(T t);

    int update(Map<String, Object> map);

    int delete(Object id);

    int delete(Map<String, Object> map);

    int deleteBatch(Object[] id);

    T queryObject(Object id);

    List<T> queryList(Map<String, Object> map);

    List<T> queryList(Object id);

    int queryTotal(Map<String, Object> map);

    int queryTotal();
}
