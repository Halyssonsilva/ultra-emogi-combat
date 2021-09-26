package ultamojicombat.runner;

import java.util.Scanner;

import ultamojicombat.businnes.Luta;
import ultamojicombat.businnes.StreetFighter;
import ultamojicombat.businnes.Torneio;
import ultamojicombat.businnes.UFC;
import ultamojicombat.model.Lutador;

public class UltaEmojiCombat {

	public static void main(String[] args) {
		Torneio torneio = new Torneio();
	    torneio.definirLutadores();
        Lutador desafiante = new Lutador();
        Lutador desafiado = new Lutador();
			/**
			 * this is a fight of the type UFC,and this kind of one it is not allowed start
			 * a fight with different sex fighters.
			 */
			Luta UEC01 = new UFC(desafiante, desafiado);
			UEC01.lutar();
			
			/**
			 * this is a fight of the type Street fighter,and this kind of one it is allowed
			 * start a fight with different sex fighters. //
			 */
//			System.out.println("Resultado para a luta do tipo STREET FIGHTER\n");
//			Luta sf01 = new StreetFighter(desafiante, desafiado);
//			sf01.lutar();
	
	
		
	private static String definirCampeao(Lutador desafiado, Lutador desafiante) {
		String nomeCampeao = null;
		if (desafiado.getVitorias() > desafiante.getVitorias()) {
			nomeCampeao = desafiado.getNome();
		} else {
			nomeCampeao = desafiante.getNome();

		} 
		return nomeCampeao;
	}

	

	
}

//private static void iniciarLutas(Lutador desafiado, Lutador desafiante) {
//while (desafiado.getVitorias() < 5 && desafiante.getVitorias() < 5) {
//}
//}
//iniciarLutas(desafiado, desafiante); 
//System.out.println("Campeão:"+definirCampeao(desafiado, desafiante));
