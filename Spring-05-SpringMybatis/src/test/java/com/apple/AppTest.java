package com.apple;

import static org.junit.Assert.assertTrue;

import com.apple.dao.StudentDao;
import com.apple.domain.Student;
import com.apple.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void t1() {
        ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
        String names[] = apc.getBeanDefinitionNames();
        for (String i : names) System.out.println(i);
    }

    @Test
    public void testStudentDao() {
        ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
        StudentDao dao = (StudentDao) apc.getBean("studentDao");
//        Student stu1 = new Student(9, 20225, "apple", 202);
        Student stu1 = new Student();
        stu1.setClassno(12);
        stu1.setStdname("apple");
        stu1.setStdno(181001);
        stu1.setId(9);
        int num = dao.insertStudent(stu1);
        System.out.println(num);
    }

    @Test
    public void testStudentService() {
        ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
        StudentService service = (StudentService) apc.getBean("studentService");
        Student stu1 = new Student(11, 20226, "apple", 202);
        int num = service.addStudent(stu1);
        System.out.println(num);
    }

    @Test
    public void testQueryStudent(){
        ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
        StudentService service = (StudentService) apc.getBean("studentService");
        System.out.println(service.queryStudent());
    }
}
