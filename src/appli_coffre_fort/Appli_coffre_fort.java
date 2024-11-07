package appli_coffre_fort;

import java.util.ArrayList;
import java.util.Scanner;

public class Appli_coffre_fort {

	//Étapes de l'algorithme :


	//1-déclaration des variables :
	//password,password_c, le tableau et la fonction pour lire,

	//2-Initialisation des variables :

	//Définir le password correct.
	//Un tableau pour stocker les tentatives incorrectes.
	//Une variable pour la tentative de l'utilisateur.

	//-Boucle pour les tentatives de l'utilisateur :

	//-Tant que l'utilisateur n'a pas deviné le bon mot de passe :
	//-Demander à l'utilisateur de saisir un mot de passe.
	//-Comparer le mot de passe entré avec le mot de passe correct.
	//-Si le mot de passe est incorrect, l'ajouter au tableau des tentatives incorrectes.
	//-Si le mot de passe est correct, sortir de la boucle.

	//4-Affichage des tentatives incorrectes :
	//-Afficher toutes les tentatives incorrectes à la fin.

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
