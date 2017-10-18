package com.b2b.bank;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.b2b.bank.domain.Bank;
import com.b2b.bank.domain.Klient;
import com.b2b.bank.util.Utils;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class BankTest {
	@org.junit.Test
	public void czyListaBankowNieJestPusta() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();

		assertEquals(false, banki.isEmpty());
	}

	@org.junit.Test
	public void czyListaBankowZawieraBankMillenium() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czyJestBankMillenium = false;
		for (Bank bank : banki) {
			if (bank.getNazwaBanku().equals("Millenium")) {
				czyJestBankMillenium = true;
			}
			assertEquals(true, czyJestBankMillenium);
		}
	}

	@org.junit.Test
	public void czyBankMa2Klientow() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czyJest2Klientow = false;
		for (Bank bank : banki) {
			if (bank.getNazwaBanku().equals("Millenium")) {
				if (bank.getKlienci().size() == 2) {
					czyJest2Klientow = true;
				}
				assertEquals(true, czyJest2Klientow);
			}
		}

	}

	@org.junit.Test
	public void czyStanWszystkichKontWiekszyNiz1000() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czyJestPowyzej1000 = true;
		for (Bank bank : banki) {
			double sumStanKontKlientow = 0;
			for (Klient klient : bank.getKlienci()) {
				sumStanKontKlientow = sumStanKontKlientow + klient.getStanKonta();
			}
			if (sumStanKontKlientow < 1000) {
				czyJestPowyzej1000 = false;
			}
		}
		assertEquals(true, czyJestPowyzej1000);
	}

	@org.junit.Test
	public void czyStanKontWiekszyNiz100() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czyJestPowyzej100 = true;
		for (Bank bank : banki) {
			double StanKontKlientow = 0;
			for (Klient klient : bank.getKlienci()) {
				StanKontKlientow = klient.getStanKonta();
				if (StanKontKlientow < 100) {
					czyJestPowyzej100 = false;
				}
			}

		}
		assertEquals(true, czyJestPowyzej100);
	}

	@org.junit.Test
	public void czyWszyscyKlienciMajaPrawidloweImiona() {

		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czyImionaSaPrawidlowe = true;
		for (Bank bank : banki) {
			for (Klient klient : bank.getKlienci()) {
				if (klient.getImie().isEmpty()) {

					czyImionaSaPrawidlowe = false;
				}
			}
		}

		assertEquals(true, czyImionaSaPrawidlowe);

	}
}