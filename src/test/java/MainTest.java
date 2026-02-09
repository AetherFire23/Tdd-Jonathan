import org.climoilou.vetm.formatif2.Calculatrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    private final String EMPTY_STRING = "";
    private final String SINGLE_NUMBER_STRING = "2";

    private final int EXPECTED_RESULT_FOR_EMPTY_STRING = 0;
    private final int EXPECTED_RESULT_FOR_ANY_SINGLE_NUMBER = 2;

    private final String ANY_NUMBER_PAIR = "1,2";
    private final int EXPECTED_RESULT_FOR_ANY_NUMBER_PAIR = 3;

    private Calculatrice calculatrice;

    @Test
    public void givenEmptyString_whenAdd_thenReturnZero() {
        Calculatrice calculatrice = new Calculatrice();

        int result = calculatrice.add(EMPTY_STRING);

        Assertions.assertEquals(EXPECTED_RESULT_FOR_EMPTY_STRING, result);
    }

    @Test
    public void givenAnySingleNumber_whenAdd_thenReturnSameNumber() {
        Calculatrice calculatrice = new Calculatrice();

        int result = calculatrice.add(SINGLE_NUMBER_STRING);

        Assertions.assertEquals(EXPECTED_RESULT_FOR_ANY_SINGLE_NUMBER, result);
    }

    @Test
    public void givenAnySingleN_whenAdd_thenReturnSameNumber() {
        Calculatrice calculatrice = new Calculatrice();

        int result = calculatrice.add(ANY_NUMBER_PAIR);

        Assertions.assertEquals(EXPECTED_RESULT_FOR_ANY_NUMBER_PAIR, result);
    }


}
