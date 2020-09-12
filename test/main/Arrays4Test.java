package main;

import main.Arrays4;
import main.Main;
import main.Num4isMissingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Arrays4Test {
    private Arrays4 arrays4;

    @BeforeEach
    void setUp() {
        arrays4 = new Arrays4();
    }

    @Test
    void shouldMetodChangeArrAfterLast4IsWorking() { // я понимаю, что это "тупой тест", как ты говоришь, но даже он не запускается...
        Integer[] arrayInt2 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        Integer[] intar = new Integer[] {1, 7};

        //arrays4.changeArrAfterLast4(arrayInt2);
        Assertions.assertArrayEquals(intar, arrays4.changeArrAfterLast4(arrayInt2));
    }

    @Test
    void shouldThrowNum4isMissingException() {

        Assertions.assertThrows(Num4isMissingException.class, () -> {
            Integer[] arrayInt = new Integer[]{0,2,3,5,6};
            arrays4.changeArrAfterLast4(arrayInt);
        });
    }

    @NullSource
    @ParameterizedTest
    void shouldIsEmptyArray(Integer[] inputF){
        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                arrays4.changeArrAfterLast4(inputF);

            }
        });
    }

    /// тесты для метода "isThere1or4"

    @Test
    void shouldNumbers1or4Match(){
        Integer[] arrayInt2 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        Assertions.assertTrue(arrays4.isThere1or4(arrayInt2));
    }

    @Test
    void shouldNumbers1or4notMatch() {
        Integer[] arrayInt = new Integer[]{0,2,3,5,6};
        Assertions.assertFalse(arrays4.isThere1or4(arrayInt));
    }

    @NullAndEmptySource
    @ParameterizedTest
    void shouldBeArrayIsEmptyOrNull(Integer[] arr) {
        Assertions.assertFalse(arrays4.isThere1or4(arr));
    }

    @MethodSource ("differentVariants")
    @ParameterizedTest
    void shouldChekNum1or4Match (List<Integer> arrList) {
        Integer[] arr = arrList.toArray(new Integer[arrList.size()]);
        Assertions.assertTrue(arrays4.isThere1or4(arr));
    }
    static Stream<List<Integer>> differentVariants() {
        return Stream.of(
                Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(0, 1, -5, 6, 9),
                Arrays.asList(2, 5, 7, 9, 4)
                //Arrays.asList(0,0,2)

        );
    }





}
