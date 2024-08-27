import java.util.Scanner;

public class BowTic{
    public static void main(String[] args){
        System.out.println("Bow Tie");
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int size = keyboard.nextInt();
        keyboard.nextLine();

        int start = size / 2 * -1;
        int end = size / 2;
        
        for (int row = start; row <= end; row++) {
            for (int col = start; col <= end; col++) {
//         for (int row = 1; row <= size; row++) {
//            for (int col = 1; col <= size; col++) {
  //              System.out.print("(" + Math.abs(row) + "," + Math.abs(col) + ") ");
//                System.out.print("(" + row + "," + col + ") ");
                if (Math.abs(row) > Math.abs(col)) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }

        keyboard.close();
    }
}