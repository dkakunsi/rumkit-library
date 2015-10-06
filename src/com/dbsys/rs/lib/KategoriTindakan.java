package com.dbsys.rs.lib;

import java.util.List;

public class KategoriTindakan {

	protected Long id;
	protected String nama;
	protected KategoriTindakan parent;

	protected List<KategoriTindakan> daftarSubKategori;
	protected List<Tindakan> daftarTindakan;
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
	public KategoriTindakan getParent() {
		return parent;
	}
	public void setParent(KategoriTindakan parent) {
		this.parent = parent;
	}
	public List<KategoriTindakan> getDaftarSubKategori() {
		return daftarSubKategori;
	}
	public void setDaftarSubKategori(List<KategoriTindakan> daftarSubKategori) {
		this.daftarSubKategori = daftarSubKategori;
	}
	public List<Tindakan> getDaftarTindakan() {
		return daftarTindakan;
	}
	public void setDaftarTindakan(List<Tindakan> daftarTindakan) {
		this.daftarTindakan = daftarTindakan;
	}
}
