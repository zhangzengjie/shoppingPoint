package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;


public class CalculateShoppingPointTest {

    @Test
    public void should_return_200_point_when_calculate_given_amount_is_200() {
        //given
        CalculateShoppingPoint calculateShoppingPoint = new CalculateShoppingPoint();
        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        Goods cucumber = new Goods("cucumber", new BigDecimal(130));
        Goods orange = new Goods("orange", new BigDecimal(70));
        goodsList.add(cucumber);
        goodsList.add(orange);
        //when
        int totalPoint = calculateShoppingPoint.calculate(goodsList);
        //then
        Assert.assertEquals(totalPoint, 200);
    }

    @Test
    public void should_return_40_point_when_calculate_given_include_promotions_goods_and_amount_is_25() {
        //given
        CalculateShoppingPoint calculateShoppingPoint = new CalculateShoppingPoint();
        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        Goods watermelon = new Goods("WATERMELON", new BigDecimal(10));
        Goods detergent = new Goods("Detergent", new BigDecimal(10));
        Goods APPLE = new Goods("APPLE", new BigDecimal(5));
        goodsList.add(watermelon);
        goodsList.add(APPLE);
        goodsList.add(detergent);
        //when
        int totalPoint = calculateShoppingPoint.calculate(goodsList);
        //then
        Assert.assertEquals(totalPoint, 40);
    }


    @Test
    public void should_return_1050_point_when_calculate_given_amount_is_2000() {
        //given
        CalculateShoppingPoint calculateShoppingPoint = new CalculateShoppingPoint();
        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        Goods phone = new Goods("Phone", new BigDecimal(2000));
        goodsList.add(phone);
        //when
        int totalPoint = calculateShoppingPoint.calculate(goodsList);
        //then
        Assert.assertEquals(totalPoint, 1050);
    }

    @Test
    public void should_return_2500_point_when_calculate_given_include_promotions_goods_and_amount_is_1500() {
        //given
        CalculateShoppingPoint calculateShoppingPoint = new CalculateShoppingPoint();
        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        Goods TELEVISION = new Goods("TELEVISION", new BigDecimal(1500));
        goodsList.add(TELEVISION);
        //when
        int totalPoint = calculateShoppingPoint.calculate(goodsList);
        //then
        Assert.assertEquals(totalPoint, 2500);
    }

    @Test
    public void should_return_1890_point_when_calculate_given_include_promotions_goods_and_amount_is_2500() {
        //given
        CalculateShoppingPoint calculateShoppingPoint = new CalculateShoppingPoint();
        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        Goods WASHING_MACHINE = new Goods("WASHING_MACHINE", new BigDecimal(2000));
        Goods TELEVISION = new Goods("TELEVISION", new BigDecimal(500));

        goodsList.add(TELEVISION);
        goodsList.add(WASHING_MACHINE);
        //when
        int totalPoint = calculateShoppingPoint.calculate(goodsList);
        //then
        Assert.assertEquals(totalPoint, 1575);
    }

}
