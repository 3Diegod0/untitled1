import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int number = 0;
        for (char symbol : line.toCharArray()) {
            System.out.print(symbol + "  ");
        }
        System.out.print("\n");
        for (char symbol : line.toLowerCase().toCharArray()) {
            if (symbol >= 'а' && symbol <= 'я' || symbol == 'ё') {
                if (symbol == 'ё')
                    number = 7;
                else if (symbol >= 'ж')
                    number = symbol - 'а' + 2;
                else
                    number = symbol - 'а' + 1;
                if (number >9)
                    System.out.print(number +" ");
                else
                    System.out.print(number+"  ");

            }
            else System.out.print("   ");
        }
    }
}