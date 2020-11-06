import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] seatNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    String[] names = new String[15];
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < seatNum.length; i++) {
      System.out.println("What is your name? ");
      names[i] = scan.nextLine();

    }

    int count = 0;
    while (count <= 14) {
      System.out.println(names[count] + " sits in seat #" + seatNum[count]);
      count++;
    }

  }
}