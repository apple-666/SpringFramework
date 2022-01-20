package com.apple.dao;

import com.apple.domain.Goods;

/**
 * @Author Double_apple
 * @Date 2022/1/20 15:56
 * @Version 1.0
 */
public interface GoodDao {
    int updateGoods(Goods goods);

    Goods selectGood(Integer id);
}
