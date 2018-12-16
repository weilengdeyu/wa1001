package cn.happy.controller;/**
 * Created by Happy on 2018-12-13.
 */

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 作者：微冷的雨
 *
 * @create 2018-12-13
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class FirstController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/index.jsp");
        mv.addObject("money","不论多少，开心就好！！！");
        return mv;
    }
}
