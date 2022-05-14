package Lab9_1;

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Linear:");
        Root line = new Linear(2, 3);
        System.out.println(line.Result());
        line.Print();

        System.out.println("");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("");

        System.out.println("Square:");
        Root square = new Square(9, -12, -5);
        System.out.println((double) Math.round(square.Result_A() * 100) / 100);
        System.out.println((double) Math.round(square.Result_B() * 100) / 100);
        square.Print();

	}

}
