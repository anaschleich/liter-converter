package aula01;

import java.util.Scanner;

public class StudyPage {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in); //aceitar um termo
		double numeroGaloes;
		
		
		System.out.println("Digite o n�mero de gal�es para convers�o em Litros: ");
		numeroGaloes = ler.nextDouble();
		
		double conversorLitros = numeroGaloes*3.785;
		System.out.println("Em litros: " + conversorLitros);

	}

}
