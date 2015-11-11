package com.dbsys.rs.lib.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pemakaian")
public class Pemakaian extends Tagihan {

	private Barang barang;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "barang")
	public Barang getBarang() {
		return barang;
	}

	public void setBarang(Barang barang) {
		this.barang = barang;
		this.penanggung = barang;
	}

	@Override
	@Transient
	public Long getTagihan() {
		return barang.getHarga() * jumlah + biayaTambahan;
	}
	
	@Override
	@Transient
	public String getNama() {
		return barang.getNama();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((barang == null) ? 0 : barang.hashCode());
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
		Pemakaian other = (Pemakaian) obj;
		if (barang == null) {
			if (other.barang != null)
				return false;
		} else if (!barang.equals(other.barang))
			return false;
		return true;
	}
}
