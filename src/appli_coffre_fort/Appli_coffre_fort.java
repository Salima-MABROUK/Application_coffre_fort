package appli_coffre_fort;

import java.util.ArrayList;
import java.util.Scanner;

public class Appli_coffre_fort {

	
	public static void main(String[] args) {

		//Décalaration des variables

		String password;
		String password_c="Salima";
		ArrayList<String> tentatives = new ArrayList<String>();
		Scanner lecteur= new Scanner(System.in);

		//Entrer un password
		System.out.println("entrez un password: ");

		//lire le password
		lecteur.nextLine();
		//affecter le text écrit à password
		password=lecteur.nextLine();

		//definir la boucle while
		while (!password.equals(password_c)) {
			tentatives.add(password);
			System.out.println("C'est faux! Entrez un nouveau password: ");
			password=lecteur.nextLine();
		}
		System.out.println("Félicitation le mot de passe est correcte!");
		System.out.println(tentatives);
		System.out.println();

	}

}
