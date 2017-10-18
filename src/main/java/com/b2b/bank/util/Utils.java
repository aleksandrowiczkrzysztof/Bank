package com.b2b.bank.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.b2b.bank.domain.Bank;
import com.b2b.bank.domain.Klient;

public class Utils {
	private Scanner scanner;

	public Utils() {
		scanner = new Scanner(System.in);
	}

	public String nazwiskoKlienta() {
		return "nazwisko";

	}

	public List<Bank> stworzDomyslnaListeBankow() {
		List<Bank> banki = new ArrayList<>();
		List<Klient> klienci = stworzDomyslnaListeKlientowMillenium();
		banki.add(new Bank(klienci, "Millenium"));
		List<Klient> klienciPko = stworzDomyslnaListeKlientowBankPKO();
		banki.add(new Bank(klienciPko, "Bank PKO"));
		return banki;
	}

	public List<Klient> stworzDomyslnaListeKlientowBankPKO() {
		List<Klient> klienciPko = new ArrayList<>();
		Klient janek = new Klient( "Kowalska", 153.40);
		janek.setRokUrodzenia(1984);
		janek.setImie("Ania");
		klienciPko.add(janek);
		Klient piotrus = new Klient( "Kowal", 153.20);
		piotrus.setImie("Jan");
		piotrus.setRokUrodzenia(2005);
		klienciPko.add(piotrus);

		return klienciPko;

	}
	public List<Klient> stworzDomyslnaListeKlientowMillenium() {
		List<Klient> klienci = new ArrayList<>();
		Klient janek = new Klient( "Kowalski", 153.40);
		janek.setImie("Grazyna");
		janek.setRokUrodzenia(1984);
		klienci.add(janek);
		Klient piotrus = new Klient( "Malek", 53.20);
		piotrus.setImie("To");
		piotrus.setRokUrodzenia(2005);
		klienci.add(piotrus);

		return klienci;

}
}
