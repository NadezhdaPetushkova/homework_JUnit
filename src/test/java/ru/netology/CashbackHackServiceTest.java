package ru.netology;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainWithMinAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void amountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(expected, actual);
    }
}