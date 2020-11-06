import java.util.Scanner;//adds the scanner

class Main {
  public static void main(String[] args) {
    int[] seatNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };//number of seats
    String[] names = new String[15];
    Scanner scan = new Scanner(System.in);//adding in the scanner for the user input
    for (int i = 0; i < seatNum.length; i++) {//for loop for the numbers
      System.out.println("What is your name? ");
      names[i] = scan.nextLine();//Question for the scanner.

    }

    int count = 0;
    while (count <= 14) {// while loop for the names
      System.out.println(names[count] + " sits in seat #" + seatNum[count]);//print statement for everything
      count++;
    }

  }
}