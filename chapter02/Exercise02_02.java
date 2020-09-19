package chapter02;

import java.util.Scanner;

public class Exercise02_02 {

	public static void main(String[] args) {
		double yaricap, yukseklik ;
		
		double pi = 3.14159265359;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Silindirin hacmini hesaplamak icin yarýcapý ve yukseklik giriniz : ");
		
		yaricap = input.nextDouble();
		yukseklik = input.nextDouble();
		
		double alan  = yaricap * yaricap * pi ;
		double hacim = alan * yukseklik ;
		
		System.out.println("Silindirin Alani : "+alan);
		System.out.println("Silindirin Hacmi : "+hacim);

	}

}
