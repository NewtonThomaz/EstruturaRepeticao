package estruturaRepeticao1;
import java.util.Scanner;

public class QuintaRepeticao {

	public static void main(String[] args) {
		int n, f = 1;
		Scanner ler = new Scanner (System.in);
		System.out.println("Qual é o número que deseja fazer o fatorial?");
		n = ler.nextInt();
		for (int i=n ; i>=1; i--) {
			f *= i;
		}
		System.out.println(n + " fatorial é " + f);
		ler.close();
	}
}