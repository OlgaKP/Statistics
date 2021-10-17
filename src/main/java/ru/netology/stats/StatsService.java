package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales){
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long sumAverage(long[] sales){
        long sumAvg = sumSales(sales) / sales.length;
        return sumAvg;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int minAvgSales(long[] sales) {
        int count = 0;
        long sumAvg = sumSales(sales) / sales.length;
        for (long sale : sales) {
            if (sale < sumAvg) {
                count++;
            }
        }
        return count;
    }

    public int maxAvgSales(long[] sales) {
        int count = 0;
        long sumAvg = sumSales(sales) / sales.length;
        for (long sale : sales) {
            if (sale > sumAvg) {
                count++;
            }
        }
        return count;
    }
}
