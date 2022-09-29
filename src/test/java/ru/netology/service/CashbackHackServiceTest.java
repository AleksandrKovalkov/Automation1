package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldReturn400IfAmountIs600(){
        int amount = 600;
        int actual = service.remain(amount);
        int expected = 400;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldReturn500IfAmountIs1500(){
        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual,expected);
    }


    @Test
    void shouldReturn1000IfAmountIs0(){
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual,expected);
    }

    @Test
    void shouldReturn0IfAmountIs1000(){
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual,expected);
    }

}
