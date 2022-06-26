package jana60.registrazione.utente;

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("inserire il nome: ");
			String nome = scan.nextLine();
			System.out.println("inserire il cognome: ");
			String cognome = scan.nextLine();
			
			System.out.println("inserire l'età: ");
			int eta = Integer.parseInt(scan.nextLine());
			
			System.out.println("Inserire la  password: ");
			String password = scan.nextLine();
			System.out.println("inserire email: ");
			String email = scan.nextLine();
			
			Utente nuovoUtente = new Utente(nome, cognome, eta , email, password);
			
			System.out.println("Account creato con i dati: ");
			System.out.println(nuovoUtente.toString());
			
		} catch(NumberFormatException nfe) {
			System.out.println("l'input inserito non è un numero valido");
			System.out.println(nfe.getMessage());
		} catch(Exception e) {
			System.out.println("impossibile creare l'account");
			System.out.println(e.getMessage()); 
		} finally {
			System.out.println("Arrivederci!");
		}
		
		
		scan.close();


	}

}
