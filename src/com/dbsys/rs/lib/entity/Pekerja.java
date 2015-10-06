package com.dbsys.rs.lib.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("PEKERJA")
public class Pekerja extends Pegawai {

	@Override
	@Transient
	public String getName() {
		return "PEKERJA";
	}
}
