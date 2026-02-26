package teste;

import java.util.Scanner;

public class Tesetes {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner (System.in);
		
		String escreva = sc1.next();
		
		switch (escreva) {
	    case "Lâmpada":
	        for (int giro = 1; giro >= 5; giro++) {
	            System.out.println("Estou girando no sentido horário " + giro );
	        } 
	        
	   
	        System.out.println("Lâmpada trocada com sucesso...");
	        break; 
	        
	    case "Upload":
	    	for(double baixar = 1; baixar <= 7; baixar++) {
	    		System.out.println("Está baixando " + baixar + "mbps");
	    	}
	    	
	    	break;
	    	
	    case "Atravessar":
	    	for(int segundos = 1; segundos <= 4; segundos++) {
	    		System.out.println("Estou atravessando uma rua em " + segundos + " segundos");
	    	} 
	    	
	    	break;
	}
		
		}
	
	
		}


