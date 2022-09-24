package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 5, 8, 12, 7 };

		int aranacak = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}

		}

		if (varMi) {
			mesajVer("Aranan sayı mevcuttur:" + aranacak);
		} else {
			mesajVer("Aranan sayı mevcut değildir" + aranacak);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
