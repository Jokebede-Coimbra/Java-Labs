package com.jkbd.javalabs.aula13;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a quantidade de metros: ");
		double metros = sc.nextDouble();
		
		// 1m = 100 cm
		double cm = metros * 100;
		
		System.out.println(metros + "m é igual a " + cm + "cm");
	}

}
