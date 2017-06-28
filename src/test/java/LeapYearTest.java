import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {
  @Test
  public void isLeapYear_forNumbersDisvisibleByFour_true() {
    LeapYear leapyear = new LeapYear();
    assertEquals(true, leapyear.isLeapYear(2012));
  }

  @Test
  public void isLeapYear_forNumbersNotDisvisibleByFour_false() {
    LeapYear leapYear = new LeapYear ();
    assertEquals(false, leapYear.isLeapYear(1999));
  }

  @Test
  public void isLeapYear_forMultiplesofOneHundred_false() {
    LeapYear leapYear = new LeapYear();
    assertEquals(false, leapYear.isLeapYear(1900));
  }

  @Test
  public void isLeapYear_forMultiplesofFourHundred_true() {
    LeapYear leapYear = new LeapYear();
    assertEquals(true, leapYear.isLeapYear(2000));
  }
}
