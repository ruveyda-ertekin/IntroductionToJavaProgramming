package chapter01;

public class Exercise01_11 {

	public static void main(String[] args) {
		
		System.out.println("Her 7 saniyede bir dogum.");
		System.out.println("Her 13 saniyede bir olum.");
		System.out.println("her 45 saniyede yeni bir göcmen gelmektedir.");
		System.out.println("Suan nufus 312,032,486'dir");
		
		int SuankiNufus = 312032486 ;
		
		int birYilKacSaniye = 365 * 24 * 60 * 60 ;
		int yillikDogum = birYilKacSaniye / 7 ;
		int yillikOlum  = birYilKacSaniye / 13 ;
		int yillikMulteci = birYilKacSaniye / 45 ;
		
		int yillikArtis= yillikDogum - yillikOlum + yillikMulteci ;
		
		System.out.println("1.yil nufus tahmini = "+(SuankiNufus + (yillikArtis))) ;
		System.out.println("2.yil nufus tahmini = "+(SuankiNufus + (2 * yillikArtis))) ;
		System.out.println("3.yil nufus tahmini = "+(SuankiNufus + (3 * yillikArtis))) ;
		System.out.println("4.yil nufus tahmini = "+(SuankiNufus + (4 * yillikArtis))) ;
		System.out.println("5.yil nufus tahmini = "+(SuankiNufus + (5 * yillikArtis))) ;
	}

}
