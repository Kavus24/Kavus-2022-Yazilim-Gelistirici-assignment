package odev2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Merhaba Java");
		System.out.println("Merhaba Java2");

		// Course 6 VARIABLES

		int ogrenciSayisi = 12;
		String mesaj = "Öğrenci Sayısı";
		System.out.println(mesaj + " " + ogrenciSayisi);
		System.out.println(mesaj + " " + ogrenciSayisi);
		System.out.println(mesaj + " " + ogrenciSayisi);
		System.out.println(mesaj + " " + ogrenciSayisi);

		// Course 7 DATA TYPES

		byte sayi1 = 127;
		byte sayi2 = -128;
		// short , long, int;
		// float ,double
		double sayi3 = 12.9;

		String sehir = "Ankara";
		// 6 eleman(karakterden oluşan bir dizidir)
		char karakter = 'A';

		boolean dogruMu = true;

		// Course 8 IFs (Conditionals)

		int sayi = 20;
		if (sayi < 20) {

			System.out.println("Sayı 20'den küçüktür.");

		} else if (sayi == 20) {

			System.out.println("Sayı 20'ye eşittir.");

		} else {

			System.out.println("Sayı 20'den büyüktür.");

		}

		// Course 9 Create a Program reCapDemo1

		int number1, number2, number3;
		number1 = 266;
		number2 = 25;
		number3 = 26;

		int enBuyuk = number1;

		if (enBuyuk < number2) {

			enBuyuk = number2;

		}

		if (enBuyuk < number3) {

			enBuyuk = number3;

		}

		System.out.println("En Büyük = " + enBuyuk);

		// Course 10 Switch Demo

		char grade = 'K';

		switch (grade) {

		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;

		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;

		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;

		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;

		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;

		default:
			System.out.println("Geçersiz not giridiniz");

		}

		// Course 11 Loop Demo

		// for
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");

		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");

		// Course 12 While Loop Demo

		// while
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("While Döngüsü Bitti");

		// Course 13 Do While Loop
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);

		System.out.println("Do While Döngüsü Bitti");

		// Course 14 Arrays Demo
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";

		for (int k = 0; k < ogrenciler.length; k++) {
			System.out.println(ogrenciler[k]);
		}

		System.out.println("--------------------------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);

		}

		// Course 15 Arrays ReCap
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];

		for (double number : myList) {

			if (max < number) {

				max = number;
			}

			total = total + number;
			System.out.println(number);
		}

		System.out.println("Toplam = " + total);
		System.out.println("En büyük sayı " + +max);

		// Course 16 Arrays that have more one dimension
				String[][] sehirler = new String[3][3];
				sehirler[0][0] = "İstanbul";
				sehirler[0][1] = "Bursa";
				sehirler[0][2] = "Bilecik";
				sehirler[1][0] = "Ankara";
				sehirler[1][1] = "Konya";
				sehirler[1][2] = "Kayseri";
				sehirler[2][0] = "Diyarbakır";
				sehirler[2][1] = "Şanlıurfa";
			 	sehirler[2][2] = "Gaziantep";
				
				for(int k=0; k<=2;k++) {
					System.out.println("-------------------------");
					for(int m=0;m<=2;m++) {
						System.out.println(sehirler[k][m]);
					}
					
					//Course 17 Strings Demo
					
					String text = "Bugün hava çok güzel";
					System.out.println(text);
					
					System.out.println("Eleman Sayısı : " +text.length());
					System.out.println("5. eleman " + text.charAt(4));
					System.out.println(text.concat(" Yaşasın!"));
					System.out.println(text.startsWith("B"));
					System.out.println(text.endsWith("."));
					
					char[] karakterler = new char[5];
					text.getChars(0,5,karakterler, 0);
					System.out.println(karakterler);
					System.out.println(text.indexOf("a"));
					System.out.println(text.lastIndexOf("a"));
					
					//Course 18 Stings Demo2
					
					String newText = text.replace(' ', '-');
					System.out.println(newText);
					System.out.println(text.substring(2));
					System.out.println(text.substring(2, 5));
					
					for (String kelime : text.split(" ")) {
						System.out.println(kelime);
					}
					
					System.out.println(text.toLowerCase());
					System.out.println(text.toUpperCase());
					
					System.out.println(text.trim());
					
					//Course 19 Prime Number
					
					int number = -1;
					int remainder = number % 2;
					System.out.println(remainder);
					boolean isPrime = true;
					
					if(number == 1) {
						System.out.println("Sayı asal değildir.");
						break;
					}
					
					if(number < 1) {
						System.out.println("Geçersiz sayı");
						break;
					}
					
					for (int z=2; z<number; z++) {
						 if(number % z == 0) {
							 isPrime = false;
						 } 
					}
					
					if (isPrime) {
						System.out.println("Sayı asaldır.");
					} else {
						System.out.println("Sayı asal değildir.");
					}
					
					
					
				}
		
	}

}
