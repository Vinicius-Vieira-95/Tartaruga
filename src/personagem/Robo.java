package personagem;

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
	
	

}