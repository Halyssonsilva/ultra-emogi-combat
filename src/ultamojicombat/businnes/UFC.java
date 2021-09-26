package ultamojicombat.businnes;

import ultamojicombat.model.Lutador;

public class UFC extends Luta {

	public UFC(Lutador desafiado, Lutador desafiante) {
		super(desafiado, desafiante);
		// TODO Auto-generated constructor stub
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

}
