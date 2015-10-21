package com.dbsys.rs.lib.entity;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pemakaian")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
	name = "tipe",
	discriminatorType = DiscriminatorType.STRING
)
public abstract class Pemakaian extends Tagihan {

	protected Barang barang;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "barang")
	public Barang getBarang() {
		return barang;
	}

	public void setBarang(Barang barang) {
		this.barang = barang;
	}

	@Override
	@Transient
	public Long getTagihan() {
		return barang.getHarga() * jumlah + biayaTambahan;
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
