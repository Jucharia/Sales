import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldFindGeneralSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.getGenSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.getAverageSale(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMinSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSale(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMaxSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int actual = service.maxSale(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindUnderAverageSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.underAverageSale(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindOverAverageSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.overAverageSale(sales);

        Assertions.assertEquals(expected, actual);

    }
}

