package aplication;

import java.util.Scanner;

import personagem.Robo;

public class Program {

	public static void main(String[] args) {

		Robo robo = new Robo("Rosa");
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("Comando do robo");
		System.out.println(" 1 - UP");
		System.out.println(" 2 - DOWN");
		System.out.println(" 3  RIGHT");
		System.out.println(" 4 - LEFT");
		
		System.out.println("Posiocione o alimento de 0 a 9");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println();
		while(true){
			
			UI.arena(robo, num1, num2);
			System.out.print(" Comando :  ");
			int n = scan.nextInt();
			
			if(n == 1) {
				robo.moverRobor("UP");
			}
			else if( n == 2) {
				robo.moverRobor("DOWN");
			}
			else if( n == 3) {
				robo.moverRobor("RIGHT");
			}
			else if(n == 4) {
				robo.moverRobor("LEFT");
			}
			
			System.out.println(robo);
			System.out.println();
			
		}
		
		
	}

}
