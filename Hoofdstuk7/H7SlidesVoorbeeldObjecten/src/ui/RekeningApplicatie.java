package ui;

import domein.Rekening;

public class RekeningApplicatie {

	public static void main(String[] args) {
		
		Rekening rekening = new Rekening(123456789, "SDG");
		rekening.stortOp(100); //object methode
		System.out.println("info rekening");
		System.out.println("houder = " + rekening.getHouder());

	}

}
