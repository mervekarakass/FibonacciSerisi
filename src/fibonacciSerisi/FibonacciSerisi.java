package fibonacciSerisi;

import java.util.Scanner;

public class FibonacciSerisi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// kullanicidan eleman sayisini al
		System.out.print("Fibonacci serisi icin eleman sayisini giriniz: ");
		int elemanSayisi = scanner.nextInt();
		
		// fibonacci serisini hesapla ve ekrana yazdir
		System.out.println("Fibonacci serisi: ");
		for (int i = 0; i < elemanSayisi; i++) {
			System.out.print(fibonacciHesapla(i) + " ");
			
		}

	}
	
	// fibonacci serisini hesaplayan metod
	public static int fibonacciHesapla(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacciHesapla(n - 1) + fibonacciHesapla(n - 2);
		}
		
	}

}
