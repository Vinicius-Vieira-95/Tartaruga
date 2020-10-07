package personagem;

import exception.MovimentoInvalidoException;

public class Robo {

	private int posicaoX;
	private int posicaoY;
	private String cor;
	
	public Robo(String cor) {
		this.cor = cor;
		posicaoX = 0;
		posicaoY = 0;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Cor: "+cor +" :" + posicaoX + ":" + posicaoY;
	}
	
	public void moverRobor(String comando) throws MovimentoInvalidoException {
		
		if(comando.equalsIgnoreCase("RIGHT")) {
			this.posicaoY =  posicaoY + 1; 
		}
		if(comando.equalsIgnoreCase("LEFT")) {
			this.posicaoY = posicaoY -1;
		}
		if(comando.equalsIgnoreCase("DOWN")) {
			this.posicaoX = posicaoX + 1;
		}
		if(comando.equalsIgnoreCase("UP")) {
			this.posicaoX = posicaoX -1;
		}
		if(posicaoX < 0 || posicaoX > 10 || posicaoY < 0 || posicaoY > 10) {
			throw new MovimentoInvalidoException("Personagem fora do campo da arena");
		}
		
	}
	
	public void posicaoDoAlimento(int x, int y) {
		
		
		
	}
	

}
