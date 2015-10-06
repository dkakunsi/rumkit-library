package com.dbsys.rs.lib.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "unit")
public class Unit {

	private Long id;
	private String nama;
	private Float bobot;
	
	private List<Operator> daftarOperator;

	public Unit() {
		super();
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "nama")
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	@Column(name = "bobot")
	public Float getBobot() {
		return bobot;
	}

	public void setBobot(Float bobot) {
		this.bobot = bobot;
	}

	@JsonIgnore
	@OneToMany(mappedBy = "unit", cascade = CascadeType.PERSIST)
	public List<Operator> getDaftarOperator() {
		return daftarOperator;
	}

	public void setDaftarOperator(List<Operator> daftarOperator) {
		this.daftarOperator = daftarOperator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bobot == null) ? 0 : bobot.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nama == null) ? 0 : nama.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unit other = (Unit) obj;
		if (bobot == null) {
			if (other.bobot != null)
				return false;
		} else if (!bobot.equals(other.bobot))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nama == null) {
			if (other.nama != null)
				return false;
		} else if (!nama.equals(other.nama))
			return false;
		return true;
	}
}
