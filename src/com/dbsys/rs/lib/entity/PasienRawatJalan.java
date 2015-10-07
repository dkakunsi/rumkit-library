package com.dbsys.rs.lib.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("RAWAT JALAN")
public class PasienRawatJalan extends Pasien {

	@Override
	@Transient
	public String getName() {
		return null;
	}
}
