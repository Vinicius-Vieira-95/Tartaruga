package aplication;

import java.util.Scanner;

import exception.MovimentoInvalidoException;
import personagem.Robo;

public class Program2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Robo robo1 = new Robo("Rosa");
		Robo robo2 = new Robo("Preto");

		System.out.println("Comando do robo");
		System.out.println(" 1 - UP");
		System.out.println(" 2 - DOWN");
		System.out.println(" 3 - LEFT");
		System.out.println(" 4 - RIGHT");

		System.out.println("Posiocione o alimento de 0 a 9");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println();
		
		while (true) {

			try {
			arena(robo1, robo2, num1, num2);
			
			System.out.print(" Comando :  ");
			System.out.println(robo1.getCor());
			int n = scan.nextInt();
			robo1.moverRobo(n);
			
			System.out.println(robo2.getCor());
			n = scan.nextInt();
			robo2.moverRobo(n);
			
			
			System.out.println(robo1);
			System.out.println(robo2);
			}
			catch(MovimentoInvalidoException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println();

		}

	}
	
	public static void arena(Robo robo1, Robo robo2, int x, int y) {
		
		robo1.posicaoDoAlimento(x, y);
		robo2.posicaoDoAlimento(x, y);
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				
				if(robo1.getPosicaoX() == i && robo1.getPosicaoY() == j) {
					System.out.print(robo1.getCor()+" ");
				}
				else if(robo2.getPosicaoX() == i && robo2.getPosicaoY() == j) {
					System.out.println(robo2.getCor()+" ");
				}
				else if(x == i && y == j) {
					System.out.print("  *  ");
				}
				else {
					System.out.print("  -  ");
				}
				
			}
			System.out.println();
		}
	}

}
