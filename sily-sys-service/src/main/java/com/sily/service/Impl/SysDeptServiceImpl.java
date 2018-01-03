package com.sily.service.Impl;
import java.util.List;
import com.sily.dao.SysDeptDao;
import com.sily.api.SysDept;
import com.sily.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class SysDeptServiceImpl implements SysDeptService{
    @Autowired
    private SysDeptDao sysDeptDao;
    @Override
    public long getSysDeptRowCount(){
        return sysDeptDao.getSysDeptRowCount();
    }
    @Override
    public List<SysDept> selectSysDept(){
        return sysDeptDao.selectSysDept();
    }
    @Override
    public SysDept selectSysDeptByObj(SysDept obj){
        return sysDeptDao.selectSysDeptByObj(obj);
    }
    @Override
    public SysDept selectSysDeptById(Long id){
        return sysDeptDao.selectSysDeptById(id);
    }
    @Override
    public int insertSysDept(SysDept value){
        return sysDeptDao.insertSysDept(value);
    }
    @Override
    public int insertNonEmptySysDept(SysDept value){
        return sysDeptDao.insertNonEmptySysDept(value);
    }
    @Override
    public int insertSysDeptByBatch(List<SysDept> value){
        return sysDeptDao.insertSysDeptByBatch(value);
    }
    @Override
    public int deleteSysDeptById(Long id){
        return sysDeptDao.deleteSysDeptById(id);
    }
    @Override
    public int updateSysDeptById(SysDept enti){
        return sysDeptDao.updateSysDeptById(enti);
    }
    @Override
    public int updateNonEmptySysDeptById(SysDept enti){
        return sysDeptDao.updateNonEmptySysDeptById(enti);
    }

    public SysDeptDao getSysDeptDao() {
        return this.sysDeptDao;
    }

    public void setSysDeptDao(SysDeptDao sysDeptDao) {
        this.sysDeptDao = sysDeptDao;
    }

}