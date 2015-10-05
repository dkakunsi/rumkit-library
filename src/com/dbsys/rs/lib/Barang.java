package com.dbsys.rs.lib;

public interface Barang {

	public Long getId();
	public void setId(Long id);

	public String getKode();
	public void setKode(String kode);

	public String getNama();
	public void setNama(String nama);

	public Long getJumlah();
	public void setJumlah(Long jumlah);

	public String getSatuan();
	public void setSatuan(String satuan);

	public Long getHarga();
	public void setHarga(Long harga);

	public Tanggungan getTanggungan();
	public void setTanggungan(Tanggungan tanggungan);
	
	public abstract String getName();

}
