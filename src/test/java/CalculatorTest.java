import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  @Test
  public void DollorCalculatorTest() {
    // given
    MarketApi market = new MarketApi();
    Calculator calculator = new Calculator(new DollarCalculator(market));

    // when
    int result = calculator.sum(10, 10);

    // then
    Assertions.assertEquals(22000, result);
  }

}
