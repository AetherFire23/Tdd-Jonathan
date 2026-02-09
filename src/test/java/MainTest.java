import org.climoilou.vetm.formatif2.Calculatrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    private static final String EMPTY_STRING = "";
    private static final int EXPECTED_RESULT_FOR_EMPTY_STRING = 0;

    @Test
    public void givenEmptyString_whenAdd_thenReturnZero() {
        Calculatrice calculatrice = new Calculatrice();

        int result = calculatrice.add(EMPTY_STRING);

        Assertions.assertEquals(EXPECTED_RESULT_FOR_EMPTY_STRING, result);
    }

    @Test
    public void givenStringOfNumber_whenAdd_thenReturnSumOfAllNumber() {
        Calculatrice calculatrice = new Calculatrice();

        int result = calculatrice.add(EMPTY_STRING);

        Assertions.assertEquals(EXPECTED_RESULT_FOR_EMPTY_STRING, result);
    }
}
