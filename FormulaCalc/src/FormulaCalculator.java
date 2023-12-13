// write a program that creates a metric system by creating the formulas for these conversions. 
// km to miles : use 113 as the Km. (70.214923). Miles to kilometers: use 23 as the miles, 37.01482. Celsius to faherenheit : use 145 as the Celsius, 293.0. Kg to pounds: use88 as the kg. 
//Meters to feet : use 52 as the meters, 170.60368.
// Inches to centimeters : use 21 as the inches. 53.34. Mph to kph ; use 60 as the miles.

public class FormulaCalculator {
	public static void main(String[] args) {
		double K1 = 113;
		double m1 = .621371;
		double result = K1 * m1;
		System.out.println(result);
		int m2 = 23;
		double km2 = 1.60934;
		double result2 = m2 * km2;
		System.out.println(result2);

		int cel2 = 145;
		double fah2 = (cel2 * 9 / 5) + 32;
		System.out.println(fah2);
		int kg = 88;
		double pg = 2.20462;
		double result3 = kg * pg;
		System.out.println(result3);
		
		int Me1 = 52;
		double ft1 = 3.28084;
		double result4 = Me1 * ft1;
		System.out.println(result4);
		
		int inc1 = 21;
		double cen1 = 2.54;
		double result5 = inc1 * cen1;
			System.out.println(result5);
			
			int mi1 = 60;
			double kill = 1.60934;
			double result6 = mi1 * kill;
			System.out.println(result6);

	}
}
