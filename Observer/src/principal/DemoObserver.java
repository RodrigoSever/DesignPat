package principal;

import observer.AuditoriaObserver;
import observer.DadosObserver;
import observer.SujeitoAtualizar;

public class DemoObserver {

	
	public static void main(String[] args){
		SujeitoAtualizar sujeito = new SujeitoAtualizar();
		
		new AuditoriaObserver(sujeito);
		new DadosObserver(sujeito);
		
		
		System.out.println("Primeira notifica��o aos observadores...");
		sujeito.setNotificacao();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Segunda notifica��o aos observadores...");
		sujeito.setNotificacao();
	}
}
