package estruturaRepeticao1;
import java.util.Scanner;

public class TerceiraRepeticao {

	public static void main(String[] args) {
		double n, s = 0, m;
		
		Scanner ler = new Scanner (System.in);
		
		for (int i=1; i<=5; i++) {
			System.out.println("informe os números");
			 n = ler.nextDouble();
			 s += n;
		}ler.close();
		m = s/5;
		System.out.println("A soma dos numeros escolhidos é " + s + "e a média deles é: " + m);
	}
}