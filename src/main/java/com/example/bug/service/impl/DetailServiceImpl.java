package com.example.bug.service.impl;

import com.example.bug.dao.DetailDao;
import com.example.bug.entity.Detail;
import com.example.bug.service.DetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {

    @Resource
    private DetailDao detailDao;


    @Override
    public List<Detail> getAll(Integer pid) {
        return detailDao.getAll(pid);
    }

    @Override
    public boolean addDetails(int pid, int severity, String title, String user) {
        if(detailDao.addDetails(pid, severity, title, user)>0){
            return true;
        }
        return false;
    }
}
