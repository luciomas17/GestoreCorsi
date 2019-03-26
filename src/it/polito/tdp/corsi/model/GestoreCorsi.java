package it.polito.tdp.corsi.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.corsi.db.CorsoDAO;

public class GestoreCorsi {

	public List<Corso> getCorsiByPeriodo(int periodo) {
		CorsoDAO dao = new CorsoDAO();
		
		// Filtro tramite Java
		/*List<Corso> corsi = dao.listAll();
		List<Corso> result = new ArrayList<Corso>();
		
		for(Corso c : corsi) {
			if(c.getPd() == periodo)
				result.add(c);
		}
				
		return result;
		*/
		
		// Filtro tramite SQL
		return dao.listCorsiByPD(periodo);
	}

}
