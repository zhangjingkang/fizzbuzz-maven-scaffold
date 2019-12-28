import FizzBuzz.FizzBuzz;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void test() {
        assertThat(FizzBuzz.justDoIt(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.justDoIt(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.justDoIt(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.justDoIt(17)).isEqualTo("17");
    }
}
