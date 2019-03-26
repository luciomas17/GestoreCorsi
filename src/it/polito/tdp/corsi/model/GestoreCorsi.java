package it.polito.tdp.corsi.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.corsi.db.CorsoDAO;

public class GestoreCorsi {

	public List<Corso> getCorsiByPeriodo(int periodo) {
		CorsoDAO dao = new CorsoDAO();
		
		return dao.listCorsiByPD(periodo);
	}

	public int getNumeroIscrizioniByPeriodo(int periodo) {
		CorsoDAO dao = new CorsoDAO();
		
		return dao.countNumeroIscrizioniByPD(periodo);
	}

	public List<String> getNomeCorsi() {
		CorsoDAO dao = new CorsoDAO();
		List<String> corsi = new ArrayList<String>();
		
		for(Corso c : dao.listCorsi())
			corsi.add(c.getNome());
		
		return corsi;
	}
}
