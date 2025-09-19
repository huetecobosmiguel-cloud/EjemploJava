package com;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int pri, seg, ter, bol;
		float exp;
		
		System.out.println("Introduzca su nota del 1º Trimestre:");
		pri = sc.nextInt();
		System.out.println("Introduzca su nota del 2º Trimestre:");
		seg = sc.nextInt();
		System.out.println("Introduzca su nota del 3º Trimestre:");
		ter = sc.nextInt();
		
		bol = (pri + seg + ter) / 3;
		exp = (float) (pri + seg + ter) / 3;
	}
}
