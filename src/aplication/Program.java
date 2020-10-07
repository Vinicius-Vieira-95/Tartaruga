package aplication;

import personagem.Robo;

public class Program {

	public static void main(String[] args) {
		
		Robo robo = new Robo("Rosa");
		System.out.println(robo);

		UI.arena(robo);
	}

}
