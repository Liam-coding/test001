package com.servletProject.service;

import com.servletProject.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin login(String username, String password);
    List<Admin> showAllAdmins();

}
