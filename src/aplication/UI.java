package aplication;

import personagem.Robo;

public class UI {

	
	public static void arena(Robo robo) {
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				
				if(robo.getPosicaoX() == i && robo.getPosicaoY() == j) {
					System.out.print(robo.getCor());
				}
				else {
					System.out.print(" - ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	public static void posionarRobo() {
		
		
		
	}
	

}
