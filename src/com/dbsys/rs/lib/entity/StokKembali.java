package com.dbsys.rs.lib.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("KEMBALI")
public class StokKembali extends Stok {
	
	private Pasien pasien;
	
	public StokKembali() {
		super();
		setJenis(JenisStok.MASUK);
	}

	@ManyToOne
	@JoinColumn(name = "pasien")
	public Pasien getPasien() {
		return pasien;
	}

	public void setPasien(Pasien pasien) {
		this.pasien = pasien;
	}
	
	public Long hitungPengembalian() {
		return barang.getHarga() * jumlah;
	}
	
	@Override
	public void setJenis(JenisStok jenis) {
		jenis = JenisStok.MASUK;
		super.setJenis(jenis);
	};

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((pasien == null) ? 0 : pasien.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		StokKembali other = (StokKembali) obj;
		if (pasien == null) {
			if (other.pasien != null)
				return false;
		} else if (!pasien.equals(other.pasien))
			return false;
		return true;
	}
}
