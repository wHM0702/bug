package com.example.bug.service;

import com.example.bug.entity.Detail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DetailService {

    List<Detail> getAll(Integer pid);

    boolean addDetails(int pid, int severity, String title, String user);
}
