package com.dbsys.rs.lib;

import java.sql.Date;

public class Token {

	public enum StatusToken {
		ACTIVE, LOCK
	}

	protected String kode;
	protected Operator operator;
	protected Date tanggalBuat;
	protected Date tanggalExpire;
	protected StatusToken status;

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public Date getTanggalBuat() {
		return tanggalBuat;
	}

	public void setTanggalBuat(Date tanggalBuat) {
		this.tanggalBuat = tanggalBuat;
	}

	public Date getTanggalExpire() {
		return tanggalExpire;
	}

	public void setTanggalExpire(Date tanggalExpire) {
		this.tanggalExpire = tanggalExpire;
	}

	public StatusToken getStatus() {
		return status;
	}

	public void setStatus(StatusToken status) {
		this.status = status;
	}
}
