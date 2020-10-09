package aplication;

import personagem.Robo;

public class UI {

	public static Robo robo;
	
	public static void arena(Robo robo, int x, int y) {
		
		robo.posicaoDoAlimento(x, y);
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				
				if(robo.getPosicaoX() == i && robo.getPosicaoY() == j) {
					System.out.print(robo.getCor()+" ");
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
