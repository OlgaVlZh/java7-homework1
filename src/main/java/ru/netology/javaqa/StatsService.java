package ru.netology.javaqa;

public class StatsService {

    /*
    1. Сумма всех продаж
     */
    public int getSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++){
            sum += sales[i];
        }
        return sum;
    }

    /*
    2. Средняя сумма продаж
     */
    public int getAverage(int[] sales) {
        int average = getSum(sales) / sales.length;
        return average;
    }

    /*
    3. Номер месяца (последний), в котором был пик продаж
     */
    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;

    }

    /*
    4. Номер месяца (последний), в котором был минимум продаж
     */
    public int getMinMonth(int[] sales) {
        int minMonth = 0; //minMonth - номер месяца, в кот. продажи были минимальными
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    /*
    5. Количество месяцев, в которых продажи были ниже среднего
     */
    public int getUnderAverage(int[] sales) {
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverage(sales)) {
                counter++;
            }
        }
        return counter;
    }

    /*
    6. Количество месяцев, в которых продажи были выше среднего
     */
    public int getUpperAverage(int[] sales) {
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getAverage(sales)) {
                counter++;
            }
        }
        return counter;
    }


}
