package com.apple.controller;

import com.apple.domain.Student;
import com.apple.service.StudentService;
import com.sun.net.httpserver.HttpServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Double_apple
 * @Date 2022/1/20 21:18
 * @Version 1.0
 */
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String stdno = req.getParameter("stdno");
        String stdname = req.getParameter("stdname");
        String classno = req.getParameter("classno");

//        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        //使用了监听器后 不再用applicationContext的方法拿 而用webapp的方法拿  容器里的对象
//        WebApplicationContext ctx = null;
//        String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
//        Object attr = getServletContext().getAttribute(key);
//        if (attr != null) {
//            ctx = (WebApplicationContext) attr;
//        }

        WebApplicationContext ctx = null;
        ServletContext sc = getServletContext();
        ctx= WebApplicationContextUtils.getRequiredWebApplicationContext(sc);

        StudentService studentService = (StudentService) ctx.getBean("studentService");


        Student student = new Student(Integer.parseInt(id), Integer.parseInt(stdno), stdname, Integer.parseInt(classno));
        System.out.println(studentService.addStudent(student));


        req.getRequestDispatcher("/result.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
