package projetos_LPA.aula04;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		double horatrab, valorhora, salbruto, salliquido, inss;
		
		Scanner ler = new Scanner(System.in);
		
		// entrada
		System.out.println(" Horas de trabalho: ");
		horatrab = ler.nextDouble();

		System.out.println(" Qual o valor da hora? ");
		valorhora = ler.nextDouble();
		
		//processameto
		salbruto = horatrab*valorhora;
		inss = salbruto*0.12;
		salliquido = salbruto-inss;
		
		// Saída
		System.out.println(" O valor do salário bruto é: " + salbruto);
		System.out.println (" O valor do salário liquido é: " + salliquido);
		ler.close();


	}

}
