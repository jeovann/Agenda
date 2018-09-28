package aula2;

import java.time.LocalDate;

public class Teste {
	
	public static void main (String[] args) {
		
		Pessoa pessoa = new Pessoa ("Astrogildo", LocalDate.of(1976, 7, 16), Double.valueOf("1.89"));
		
		System.out.println(pessoa);
	    Agenda agenda = new Agenda();
	    
	    agenda.add("joaozinho", LocalDate.of(2000, 7, 16), 1.59);
	    agenda.add("jeovan", LocalDate.of(2011, 8, 21), 1.72 );
	    agenda.add("Pitomba", LocalDate.of(2000, 3, 24), 1.76);
	    agenda.add("Ribana", LocalDate.of(1999, 2, 21), 1.45 );
	    agenda.add("Queribas", LocalDate.of(1989, 1, 6), 1.72 );
	    agenda.add("Monica", LocalDate.of(1974, 4, 1), 1.76);
	    agenda.add("Abilio", LocalDate.of(1997, 5, 30), 1.76);
	    agenda.add("Jeremias", LocalDate.of(1997, 8, 25), 1.77);
	    agenda.add("Estevao", LocalDate.of(1978, 5, 3), 1.65);
	    agenda.add("Lauro", LocalDate.of(1989, 7, 24), 1.81);
	    
	    System.out.println();
	    agenda.imprimirAgenda();
	    	    
	    System.out.println("Remover da lista Monica");
	    agenda.removePessoa("Monica");
	    
	   System.out.println();
	   agenda.imprimirAgenda();
	   
	   System.out.println();
	   agenda.imprimirPessoa(8);
	}
}