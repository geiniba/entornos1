package com.entornosPrimi.entornosPrimi;

import java.util.Scanner;
public class hola {

	public static void main(String[] args) {
		Scanner tecladin = new Scanner(System.in);  
		int array[] = new int [8];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int suma = 0;
		int contm3 = 0;
		
		for (int i=0; i<array.length;i++) {
	        System.out.println("Introduce el " +(i+1)+"º numero");
	        array[i]= tecladin.nextInt();
	       }
		for(int j=0; j<array.length;j++) {
			if(array[j]>max) {
	      		max = array[j];
			}
		}
		 for(int j=0; j<array.length; j++) {
	         	if(array[j]<min) {
	         		min = array[j];
	         	if(array[j] % 3 == 0) {
	         		contm3++;
	         	}
	     }
	         	if(array[j] % 2 == 0) {
	         		suma += array[j];
	         	}
	     }
		 int restamm = max - min;
		 System.out.println("el mayor numero es: " + max + " y el menor: " + min);
		 System.out.println("la cantidad de numeros que son multiplos de 3 es " + contm3 + " y las suma de pares es " + suma);
		 System.out.println("la diferencia entre el numero mas alto y el mas bajo es de "+ restamm);
		 tecladin.close();
	}

}
