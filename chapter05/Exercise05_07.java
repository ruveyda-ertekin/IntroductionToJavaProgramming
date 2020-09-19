package chapter05;

public class Exercise05_07 {

	public static void main(String[] args) {
		int okulUcreti = 10000;
		int toplamUcret = 0;
		int onYillikUcret = 0;

		for (int y = 1; y <= 14; y += 1) {
			okulUcreti += okulUcreti * (0.05);
			if (y > 10)
				toplamUcret += okulUcreti;

			if (y == 10)
				onYillikUcret = okulUcreti;
		}
		System.out.println("Tuition in ten years : $" + onYillikUcret);

		System.out.println("Total cost for four years worth of tuition" + " after the tenth year :$" + toplamUcret);
	}

}
