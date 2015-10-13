package com.dbsys.rs.lib.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("OBAT")
public class PemakaianObat extends Pemakaian {

	public enum AsalObat {
		FARMASI, LUAR
	}
	
	private String nomorResep;
	private ObatLuar obatLuar;
	private AsalObat asal;

	@Column(name = "nomor_resep")
	public String getNomorResep() {
		return nomorResep;
	}

	public void setNomorResep(String nomorResep) {
		this.nomorResep = nomorResep;
	}

	@Embedded
	public ObatLuar getObatLuar() {
		return obatLuar;
	}

	public void setObatLuar(ObatLuar obatLuar) {
		this.obatLuar = obatLuar;
	}

	@Column(name = "asal")
	public AsalObat getAsal() {
		return asal;
	}

	public void setAsal(AsalObat asal) {
		this.asal = asal;
	}
	
	@Transient
	public String getNamaObat() {
		if (asal.equals(AsalObat.FARMASI))
			return barang.getNama();
		return obatLuar.getNama();
	}
	
	public void setNamaObat(String namaObat) { }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((asal == null) ? 0 : asal.hashCode());
		result = prime * result
				+ ((nomorResep == null) ? 0 : nomorResep.hashCode());
		result = prime * result
				+ ((obatLuar == null) ? 0 : obatLuar.hashCode());
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
		PemakaianObat other = (PemakaianObat) obj;
		if (asal != other.asal)
			return false;
		if (nomorResep == null) {
			if (other.nomorResep != null)
				return false;
		} else if (!nomorResep.equals(other.nomorResep))
			return false;
		if (obatLuar == null) {
			if (other.obatLuar != null)
				return false;
		} else if (!obatLuar.equals(other.obatLuar))
			return false;
		return true;
	}
}
