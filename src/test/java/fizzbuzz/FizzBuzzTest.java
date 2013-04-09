package fizzbuzz;

import org.hamcrest.Matcher;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test @Ignore
    public void theFirstElementIs1() {
        assertThat("1", isEqualToElementAt(0));
    }

    @Test @Ignore
    public void theThirdElementIsFizz() {
        assertThat("Fizz", isEqualToElementAt(2));
    }

    @Test @Ignore
    public void theFifthElementIsBuzz() {
        assertThat("Buzz", isEqualToElementAt(4));
    }

    @Test @Ignore
    public void theFifteenthElementIsFizzBuzz() {
        assertThat("FizzBuzz", isEqualToElementAt(14));
    }

    private Matcher<String> isEqualToElementAt(int element) {
        final String[] output = new FizzBuzz().run().split("\n");
        return equalTo(output[element]);
    }
}
