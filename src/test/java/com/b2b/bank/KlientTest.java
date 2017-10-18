package com.b2b.bank;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import com.b2b.bank.domain.Klient;
import com.b2b.bank.util.Utils;

public class KlientTest {

	@Test
	public void CzyListaKlientowBankuNieJestPusta() {

		Utils utils = new Utils();
		List<Klient> klienci = utils.stworzDomyslnaListeKlientowMillenium();
		assertEquals(false, klienci.isEmpty());
	}

	@Test
	public void CzyListaKlientowZawieraMalka() {
		Utils utils = new Utils();
		List<Klient> klienci = utils.stworzDomyslnaListeKlientowMillenium();
		boolean czyJestMalek = false;
		for (Klient klient : klienci) {
			if (klient.getNazwisko().equals("Malek")) {
				czyJestMalek = true;
			}
		}
		assertEquals(true, czyJestMalek);
	}

	@Test
	public void CzyListaKlientowZawieraTomasz() {
		Utils utils = new Utils();
		List<Klient> klienci = utils.stworzDomyslnaListeKlientowMillenium();
		boolean czyJestTomasz = false;
		for (Klient klient : klienci) {
			if (klient.getImie().equals("Tomasz")) {
				czyJestTomasz = true;
			}
		}
		assertEquals(true, czyJestTomasz);
	}

	@Test
	public void CzyWszyscyKlienciMajaPrawidlowyRokUrodzenia() {
		Utils utils = new Utils();
		List<Klient> klienci = utils.stworzDomyslnaListeKlientowMillenium();
		boolean czyNieprawidlowyRokUrodzenia = false;
		for (Klient klient : klienci) {
			if (klient.getRokUrodzenia() == 0) {
				czyNieprawidlowyRokUrodzenia = true;
			}
		}
		assertEquals(false, czyNieprawidlowyRokUrodzenia);
	}

	@Test
	public void czyWszyscyKlienciMajaDodadniesaldo() {
		Utils utils = new Utils();
		List<Klient> klienci = utils.stworzDomyslnaListeKlientowMillenium();
		boolean ujemneSaldo = false;
		for (Klient klient : klienci) {
			if (klient.getStanKonta() < 0) {
				ujemneSaldo = true;
			}
		}
		assertEquals(false, ujemneSaldo);
	}
}
