
import java.sql.*;
import java.util.ArrayList;

public class Main {
	public static void main (String [] args){
		// Sylvain est passé par la !!! ;)
		Model unModel = new Model (); 
		Connection connexion = unModel.connexion(); // Chargement du driver et connection a la BDD
		//unModel.insererContact(3, "Tarrade", "Nicolas");
		ArrayList <Contact> lesContacts = unModel.afficherContact();
		for (Contact c : lesContacts) {
			System.out.println(c.getidPersonne()  + " " + c.getNom() + " " + c.getPrenom());
		}
	}
}

