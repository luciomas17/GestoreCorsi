package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestModel {
	
	public void run() {
		
		GestoreCorsi model = new GestoreCorsi();
		
		Map<Corso, Integer> iscrittiCorsi = model.getIscrittiCorsi(1);
		for(Entry<Corso, Integer> entry : iscrittiCorsi.entrySet()) {
			System.out.println(entry.getKey().getNome() + " = " + entry.getValue());
		}
		
		List<Studente> studenti = model.getStudenti("01PDYPG");
		for(Studente s : studenti)
			System.out.println(s.toString());
		
		
	}

	public static void main(String[] args) {
		TestModel main = new TestModel();
		main.run();
	}

}
