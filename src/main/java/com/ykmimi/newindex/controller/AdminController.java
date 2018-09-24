package com.ykmimi.newindex.controller;

import com.ykmimi.newindex.bean.Admin;
import com.ykmimi.newindex.dao.AdminDao;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AdminController {

    @Resource
    private AdminDao adminDao;

    /*管理员登陆*/
    @RequestMapping("adminLogin")
    public Admin adminLoginC(Admin admin){
        return adminDao.adminLogin(admin);
    }

    /*固态获取用户示例列表*/
    @RequestMapping("getAllAdmin")
    public List<Admin> getAllAdmin(){
        return adminDao.getAllAdmin();
    }

    /*动态获取管理员列表*/
    @RequestMapping("getAdminDynamic")
    public List<Admin> getAdminDynamic(Admin admin){
        System.out.println("💗💗 in DynamicGet !");
        return adminDao.getAdminDynamic(admin);
    }

    /*创建新管理员*/ /*前面使用success:function(result)*/
    @RequestMapping("insertNewAdmin")
    public Model insertNewAdmin(Admin admin,Model model){
        int insertNum = adminDao.insertNewAdmin(admin);
        if(insertNum>0){
            model.addAttribute("code",1);
            model.addAttribute("message","注册管理员成功!💗");
            return model;
        }else{
            model.addAttribute("code",0);
            model.addAttribute("message","注册失败,请联系ukzq!💀");
            return model;
        }
    }

    /*更新用户信息*/
    @RequestMapping("updateAdminDynamic")
    public Model updateAdminDynamic(Admin admin,Model model){
        int updateNum = adminDao.updateAdminDynamic(admin);
        if(updateNum>0){
            model.addAttribute("code",1);
            model.addAttribute("message","更新成功!💗");
            return model;
        }else{
            model.addAttribute("code",0);
            model.addAttribute("message","更新失败,请联系ukzq!💀");
            return model;
        }
    }

}
