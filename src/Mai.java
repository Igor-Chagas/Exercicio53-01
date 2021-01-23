import java.util.Scanner;

public class Mai {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor, entre com um numero pertencente ao intervalo de 1 a 1000, inclusive:");
		int x = sc.nextInt();
		
		while (x < 1 || x > 1000) {
		System.out.println("Valor invalido.\nPor favor, entre com um numero pertencente ao intervalo de 1 a 1000, inclusive:");
		x = sc.nextInt();
		}
		
		for (int i=0; i<=x; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}

