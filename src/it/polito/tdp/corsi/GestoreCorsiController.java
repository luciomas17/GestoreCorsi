package it.polito.tdp.corsi;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.corsi.model.GestoreCorsi;
import it.polito.tdp.corsi.model.Corso;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GestoreCorsiController {

	private GestoreCorsi model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txtResult;

    @FXML
    private TextField txtPeriodo;

    @FXML
    private Button btnCercaCorsi;

    @FXML
    private Button btnStatCorsi;

    @FXML
    private TextField txtCorso;

    @FXML
    private Button btnCercaStudenti;

    @FXML
    private Button btnDivStudenti;

    @FXML
    void doCalcolaStatCorsi(ActionEvent event) {
    	int periodo;
    	
    	try {
			periodo = Integer.parseInt(txtPeriodo.getText());
		} catch (NumberFormatException e) {
			txtResult.appendText("Devi inserire un periodo (1 o 2)\n");
			return;
		}
    	if(periodo != 1 && periodo !=2) {
    		txtResult.appendText("Devi inserire un periodo (1 o 2)\n");
			return;
    	}
    	
    	txtResult.appendText(this.model.getNumeroIscrizioniByPeriodo(periodo) + " iscritto/i ai corsi nel periodo " + periodo + "\n");
    }

    @FXML
    void doCercaCorsi(ActionEvent event) {
    	int periodo;
    	
    	try {
			periodo = Integer.parseInt(txtPeriodo.getText());
		} catch (NumberFormatException e) {
			txtResult.appendText("Devi inserire un periodo (1 o 2)\n");
			return;
		}
    	if(periodo != 1 && periodo !=2) {
    		txtResult.appendText("Devi inserire un periodo (1 o 2)\n");
			return;
    	}
    	
    	List<Corso> corsi = this.model.getCorsiByPeriodo(periodo);
    	for(Corso c : corsi) {
    		txtResult.appendText(c.toString() + "\n");
    	}
    }
    
    @FXML
    void doCercaStudenti(ActionEvent event) {

    }

    @FXML
    void doDividiStudentiTraCDS(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'GestoreCorsi.fxml'.";
        assert txtPeriodo != null : "fx:id=\"txtPeriodo\" was not injected: check your FXML file 'GestoreCorsi.fxml'.";
        assert btnCercaCorsi != null : "fx:id=\"btnCercaCorsi\" was not injected: check your FXML file 'GestoreCorsi.fxml'.";
        assert btnStatCorsi != null : "fx:id=\"btnStatCorsi\" was not injected: check your FXML file 'GestoreCorsi.fxml'.";
        assert txtCorso != null : "fx:id=\"txtCorso\" was not injected: check your FXML file 'GestoreCorsi.fxml'.";
        assert btnCercaStudenti != null : "fx:id=\"btnCercaStudenti\" was not injected: check your FXML file 'GestoreCorsi.fxml'.";
        assert btnDivStudenti != null : "fx:id=\"btnDivStudenti\" was not injected: check your FXML file 'GestoreCorsi.fxml'.";

    }
    
    public void setModel(GestoreCorsi model) {
    	this.model = model;
    }
    
}
