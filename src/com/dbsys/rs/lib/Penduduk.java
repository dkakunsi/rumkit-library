package com.dbsys.rs.lib;

import java.sql.Date;

public class Penduduk {

	public enum Kelamin {
		PRIA, WANITA
	}

	protected Long id;
	protected String kode;
	protected String nik;
	protected String nama;
	protected Kelamin kelamin;
	protected Date tanggalLahir;
	protected String darah;
	protected String agama;
	protected String telepon;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getKode() {
		return kode;
	}
	
	public void setKode(String kode) {
		this.kode = kode;
	}
	
	public String getNik() {
		return nik;
	}
	
	public void setNik(String nik) {
		this.nik = nik;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public Kelamin getKelamin() {
		return kelamin;
	}
	
	public void setKelamin(Kelamin kelamin) {
		this.kelamin = kelamin;
	}
	
	public Date getTanggalLahir() {
		return tanggalLahir;
	}
	
	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	
	public String getDarah() {
		return darah;
	}
	
	public void setDarah(String darah) {
		this.darah = darah;
	}
	
	public String getAgama() {
		return agama;
	}
	
	public void setAgama(String agama) {
		this.agama = agama;
	}
	
	public String getTelepon() {
		return telepon;
	}
	
	public void setTelepon(String telepon) {
		this.telepon = telepon;
	}
}
