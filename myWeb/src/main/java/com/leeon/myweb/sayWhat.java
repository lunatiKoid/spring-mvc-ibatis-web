package com.leeon.myweb;

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liang.yaol on 5/31/15.
 */

@Controller
@RequestMapping("/say")
public class sayWhat {

    @RequestMapping(method = RequestMethod.GET)
    public String say(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String what = httpServletRequest.getParameter("what");
        System.out.println(what);
        return "say";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){


        return "say";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){


        return "say";
    }
}
