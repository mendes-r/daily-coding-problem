package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ProblemThirteenTest {


    static Stream<Arguments> arrayProviderForFive() {
        return Stream.of(
            Arguments.of((Object) new int[]{9, 11, 8, 5, 7, 10}),
            Arguments.of((Object) new int[]{1, 6}),
            Arguments.of((Object) new int[]{0, 2, 3, 5})
        );
    }

    static Stream<Arguments> arrayNotProfit() {
        return Stream.of(
            Arguments.of((Object) new int[]{0}),
            Arguments.of((Object) new int[]{6, 5, 3, 1}),
            Arguments.of((Object) new int[]{3, 3, 3, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("arrayProviderForFive")
    public void best_result_is_five(int[] array){
        //arrange
        int expected = 5;
        ProblemThirteen problemThirteen = new ProblemThirteen();
        //act
        int result = problemThirteen.answer(array);
        //assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("arrayNotProfit")
    public void noProfitPossible(int[] array){
        //arrange
        int expected = 5;
        ProblemThirteen problemThirteen = new ProblemThirteen();
        //act
        int result = problemThirteen.answer(array);
        //assert
        assertEquals(expected, result);
    }
    
}
