import java.text.DecimalFormat;
import java.util.Scanner;

public class Formattheoutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Circles radius: ");
		double radius = scan.nextInt();
		double area = 4*Math.PI * Math.pow(radius, 2);
		System.out.println("The circle area is: " + area);
		double volume = 4/3 * Math.PI * Math.pow(radius,3);
		System.out.println("The circle volume is: " + volume);
		
		
		DecimalFormat format1 = new DecimalFormat("0.##");
		System.out.println("The formatted circle area is: " + format1.format(area));
		System.out.println("The formatted circle volume is: " + format1.format(volume));		
		
		
	}

}
