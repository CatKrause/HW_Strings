package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long sumSales(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;

        }

        return totalSales;
    }

    public long averageSalesAmount(long[] sales) {
//        long totalSales = 0;
//        for (long sale : sales) {
//            totalSales += sale;
//        }
        long totalSales = sumSales(sales);
        long averageSale = totalSales / 12;
        return averageSale;

    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long salesBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = averageSalesAmount(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }

        return counter;

    }

    public long salesAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = averageSalesAmount(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }

        return counter;
    }
}




