package application;

import java.util.Locale;
import java.util.Scanner;

import entities.conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double deposit = 0;
		int i = 0;
		conta acc;
		
		
		System.out.print("Enter account number: ");
		int accnumber = sc.nextInt();
		System.out.print("Enter holder name: ");
		
		//Consumir quebra de linha
		sc.nextLine();
		String holder = sc.nextLine();
		
		do {
			
			System.out.print("Is there a initial deposit?(y/n): ");
			char response = sc.next().charAt(0);
			
			//Não declarar variaveis dentro das condições
			if (response == 'y') {
				System.out.print("Enter inicial deposit: ");
				deposit = sc.nextDouble();
				acc = new conta(accnumber, holder, deposit);
				i++;
				
			}
			else if (response == 'n'){
				acc = new conta(accnumber, holder);
				i++;
			}
			else {
				System.out.print("Please enter y for yes or n for no");
				System.out.println();
			}
		} while (i<1);
		
		acc = new conta(accnumber, holder, deposit);
		
		System.out.println("Account data: ");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		acc.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);		
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		sc.close();
	}
}
