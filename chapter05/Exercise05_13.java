package chapter05;

public class Exercise05_13 {

	public static void main(String[] args) {
		int n = 0;
		while (Math.pow(n, 3) < 12000) {
			while (Math.pow(n, 3) <= 12000) {
				n++;
			}

		}
		System.out.println("Karesi 12000'den kucuk en buyuk n saysisi:" + (--n));
	}

}
