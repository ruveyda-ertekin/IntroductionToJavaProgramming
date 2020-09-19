package chapter02;

public class Exercise02_08 {

	public static void main(String[] args) {
		
		long toplamMilisaniye = System.currentTimeMillis();
		
		System.out.println("toplamMilisaniye = "+toplamMilisaniye);
		long toplamSaniye = toplamMilisaniye / 1000 ;
		
		System.out.println("toplamSaniye = "+toplamSaniye);
		long suankiSaniye = toplamSaniye % 60 ;
		
		System.out.println("suankiSaniye ="+suankiSaniye);
		long toplamDakika = toplamSaniye / 60 ;
		
		System.out.println("toplamDakika ="+toplamDakika);
		long suankiDakika = toplamDakika % 60 ;
		
		System.out.println("suankiDakika ="+suankiDakika);
		long toplamSaat = toplamDakika / 60 ;
		
		System.out.println("toplamSaat"+toplamSaat);
		long suankiSaat = toplamSaat % 24 ;
		
		System.out.println("suankiSaat = " + suankiSaat);
		
		System.out.println(suankiSaat + ":" + suankiDakika + ":" + suankiSaniye + " GMT");
		
	}

}
