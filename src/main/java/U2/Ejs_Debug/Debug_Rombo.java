package U2.Ejs_Debug;

public class Debug_Rombo {
  public static void main(String[] args) {

    int altura = 9;

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura; j++) {
        if ((j >= altura / 2 - i)
            && (j <= altura / 2 + i)
            && (j >= i - altura / 2)
            && (j <= altura + altura / 2 - 1 - i)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
