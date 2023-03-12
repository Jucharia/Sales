package ru.netology.stats;

public class StatsService {

    public int getGenSales(int[] sales) {
        int genSales = 0;
        for (int i = 0; i < sales.length; i++) genSales += sales[i];
        return genSales;
    }

    public int getAverageSale(int[] sales) {
        int averageSale = 0; // Средняя сумма продаж зв месяц
        if (sales.length > 0) {
            int GenSales = getGenSales(sales);

            averageSale = GenSales / sales.length;
        }
        return averageSale;
    }

    public int minSale(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSale(int[] sales) {
        int maxMonth = sales[0]; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int underAverageSale(int[] sales) {
        int underAverage = 0;
        for (int sale : sales) {
            if (sale < getAverageSale(sales)) {
                underAverage += 1;
            }
        }
        return underAverage;
    }

    public int overAverageSale(int[] sales) {
        int overAverage = 0;
        for (int sale : sales) {
            if (sale > getAverageSale(sales)) {
                overAverage += 1;
            }
        }
        return overAverage;

    }
}