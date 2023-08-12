package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesMonthTest() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmount() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSalesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesBelowAverageTest() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.salesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesAboveAverageTest() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.salesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
