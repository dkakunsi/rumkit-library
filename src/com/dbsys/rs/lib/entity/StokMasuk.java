package com.dbsys.rs.lib.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MASUK")
public class StokMasuk extends Stok {

	@Override
	public String getName() {
		return "STOK MASUK";
	}
}
