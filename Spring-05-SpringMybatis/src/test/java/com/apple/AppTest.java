package com.apple;

import static org.junit.Assert.assertTrue;

import com.apple.dao.StudentDao;
import com.apple.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void t1(){
        ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
        StudentDao dao = (StudentDao) apc.getBean("studentDao");
        Student stu1 = new Student(9,20225,"apple",202);
        System.out.println(stu1.toString());
        System.out.println(dao.insertStudent(stu1));
//        dao.selectAll();

    }
}
