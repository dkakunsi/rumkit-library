package com.dbsys.rs.lib;

public class Tindakan {
	
	public enum Satuan {
		TINDAKAN, HARI, JAM
	}

	protected Long id;
	protected String kode;
	protected String nama;
	protected Long tarif;
	protected KategoriTindakan kategori;
	protected Kelas kelas;
	protected Tanggungan tanggungan;
	protected Satuan satuan;
	protected String keterangan;

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

	public Long getTarif() {
		return tarif;
	}

	public void setTarif(Long tarif) {
		this.tarif = tarif;
	}

	public KategoriTindakan getKategori() {
		return kategori;
	}

	public void setKategori(KategoriTindakan kategori) {
		this.kategori = kategori;
	}

	public Kelas getKelas() {
		return kelas;
	}

	public void setKelas(Kelas kelas) {
		this.kelas = kelas;
	}

	public Tanggungan getTanggungan() {
		return tanggungan;
	}

	public void setTanggungan(Tanggungan tanggungan) {
		this.tanggungan = tanggungan;
	}

	public Satuan getSatuan() {
		return satuan;
	}

	public void setSatuan(Satuan satuan) {
		this.satuan = satuan;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
}
