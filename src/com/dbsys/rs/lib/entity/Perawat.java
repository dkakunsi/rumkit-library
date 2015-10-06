package com.dbsys.rs.lib.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("PERAWAT")
public class Perawat extends Pegawai {

	@Override
	@Transient
	public String getName() {
		return "PERAWAT";
	}
}
