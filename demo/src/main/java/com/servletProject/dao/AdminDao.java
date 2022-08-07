package com.servletProject.dao;

import com.servletProject.entity.Admin;

import java.util.List;

public interface AdminDao {
    int insert(Admin admin);
    int delete(String username);
    int update(Admin admin);
    Admin select(String username);
    List<Admin> selectAll();
}
