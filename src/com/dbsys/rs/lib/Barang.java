package com.dbsys.rs.lib;

public class Barang {

	protected Long id;
	protected String kode;
	protected String nama;
	protected Long jumlah;
	protected String satuan;
	protected Long harga;
	protected Tanggungan tanggungan;

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

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Long getJumlah() {
		return jumlah;
	}

	public void setJumlah(Long jumlah) {
		this.jumlah = jumlah;
	}

	public String getSatuan() {
		return satuan;
	}

	public void setSatuan(String satuan) {
		this.satuan = satuan;
	}

	public Long getHarga() {
		return harga;
	}

	public void setHarga(Long harga) {
		this.harga = harga;
	}

	public Tanggungan getTanggungan() {
		return tanggungan;
	}

	public void setTanggungan(Tanggungan tanggungan) {
		this.tanggungan = tanggungan;
	}

	public String getName() {
		return "";
	}
}
