package it.polito.tdp.corsi.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;
import it.polito.tdp.corsi.db.StudenteDAO;

public class GestoreCorsi {

	public List<Corso> getCorsiByPeriodo(int periodo) {
		CorsoDAO dao = new CorsoDAO();
		
		return dao.listCorsiByPD(periodo);
	}

	public Map<String, String> getNomeCorsi() {
		CorsoDAO dao = new CorsoDAO();
		Map<String, String> corsi = new LinkedHashMap<String, String>();
		
		for(Corso c : dao.listCorsi())
			corsi.put(c.getCodins(), c.getNome());
		
		return corsi;
	}
	
	public Map<Corso, Integer> getIscrittiCorsi(int periodo) {
		CorsoDAO dao = new CorsoDAO();
		
		return dao.getIscrittiCorsi(periodo);
	}

	public List<Studente> getStudenti(String codins) {
		StudenteDAO dao = new StudenteDAO();
		
		return dao.getStudenti(codins);
	}
}
