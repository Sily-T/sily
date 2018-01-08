package com.sily.dao;
import com.sily.api.SysDic;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysDicDao{
	/**
	 * 获得SysDic数据的总行数
	 * @return
	 */
    long getSysDicRowCount();
	/**
	 * 获得SysDic数据集合
	 * @return
	 */
    List<SysDic> selectSysDic();
	/**
	 * 获得一个SysDic对象,以参数SysDic对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysDic selectSysDicByObj(SysDic obj);
	/**
	 * 通过SysDic的id获得SysDic对象
	 * @param id
	 * @return
	 */
    SysDic selectSysDicById(Long id);
	/**
	 * 插入SysDic到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysDic(SysDic value);
	/**
	 * 插入SysDic中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysDic(SysDic value);
	/**
	 * 批量插入SysDic到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysDicByBatch(List<SysDic> value);
	/**
	 * 通过SysDic的id删除SysDic
	 * @param id
	 * @return
	 */
    int deleteSysDicById(Long id);
	/**
	 * 通过SysDic的id更新SysDic中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysDicById(SysDic enti);
	/**
	 * 通过SysDic的id更新SysDic中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysDicById(SysDic enti);
}