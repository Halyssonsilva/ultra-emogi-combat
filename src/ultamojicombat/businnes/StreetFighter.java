package ultamojicombat.businnes;

import ultamojicombat.model.Lutador;

public class StreetFighter extends Luta {

	public StreetFighter(Lutador desafiado, Lutador desafiante) {
		super(desafiado, desafiante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lutar() {
		// TODO Auto-generated method stub
		super.lutar();
	}

	public void atribuirCategoria(Lutador lutador) {
		if (lutador.getPeso() < 52.2) {
			lutador.setCategoria("Invalido");
		} else if (lutador.getPeso() <= 70.3) {
			lutador.setCategoria("leve");
		} else if (lutador.getPeso() <= 83.9) {
			lutador.setCategoria("médio");
		} else if (lutador.getPeso() <= 120.2) {
			lutador.setCategoria("pesado");
		} else {
			lutador.setCategoria("invalido");
		}
	}

	@Override
	protected void validarLuta() {
		validarCategoria();
		// validaLutadoresDiferentes();

	}

}
