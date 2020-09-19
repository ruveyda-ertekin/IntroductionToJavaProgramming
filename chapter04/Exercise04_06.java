package chapter04;

public class Exercise04_06 {

	public static void main(String[] args) {
		double radius = 40;

		double angle1 = (Math.random() * (Math.PI * 2));
		double angle2 = (Math.random() * (Math.PI * 2));
		double angle3 = (Math.random() * (Math.PI * 2));

		// x = r * cos(a)
		// y = r * sin(a)
		double x1 = radius * Math.cos(angle1);
		double y1 = radius * Math.sin(angle1);
		double x2 = radius * Math.cos(angle2);
		double y2 = radius * Math.sin(angle2);
		double x3 = radius * Math.cos(angle3);
		double y3 = radius * Math.sin(angle3);

		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

		System.out.println("The three angles are " + Math.round(angleA * 100) / 100.0 + " "
				+ Math.round(angleB * 100) / 100.0 + " " + Math.round(angleC * 100) / 100.0);

	}

}
