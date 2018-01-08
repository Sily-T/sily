package com.sily.service.Impl;
import java.util.List;

import com.sily.api.SysDic;
import com.sily.dao.SysDicDao;
import com.sily.service.SysDicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SysDicServiceImpl implements SysDicService {
    @Autowired
    private SysDicDao sysDicDao;
    @Override
    public long getSysDicRowCount(){
        return sysDicDao.getSysDicRowCount();
    }
    @Override
    public List<SysDic> selectSysDic(){
        return sysDicDao.selectSysDic();
    }
    @Override
    public SysDic selectSysDicByObj(SysDic obj){
        return sysDicDao.selectSysDicByObj(obj);
    }
    @Override
    public SysDic selectSysDicById(Long id){
        return sysDicDao.selectSysDicById(id);
    }
    @Override
    public int insertSysDic(SysDic value){
        return sysDicDao.insertSysDic(value);
    }
    @Override
    public int insertNonEmptySysDic(SysDic value){
        return sysDicDao.insertNonEmptySysDic(value);
    }
    @Override
    public int insertSysDicByBatch(List<SysDic> value){
        return sysDicDao.insertSysDicByBatch(value);
    }
    @Override
    public int deleteSysDicById(Long id){
        return sysDicDao.deleteSysDicById(id);
    }
    @Override
    public int updateSysDicById(SysDic enti){
        return sysDicDao.updateSysDicById(enti);
    }
    @Override
    public int updateNonEmptySysDicById(SysDic enti){
        return sysDicDao.updateNonEmptySysDicById(enti);
    }

    public SysDicDao getSysDicDao() {
        return this.sysDicDao;
    }

    public void setSysDicDao(SysDicDao sysDicDao) {
        this.sysDicDao = sysDicDao;
    }

}