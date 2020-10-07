package aplication;

import personagem.Robo;

public class Program {

	public static void main(String[] args) {

		Robo robo = new Robo("Rosa");

		
			System.out.println(robo);
			UI.arena(robo);

			robo.moverRobor("DOWN");
			robo.moverRobor("DOWN");
			robo.moverRobor("DOWN");
			
			robo.moverRobor("UP");
			robo.moverRobor("UP");
			

			robo.moverRobor("Right");
			robo.moverRobor("Right");
			robo.moverRobor("Right");
		
			System.out.println();
			
			UI.arena(robo);

			System.out.println(robo);
		
	}

}
