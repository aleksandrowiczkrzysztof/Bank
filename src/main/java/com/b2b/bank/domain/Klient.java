package com.b2b.bank.domain;

public class Klient {
	public Klient(String nazwisko, double stanKonta) {
		super();
		this.nazwisko = nazwisko;
		this.stanKonta = stanKonta;
	}

	private String imie;
	private String nazwisko;
	private int rokUrodzenia;
	private double stanKonta;

	public double getStanKonta() {
		return stanKonta;
	}

	public void setStanKonta(double stanKonta) {
		this.stanKonta = stanKonta;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		if (imie.length() > 2) {
			this.imie = imie;
		} else {
			this.imie = "";

		}
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getRokUrodzenia() {
		return rokUrodzenia;
	}

	public void setRokUrodzenia(int rokUrodzenia) {
		if (rokUrodzenia < 1900 || rokUrodzenia > 2009) {
			this.rokUrodzenia = 0;
		} else {
			this.rokUrodzenia = rokUrodzenia;
		}

	}
}
