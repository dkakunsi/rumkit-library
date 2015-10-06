package com.dbsys.rs.lib.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("APOTEKER")
public class Apoteker extends Pegawai {

	@Override
	@Transient
	public String getName() {
		return "APOTEKER";
	}
}
