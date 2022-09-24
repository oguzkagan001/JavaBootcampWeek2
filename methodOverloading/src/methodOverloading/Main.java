package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int toplam1;
		int toplam2;
		toplam1=dortIslem.topla(5,3);
		toplam2=dortIslem.topla(3, 9, 6);
		System.out.println(toplam1);
		System.out.println(toplam2);

	}

}
