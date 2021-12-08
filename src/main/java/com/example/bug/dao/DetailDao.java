package com.example.bug.dao;

import com.example.bug.entity.Detail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DetailDao {

    List<Detail> getAll(Integer pid);

    int addDetails(@Param("projectId") int pid, @Param("severity") int severity,@Param("title") String title, @Param("reportUser") String user);
}
