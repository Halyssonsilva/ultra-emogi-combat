package ultamojicombat.businnes;

import java.util.Random;

import ultamojicombat.model.Lutador;

public abstract class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	/**
	 * instacia luta valida
	 * 
	 * @param desafiado
	 * @param desafiante
	 */
	public Luta(Lutador desafiado, Lutador desafiante) {
		super();
		this.desafiado = desafiado;
		atribuirCategoria(desafiado);
		this.desafiante = desafiante;
		atribuirCategoria(desafiante);
		validarLuta();

	}

	protected void validarLuta() {

		validarCategoria();
		validaLutadoresDiferentes();
		validarSexo();

	}

	protected void validarSexo() {

		if (!desafiado.getSexo().equals(desafiante.getSexo())) {
			throw new IllegalArgumentException("Luta Invalida sexo diferente");
		}
	}

	protected void validaLutadoresDiferentes() {
		if (desafiado.equals(desafiante)) {
			throw new IllegalArgumentException("Luta Invalida lutadores iguais");
		}
	}

	protected void validarCategoria() {
		if (!desafiante.getCategoria().equals(desafiado.getCategoria())) {
			throw new IllegalArgumentException("Luta Invalida categoria diferente");
		}

	}

	public void lutar() {

		System.out.println("### DESAFIADO  ###");
		apresentar(desafiado);
		System.out.println("### DESAFIANTE ###");
		apresentar(desafiante);

		Random aleatorio = new Random();
		int vencedor = aleatorio.nextInt(3);
		switch (vencedor) {

		case 0: // Empate
			System.out.println("RESULTADO DA LUTA");
			System.out.println("Empatou!");
			empatar(desafiado);
			empatar(desafiante);
			break;

		case 1: // desafiado vence
			System.out.println("A vitória vai para " + this.desafiado.getNome());
			ganhar(desafiado);
			perder(desafiante);
			apresentar(desafiado);

			break;

		case 2: // desafiante vence
			System.out.println("A Vitória vai para " + this.desafiante.getNome());
			ganhar(desafiante);
			perder(desafiado);
			apresentar(desafiante);
			break;
		}
	}
	public void apresentar1(Lutador desafiante) {
		System.out.println(desafiante);
	}
	public void apresentar(Lutador desafiado) {
		System.out.println(desafiado);
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;

	}

	public void ganhar(Lutador lutador) {
	lutador.setVitorias(lutador.getVitorias() + 1);
	}
	

	public void perder(Lutador lutador) {
		lutador.setDerrotas(lutador.getDerrotas() + 1);
	}

	public void empatar(Lutador lutador) {
		lutador.setEmpates(lutador.getEmpates() + 1);
	}
	


	public abstract void atribuirCategoria(Lutador lutador);

}
