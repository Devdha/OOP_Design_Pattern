import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {

  private Map<Character, BigChar> bigCharMap = new HashMap<>();

  private static class Singleton {

    private static final BigCharFactory INSTANCE = new BigCharFactory();
  }

  public static BigCharFactory getInstance() {
    return Singleton.INSTANCE;
  }

  public BigChar getBigChar(char value) {
    BigChar bigChar = bigCharMap.get(value);
    if (bigChar == null) {
      bigChar = new BigChar(value);
      bigCharMap.put(value, bigChar);
    }
    return bigChar;
  }
}