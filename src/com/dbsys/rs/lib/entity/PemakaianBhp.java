package com.dbsys.rs.lib.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("BAHAN HABIS PAKAI")
public class PemakaianBhp extends Pemakaian {
	
	@Transient
	public BahanHabisPakai getBahanHabisPakai() {
		return (BahanHabisPakai)barang;
	}
	
	public void setBahanHabisPakai(BahanHabisPakai bhp) {
		this.barang = bhp;
	}
}
