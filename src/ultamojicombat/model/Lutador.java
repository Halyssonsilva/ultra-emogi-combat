package ultamojicombat.model;

import java.util.Objects;

public class Lutador {
	// Atributos

	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	/**
	 * construtor da classe Lutador
	 * 
	 * @param nome
	 * @param nacionalidade
	 * @param idade
	 * @param altura
	 * @param peso
	 * @param sexo
	 */
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, String sexo) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}

	public Lutador() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Lutador [nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + ", altura=" + altura
				+ ", peso=" + peso + ", sexo=" + sexo + ", categoria=" + categoria + ", vitorias=" + vitorias
				+ ", derrotas=" + derrotas + ", empates=" + empates + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nacionalidade, nome, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lutador other = (Lutador) obj;
		return Objects.equals(nacionalidade, other.nacionalidade) && Objects.equals(nome, other.nome)
				&& Objects.equals(sexo, other.sexo);
	}

}
