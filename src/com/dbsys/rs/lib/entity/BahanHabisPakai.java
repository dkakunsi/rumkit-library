package com.dbsys.rs.lib.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("BHP")
public class BahanHabisPakai extends Barang {

	@Override
	@Transient
	public String getName() {
		return "BHP";
	}
}
