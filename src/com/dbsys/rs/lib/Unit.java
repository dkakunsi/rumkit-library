package com.dbsys.rs.lib;

public class Unit {

	protected Long id;
	protected String nama;
	protected Float bobot;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public Float getBobot() {
		return bobot;
	}

	public void setBobot(Float bobot) {
		this.bobot = bobot;
	}
}
