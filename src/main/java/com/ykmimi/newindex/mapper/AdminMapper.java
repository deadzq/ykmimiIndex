package com.ykmimi.newindex.mapper;

import com.ykmimi.newindex.bean.Admin;

import java.util.List;

public interface AdminMapper {

    /*管理员用户名密码登陆*/
    Admin adminLogin(Admin admin);

    /*固态获取管理员列表*/
    List<Admin> getAllAdmin();

    /*动态获取管理员列表*/
    List<Admin> getAdminDynamic(Admin admin);

    /*注册新管理员*/
    Integer insertNewAdmin(Admin admin);

    /*更新管理员资料*/
    Integer updateAdminDynamic(Admin admin);

    /*删除管理员元组*/
    Integer deleteAdminById(Integer admin_id);


}
