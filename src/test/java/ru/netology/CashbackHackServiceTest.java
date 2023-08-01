package ru.netology;

import org.testng.Assert;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void remainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void remainWithMinAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void amountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4600;
        int actual = service.remain(amount);
        int expected = 400;
        Assert.assertEquals(actual, expected);
    }
}