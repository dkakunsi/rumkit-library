package com.dbsys.rs.lib.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("OBAT")
public class ObatFarmasi extends Barang {

	private String keterangan;
	
	public ObatFarmasi() {
		super();
	}
	
	public ObatFarmasi(String keterangan) {
		super();
		setKeterangan(keterangan);
	}

	@Column(name = "keterangan")
	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	@Override
	@Transient
	public String getName() {
		return "OBAT";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((keterangan == null) ? 0 : keterangan.hashCode());
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
		ObatFarmasi other = (ObatFarmasi) obj;
		if (keterangan == null) {
			if (other.keterangan != null)
				return false;
		} else if (!keterangan.equals(other.keterangan))
			return false;
		return true;
	}
}
