
public class Main {

	//Course 27  Class nedir? Course 28 Class Nasıl Çalışır?
	//Course 29 Değer ve Referans tipleleri anlamak
	
	public static void main(String[] args) {
		
		//referencw type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		
		//value type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1= 30;
		System.out.println(sayi2);
		
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
	}

}