package com.apple;

import static org.junit.Assert.assertTrue;

import com.apple.service.ServiceImpl;
import org.junit.Test;

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
        ServiceImpl service = new ServiceImpl();
        service.doOther();
        service.doSome();
    }
}
