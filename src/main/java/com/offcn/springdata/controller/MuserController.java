package com.offcn.springdata.controller;

import com.offcn.springdata.bean.Muser;
import com.offcn.springdata.dao.MuserDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/user")
public class MuserController {
    @Resource
    private MuserDao muserDao;
    @RequestMapping("/list")
    public String getUserList(Model model){
        List<Muser> list = muserDao.getList();
        model.addAttribute("list",list);
        return "users";
    }
}
