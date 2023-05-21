package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testForPurchaseOn1500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testForPurchaseOn1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testForPurchaseOn0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testForPurchaseOn1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testForPurchaseOn999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testForPurchaseOn1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testForPurchaseOn2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }
    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn1500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);

    }

    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }
}