package aplication;

import java.util.Random;
import java.util.Scanner;

import exception.MovimentoInvalidoException;
import personagem.Robo;
import personagem.RoboInteligente;

public class Program3 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		Robo robo1 = new Robo("Cinza");
		Robo robo2 =new RoboInteligente("Azul");
		
		System.out.println("Posione o alimento 0 a 9");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		
		while(robo1.posicaoDoAlimento(x, y) == false || robo2.posicaoDoAlimento(x, y) == false) {
			
			try {
			arena(robo1,robo2, x,y);
			int n = random.nextInt(4)+1;
			robo1.moverRobo(n);
			int m = random.nextInt(4)+1;
			robo2.moverRobo(m);
			
			System.out.println(robo1);
			System.out.println(robo2);
			}
			catch(MovimentoInvalidoException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		scan.close();
	}

	public static void arena(Robo robo1, Robo robo2, int x, int y) {

		robo1.posicaoDoAlimento(x, y);
		robo2.posicaoDoAlimento(x, y);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				if (robo1.getPosicaoX() == i && robo1.getPosicaoY() == j) {
					System.out.print(robo1.getCor() + " ");
				} else if (robo2.getPosicaoX() == i && robo2.getPosicaoY() == j) {
					System.out.println(robo2.getCor() + " ");
				} else if (x == i && y == j) {
					System.out.print("  *  ");
				} else {
					System.out.print("  -  ");
				}

			}
			System.out.println();
		}
	}
}
