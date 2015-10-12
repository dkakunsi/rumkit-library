package com.dbsys.rs.lib.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("KELUAR")
public class StokKeluar extends Stok {

	@Override
	@Transient
	public String getName() {
		return "STOK KELUAR";
	}
}
