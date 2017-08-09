package app;
import java.util.Scanner;
import entidade.*;
public class principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		
	cPoupanca poupanca = new cPoupanca();
	pessoa pessoa = new pessoa();
	ccSalario salario = new ccSalario();

		
			poupanca.setSaldo(100);
			salario.setSalario(1.500);
			pessoa.setNome("carlin");
			
	System.out.println();	
		
		
		
		System.out.println(poupanca.getSaldo() + ", " + salario.getSalario() * 1.20 + ", " + pessoa.getNome());
		
		}	
	
	
	}