package com.dbsys.rs.lib;

import java.sql.Date;

public interface Penduduk {

	public enum Kelamin {
		PRIA, WANITA
	}

	public Long getId();
	public void setId(Long id);

	public String getKode();
	public void setKode(String kode);

	public String getNik();
	public void setNik(String nik);

	public String getNama();
	public void setNama(String nama);

	public Kelamin getKelamin();
	public void setKelamin(Kelamin kelamin);

	public Date getTanggalLahir();
	public void setTanggalLahir(Date tanggalLahir);

	public String getDarah();
	public void setDarah(String darah);

	public String getAgama();
	public void setAgama(String agama);

	public String getTelepon();
	public void setTelepon(String telepon);

}
