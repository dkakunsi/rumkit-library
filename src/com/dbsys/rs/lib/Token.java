package com.dbsys.rs.lib;

import java.sql.Date;

public interface Token {

	public enum StatusToken {
		ACTIVE, LOCK
	}

	public String getKode();

	public void setKode(String kode);

	/**
	 * Mengambil operator.
	 * 
	 * @return operator
	 */
	public Operator getOperator();

	/**
	 * Mengatur operator.
	 * 
	 * @param operator
	 */
	public void setOperator(Operator operator);

	public Date getTanggalBuat();

	public void setTanggalBuat(Date tanggalBuat);

	public Date getTanggalExpire();

	public void setTanggalExpire(Date tanggalExpire);

	public StatusToken getStatus();

	public void setStatus(StatusToken status);
	
}
