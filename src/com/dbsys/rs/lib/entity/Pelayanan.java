package com.dbsys.rs.lib.entity;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Table(name = "pelayanan")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
	name = "tipe",
	discriminatorType = DiscriminatorType.STRING
)
@DiscriminatorValue("PELAYANAN")
@JsonTypeInfo(
	use = JsonTypeInfo.Id.NAME,
	include = JsonTypeInfo.As.PROPERTY,
	property = "name"
)
@JsonSubTypes({
	@JsonSubTypes.Type(value = Pelayanan.class, name = "PELAYANAN"),
	@JsonSubTypes.Type(value = PelayananTemporal.class, name = "TEMPORAL")
})
public class Pelayanan extends Tagihan {
	
	protected Tindakan tindakan;
	protected Pegawai pelaksana;

	public Pelayanan() {
		super();
		setName(Name.PELAYANAN);
	}
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "tindakan")
	public Tindakan getTindakan() {
		return tindakan;
	}

	public void setTindakan(Tindakan tindakan) {
		this.tindakan = tindakan;
		this.penanggung = tindakan;
	}

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "pelaksana")
	public Pegawai getPelaksana() {
		return pelaksana;
	}

	public void setPelaksana(Pegawai pelaksana) {
		this.pelaksana = pelaksana;
	}

	@Override
	@Transient
	public Long getTagihan() {
		return tindakan.getTarif() * jumlah + biayaTambahan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((tindakan == null) ? 0 : tindakan.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelayanan other = (Pelayanan) obj;
		if (tindakan == null) {
			if (other.tindakan != null)
				return false;
		} else if (!tindakan.equals(other.tindakan))
			return false;
		return true;
	}
}
