package chapter05;

public class Exercise05_23 {

	public static void main(String[] args) {

		double soldanSaga = 0;
		double sagdanSola = 0;

		for (double n = 1.0; n <= 50000.0; n++) {
			soldanSaga = soldanSaga + (1 / n);
		}
		System.out.print("Soldan Saga : " + soldanSaga);

		System.out.println();

		for (double n = 50000.0; n >= 1; n--) {
			sagdanSola = sagdanSola + (1 / n);
		}
		System.out.print("Sagdan Sola : " + sagdanSola);

	}

}
