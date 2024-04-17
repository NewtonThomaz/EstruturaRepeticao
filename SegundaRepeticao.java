package estruturaRepeticao1;
import java.util.Scanner;

public class SegundaRepeticao {

	public static void main(String[] args) {
		int inicio, fim;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Qual será o inicio do intervalo que deseja calcular?");
		inicio = ler.nextInt();
		
		System.out.println("Qual será o fim do intervalo que deseja calcular?");
		fim = ler.nextInt();
		
		for (int i=inicio; i<= fim; i++) {
			if (i%2 == 0) {
				System.out.println(i +" é par");
			}else {
				System.out.println(i + " é impar");
			}
		}ler.close();
	}
}