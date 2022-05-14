package Lab9_1;

import java.util.Scanner;
import java.lang.Math;

public class Square extends Root {

	private double c;
    private double result_a;
    private double result_b;

    public Square(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
    	return a;
    }

    public void setA(double a) {
        	this.a = a;
    }

    public double getB() {
    	return b;
    }

    public void setB(double b) {
    	this.b = b;
    }

    public double get—() {
    	return c;
    }

    public void set—(double Ò) {
    	this.c = Ò;
    }

	@Override
	public double Result_A() {
		double d = 0;
        d = Math.pow(b, 2) - (4 * a * c);
        result_a = (-b + Math.sqrt(d)) / (2 * a);
        return result_a;

	}

	@Override
	public double Result_B() {
		double d = 0;
        d = Math.pow(b, 2) - (4 * a * c);
        result_b = (-b - Math.sqrt(d)) / (2 * a);
        return result_b;
	}

    @Override
    public void Print()
    {
    	System.out.println("-------------------------");
    	System.out.print("Square Result_A: ");
    	System.out.println((double) Math.round(result_a * 100) / 100);
    	System.out.print("Square Result_B: ");
        System.out.println((double) Math.round(result_b * 100) / 100);

    	System.out.println("-------------------------");
    }

    @Override
    public double Result()
    {
    	// TODO Auto-generated method stub
    	return 0;
    }

}
