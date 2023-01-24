import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class BigChar {

  private char value;
  private String bigChar;

  public BigChar(char value) {
    this.value = value;
    try {
      File file = new File("big/big" + value + ".txt");
      Scanner scanner = new Scanner(file);
      while (scanner.hasNext()) {
        if (bigChar == null) {
          bigChar = scanner.nextLine() + "\n";
        } else {
          bigChar += scanner.nextLine() + "\n";
        }
      }
      scanner.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void print() {
    if (bigChar != null) {
      System.out.print(bigChar);
    } else {
      System.out.print(Character.toString(value) + '?');
    }
  }
}