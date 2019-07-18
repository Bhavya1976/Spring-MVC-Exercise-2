package com.stackroute;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
//        ModelAndView model = new ModelAndView("view");
//        model.addObject("login", new Login());
//        return model;
//    }

    @RequestMapping(value = "/hello")
    public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response){
        Login loginObj=new Login(request.getParameter("name"), request.getParameter("pass"));
        ModelAndView model= null;
        model = new ModelAndView("view");
        model.addObject("name", loginObj.getName());
//        model.addObject("password", loginObj.getPassword());
        return model;
    }
}