package chapter05;

public class Exercise05_12 {

	public static void main(String[] args) {
		int n = 0;
		while (Math.pow(n, 2) <= 12.000) {

			while (Math.pow(n, 2) < 12000)
				n++;
		}
		System.out.println("Karesi 12000'den kucuk en buyuk n tam sayisi :" + n);
	}

}
