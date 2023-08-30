package calculator;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        float numberOne = reader.nextFloat();
        System.out.println("Enter second Number : ");
        float numberTwo = reader.nextFloat();
        System.out.println("The available operations are : ");
        System.out.println("1.Addition");
        System.out.println("2.Subraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter Your Choice");
        int userChoice = reader.nextInt();
        switch(userChoice) {
            case 1: System.out.println(numberOne+numberTwo);
                    break;
            case 2: System.out.println(numberOne-numberTwo);
                    break;
            case 3: System.out.println(numberOne*numberTwo);
                    break;
            case 4: System.out.println(numberOne/numberTwo);
                    break;
            default: System.out.println("Retry");
                    break;
        }    
        reader.close();
	}

}
