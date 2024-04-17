package estruturaRepeticao1;
import java.util.Scanner;

public class QuartaRepeticao {

	public static void main(String[] args) {
		int n, im = 0 , p = 0;
		Scanner ler = new Scanner (System.in);
		for (int i=1; i<=10; i++) {
			System.out.println("informe os números");
			n = ler.nextInt();
			if (n%2 == 0) {
				p++;
			}else {
				im++;
			}
		}
		System.out.println("A soma de todos os números pares é " + p + " e a soma de todos os números impares é " + im);
		ler.close();
	}
}