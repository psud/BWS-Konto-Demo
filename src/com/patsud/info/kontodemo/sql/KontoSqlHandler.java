package com.patsud.info.kontodemo.sql;

public class KontoSqlHandler {

	private long id;
	private int kontoNummer;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getKontoName() {
		return kontoNummer;
	}

	public void setKontoName(int nummer) {
		this.kontoNummer = nummer;
	}

//	// Will be used by the ArrayAdapter in the ListView
//	@Override
//	public String toString() {
//		return kontoNummer;
//	}
}
