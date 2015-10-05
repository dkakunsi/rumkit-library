package com.dbsys.rs.lib;

public interface Dokter {

	public enum Spesialisasi {
		UMUM, MATA, BEDAH, KANDUNGAN
	}

	public Spesialisasi getSpesialisasi();
	public void setSpesialisasi(Spesialisasi spesialisasi);

}
