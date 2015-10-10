package com.dbsys.rs.lib.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("RAWAT JALAN")
public class PasienRawatJalan extends Pasien {

	public PasienRawatJalan() {
		super();
	}
	
	public PasienRawatJalan(PasienRawatJalan pasien) {
		super();
		setPenduduk(pasien.getPenduduk());
		setCicilan(pasien.getCicilan());
		setId(pasien.getId());
		setKode(pasien.getKode());
		setStatus(pasien.getStatus());
		setTanggalMasuk(pasien.getTanggalMasuk());
		setTanggungan(pasien.getTanggungan());
		setTotalTagihan(pasien.getTotalTagihan());
	}

	@Override
	@Transient
	public String getName() {
		return null;
	}
}
