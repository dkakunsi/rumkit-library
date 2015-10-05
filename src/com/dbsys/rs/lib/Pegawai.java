package com.dbsys.rs.lib;

public interface Pegawai {

	public Long getId();
	public void setId(Long id);

	public String getNip();
	public void setNip(String nip);

	public Penduduk getPenduduk();
	public void setPenduduk(Penduduk penduduk);

	public abstract String getName();

}
