package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {



    /*
    1. Сумма всех продаж
     */
    @Test
    public void shouldFindSum() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSum = 180;
        int actualSum = service.getSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    /*
    2. Средняя сумма продаж
     */
    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedAverage = 15;
        int actualAverage = service.getAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    /*
    3. Номер месяца (последний), в котором был пик продаж
     */
    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 7;
        int actualMonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    /*
    4. Номер месяца (последний), в котором был минимум продаж
    изменения для проверки: '8' заменила на '-8'
     */
    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        int[] sales = { -8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 0;
        int actualMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    /*
    5. Количество месяцев, в которых продажи были ниже среднего
     */
    @Test
    public void shouldFindUnderAverage() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedCounter = 5;
        int actualCounter = service.getUnderAverage(sales);

        Assertions.assertEquals(expectedCounter, actualCounter);
    }

    /*
    6. Количество месяцев, в которых продажи были dsit среднего
     */
    @Test
    public void shouldFindUpperAverage() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18, 18 };
        //заменила в ноябре 14 на 18

        int expectedCounter = 6;
        int actualCounter = service.getUpperAverage(sales);

        Assertions.assertEquals(expectedCounter, actualCounter);
    }


}
