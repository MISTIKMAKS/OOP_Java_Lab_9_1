package Lab9_1;

import java.util.Scanner;
import java.lang.Math;

public class Linear extends Root {

    private double result;

    public Linear(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public double getA() {
    	return a;
    }

    public void setA(double a) throws Exception {
    	if(a == 0){
    		//System.out.println("Value [a] mustn't be 0!");
    		throw new Exception("Value [a] mustn't be 0!");
    	}
    	else {
        	this.a = a;
    	}
    }

    public double getB() {
    	return b;
    }

    public void setB(double b) {
    	this.b = b;
    }

    @Override
    public double Result()
    {
        result = -(b/a);
        return result;
    }

    @Override
    public void Print()
    {
    	System.out.println("-------------------------");
    	System.out.print("Linear Result: ");
    	System.out.println(result);
    	System.out.println("-------------------------");
    }

	@Override
	public double Result_A() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Result_B() {
		// TODO Auto-generated method stub
		return 0;
	}

}
