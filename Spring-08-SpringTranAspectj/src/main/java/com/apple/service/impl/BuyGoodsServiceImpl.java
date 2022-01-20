package com.apple.service.impl;

import com.apple.dao.GoodDao;
import com.apple.dao.SaleDao;
import com.apple.domain.Goods;
import com.apple.domain.Sales;
import com.apple.excep.NotEnoughException;
import com.apple.service.BuyGoodsService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Double_apple
 * @Date 2022/1/20 16:11
 * @Version 1.0
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {

    private SaleDao saleDao;
    private GoodDao goodDao;

    public BuyGoodsServiceImpl(){}

    public BuyGoodsServiceImpl(SaleDao saleDao, GoodDao goodDao) {
        this.saleDao = saleDao;
        this.goodDao = goodDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }
    public void setGoodDao(GoodDao goodDao) {
        this.goodDao = goodDao;
    }

    @Override
    public void buy(Integer gid, Integer nums) {

        System.out.println("---------------正在购物中----------------");
        Sales sale = new Sales();
        sale.setGid(gid);
        sale.setNums(nums);
        int num = saleDao.insertSales(sale);

        Goods goods = goodDao.selectGood(gid);
        if(goods== null){
            throw new NullPointerException("编号："+gid+"不存在");
        } else if(goods.getAmount()<nums) {
            throw new NotEnoughException("商品"+goods.getName()+"库存不够了");
        }

        System.out.println("-------------更新商品信息中------------");
        Goods buyGood = new Goods();
        buyGood.setId(gid);
        buyGood.setAmount(nums);
        goodDao.updateGoods(buyGood);

        System.out.println("-----------购物完成---------------------");
    }
}
