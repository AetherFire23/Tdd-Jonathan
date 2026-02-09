import org.climoilou.vetm.formatif2.Calculatrice;
import org.climoilou.vetm.formatif2.CustomEx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class MainTest {

    private final String EMPTY_STRING = "";
    private final String SINGLE_NUMBER_STRING = "2";

    private final int EXPECTED_RESULT_FOR_EMPTY_STRING = 0;
    private final int EXPECTED_RESULT_FOR_ANY_SINGLE_NUMBER = 2;

    private final String ANY_NUMBER_PAIR = "1,2";
    private final int EXPECTED_RESULT_FOR_ANY_NUMBER_PAIR = 3;

    private final String ANY_NUMBER_PAIR_WITH_DELIMITER_AT_THE_END = "1,2,3,";

    private final String ANY_NUMBER_PAIR_WITH_DELIMITER_AT_THE_START_AND_GARBAGE_CHARS = "//;\n1;3";
    private final int EXPECTED_RESULT_FOR_ANY_NUMBER_PAIR_WITH_DELIMITER_AT_THE_START_AND_GARBAGE_CHARS = 4;

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

    private final String ANY_NUMBER_PAIR_WITH_DELIMITER = "1\n2\n3";
    private final int EXPECTED_RESULT_FOR_ANY_NUMBER_PAIR_WITH_DELIMITER = 6;

    @Test
    public void givenNewLineDelimiterWithAnyNumberPair_whenAdd_thenReturnDelimiter() {
        Calculatrice calculatrice = new Calculatrice();

        int result = calculatrice.add(ANY_NUMBER_PAIR_WITH_DELIMITER);

        Assertions.assertEquals(EXPECTED_RESULT_FOR_ANY_NUMBER_PAIR_WITH_DELIMITER, result);
    }

    @Test
    public void givenIllegalDelimiter_whenAdd_thenThrowsException() {
        Calculatrice calculatrice = new Calculatrice();

        Executable executable = () -> calculatrice.add(ANY_NUMBER_PAIR_WITH_DELIMITER_AT_THE_END);

        Assertions.assertThrows(CustomEx.class, executable);
    }

    @Test
    public void givenCustomDelimiteAndGarbageStrings_whenAdd_thenReturnsExpectREsult() {
        Calculatrice calculatrice = new Calculatrice();

        int result = calculatrice.add(ANY_NUMBER_PAIR_WITH_DELIMITER_AT_THE_START_AND_GARBAGE_CHARS);

        Assertions.assertEquals(EXPECTED_RESULT_FOR_ANY_NUMBER_PAIR_WITH_DELIMITER_AT_THE_START_AND_GARBAGE_CHARS, result);
    }

    @Test
    public void givenCustomDelimiterAndGarbageStrings_whenAdd_thenReturnsExpectREsult() {
        Calculatrice calculatrice = new Calculatrice();

        int result = calculatrice.add("//|\n1|2|3");

        Assertions.assertEquals(6, result);
    }

    @Test
    public void givenLongCustomDelimiter_whenAdd_thenReturnsExpectREsult() {
        Calculatrice calculatrice = new Calculatrice();

        int result = calculatrice.add("//|\n1|2|3");

        Assertions.assertEquals(6, result);
    }
}
