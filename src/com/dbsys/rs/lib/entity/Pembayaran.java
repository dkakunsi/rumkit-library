package com.dbsys.rs.lib.entity;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pembayaran")
public class Pembayaran {

	private String kode;
	private Date tanggal;
	private Time jam;
	private Long jumlah;
	
	private Pasien pasien;
	
	private List<Pelayanan> listPelayanan;
	private List<Pemakaian> listPemakaian;

	@Id
	@Column(name = "kode")
	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	@Column(name = "tanggal")
	public Date getTanggal() {
		return tanggal;
	}

	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}

	@Column(name = "jam")
	public Time getJam() {
		return jam;
	}

	public void setJam(Time jam) {
		this.jam = jam;
	}

	@Column(name = "jumlah")
	public Long getJumlah() {
		return jumlah;
	}

	public void setJumlah(Long jumlah) {
		this.jumlah = jumlah;
	}

	@ManyToOne
	@JoinColumn(name = "pasien")
	public Pasien getPasien() {
		return pasien;
	}

	public void setPasien(Pasien pasien) {
		this.pasien = pasien;
	}

	@OneToMany(mappedBy = "pembayaran", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	public List<Pelayanan> getListPelayanan() {
		return listPelayanan;
	}

	public void setListPelayanan(List<Pelayanan> listPelayanan) {
		this.listPelayanan = listPelayanan;
	}

	@OneToMany(mappedBy = "pembayaran", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	public List<Pemakaian> getListPemakaian() {
		return listPemakaian;
	}

	public void setListPemakaian(List<Pemakaian> listPemakaian) {
		this.listPemakaian = listPemakaian;
	}
	
	public String generateKode() {
		kode = String.format("%s-%s-%s", pasien.hashCode(), tanggal.hashCode(), jam.hashCode());
		
		return kode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jam == null) ? 0 : jam.hashCode());
		result = prime * result + ((jumlah == null) ? 0 : jumlah.hashCode());
		result = prime * result + ((kode == null) ? 0 : kode.hashCode());
		result = prime * result + ((pasien == null) ? 0 : pasien.hashCode());
		result = prime * result + ((tanggal == null) ? 0 : tanggal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pembayaran other = (Pembayaran) obj;
		if (jam == null) {
			if (other.jam != null)
				return false;
		} else if (!jam.equals(other.jam))
			return false;
		if (jumlah == null) {
			if (other.jumlah != null)
				return false;
		} else if (!jumlah.equals(other.jumlah))
			return false;
		if (kode == null) {
			if (other.kode != null)
				return false;
		} else if (!kode.equals(other.kode))
			return false;
		if (pasien == null) {
			if (other.pasien != null)
				return false;
		} else if (!pasien.equals(other.pasien))
			return false;
		if (tanggal == null) {
			if (other.tanggal != null)
				return false;
		} else if (!tanggal.equals(other.tanggal))
			return false;
		return true;
	}
}
