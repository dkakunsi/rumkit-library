package com.dbsys.rs.lib.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("DOKTER")
public class Dokter extends Pegawai {

	public enum Spesialisasi {
		UMUM, MATA, BEDAH, KANDUNGAN
	}

	private Spesialisasi spesialisasi;

	public Dokter() {
		super();
	}

	public Dokter(Spesialisasi spesialisasi) {
		super();
		setSpesialisasi(spesialisasi);
	}

	@Column(name = "spesialisasi")
	public Spesialisasi getSpesialisasi() {
		return spesialisasi;
	}

	public void setSpesialisasi(Spesialisasi spesialisasi) {
		this.spesialisasi = spesialisasi;
	}

	@Override
	@Transient
	public String getName() {
		return "DOKTER";
	}
}
