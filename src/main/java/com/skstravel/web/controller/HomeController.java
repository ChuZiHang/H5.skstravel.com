package com.skstravel.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skstravel.pojo.MatcheInfo;
import com.skstravel.service.MatcheService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Q_先森 on 2017/12/18.
 */
@Controller
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    
    
    @Autowired
    private MatcheService matcherService;
    
    
    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model) {
    	List<MatcheInfo> list=matcherService.findAll();
    	request.setAttribute("matcheList", list);
    	return "index";
    }
}
