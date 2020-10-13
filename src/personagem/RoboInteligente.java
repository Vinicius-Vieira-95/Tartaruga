package personagem;

import exception.MovimentoInvalidoException;

public class RoboInteligente extends Robo {

	
	public RoboInteligente(String cor) {
		super(cor);
	}
	
	@Override
	public void moverRobo(int comando) throws MovimentoInvalidoException {
		
		if (comando == 1) {
			this.posicaoX = posicaoX - 1;
		}
		if (comando == 2) {
			this.posicaoX = posicaoX + 1;
		}
		if (comando == 3) {
			this.posicaoY = posicaoY - 1;
		}
		if (comando == 4) {
			this.posicaoY = posicaoY + 1;
		}
		if (posicaoX < 0 || posicaoX > 10 || posicaoY < 0 || posicaoY > 10) {
			
			if(posicaoX < 0) {
				this.posicaoX += 1;
			}
			else if( posicaoX > 10){
				this.posicaoX = -1;
			}
			else if(posicaoY < 0) {
				this.posicaoY +=1;
			}
			else if(posicaoY > 10) {
				this.posicaoY -=1;
			}
			
			throw new MovimentoInvalidoException("Personagem fora do campo da arena");
		}
		
	}

}
