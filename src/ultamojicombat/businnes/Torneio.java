package ultamojicombat.businnes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ultamojicombat.model.Lutador;

public class Torneio {
	
	Scanner leitor = new Scanner(System.in);
	List<Lutador> listaLutadores= new ArrayList<Lutador>();
	public List<Lutador> definirLutadores() {
		System.out.println("informe a quantidade de lutadores");
		int quantidadeDeLutadores=leitor.nextInt();
		for (int idsenha = 1; idsenha <= quantidadeDeLutadores; idsenha++) {
			Lutador lutador = lerDadosLutador();
			listaLutadores.add(lutador);
		}
		return listaLutadores; 
	}
	
	
	private  Lutador lerDadosLutador() {
		
		Lutador lutador = new Lutador();
		leitor.nextLine();
		System.out.println("informe seu nome");
		lutador.setNome(leitor.nextLine());

		System.out.println("informe sua nacionalidade");
		lutador.setNacionalidade(leitor.nextLine());

		System.out.println("informe seu sexo");
		lutador.setSexo(leitor.nextLine());

		System.out.println("informe seu peso");
		lutador.setPeso(leitor.nextDouble());

		System.out.println("informe sua altura");
		lutador.setAltura( leitor.nextDouble());

		System.out.println("informe sua idade");
		lutador.setIdade( leitor.nextInt());
		//leitor.close();
		return lutador;
		
	}
}
