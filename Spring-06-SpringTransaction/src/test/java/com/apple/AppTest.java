package com.apple;

import static org.junit.Assert.assertTrue;

import com.apple.service.BuyGoodsService;
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
    public void buyGoods(){
        ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
        BuyGoodsService buyGoodsService = (BuyGoodsService)apc.getBean("buyGoodsService");

        buyGoodsService.buy(1,35);
//        buyGoodsService.buy(3,35);
//        buyGoodsService.buy(1,10000000);
    }
}
