package com.servletProject.service.impl;

import com.servletProject.dao.AdminDao;
import com.servletProject.dao.impl.AdminDaoImpl;
import com.servletProject.entity.Admin;
import com.servletProject.service.AdminService;
import com.servletProject.utils.DbUtils;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    private AdminDao adminDao = new AdminDaoImpl();

    @Override
    public Admin login(String username, String password) {
        Admin result = null;
        try {
            DbUtils.begin();
            Admin admin = adminDao.select(username);
            if (admin != null) {
                if (admin.getPassword().equals(password)) {
                    result = admin;
                }
            }
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollBack();
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public List<Admin> showAllAdmins() {
        return null;
    }
}
