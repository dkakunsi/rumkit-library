package com.dbsys.rs.lib;

public class Dokter extends Pegawai {

	public enum Spesialisasi {
		UMUM, MATA, BEDAH, KANDUNGAN
	}
	
	protected Spesialisasi spesialisasi;

	public Spesialisasi getSpesialisasi() {
		return spesialisasi;
	}

	public void setSpesialisasi(Spesialisasi spesialisasi) {
		this.spesialisasi = spesialisasi;
	}
}
