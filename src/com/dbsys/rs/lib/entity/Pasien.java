package com.dbsys.rs.lib.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.dbsys.rs.lib.Tanggungan;
import com.dbsys.rs.lib.entity.Penduduk.Kelamin;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pasien")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
	name = "tipe",
	discriminatorType = DiscriminatorType.STRING
)
public abstract class Pasien {

	public enum StatusPasien {
		OPEN, PAID, UNPAID
	}
	
	protected Long id;
	protected String kode;
	protected Date tanggalMasuk;
	protected Long totalTagihan;
	protected Long cicilan;
	protected StatusPasien status;
	protected Tanggungan tanggungan;
	protected Penduduk penduduk;
	
	public Pasien() {
		super();
		this.penduduk = new Penduduk();
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "kode")
	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	@Column(name = "tanggal_masuk")
	public Date getTanggalMasuk() {
		return tanggalMasuk;
	}

	public void setTanggalMasuk(Date tanggalMasuk) {
		this.tanggalMasuk = tanggalMasuk;
	}

	@Column(name = "total_tagihan")
	public Long getTotalTagihan() {
		return totalTagihan;
	}

	public void setTotalTagihan(Long totalTagihan) {
		this.totalTagihan = totalTagihan;
	}

	@Column(name = "cicilan")
	public Long getCicilan() {
		return cicilan;
	}

	public void setCicilan(Long cicilan) {
		this.cicilan = cicilan;
	}

	@Column(name = "status")
	public StatusPasien getStatus() {
		return status;
	}

	public void setStatus(StatusPasien status) {
		this.status = status;
	}

	@Column(name = "tanggungan")
	public Tanggungan getTanggungan() {
		return tanggungan;
	}

	public void setTanggungan(Tanggungan tanggungan) {
		this.tanggungan = tanggungan;
	}

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "penduduk")
	public Penduduk getPenduduk() {
		return penduduk;
	}

	public void setPenduduk(Penduduk penduduk) {
		this.penduduk = penduduk;
	}

	@Transient
	public String getNama() {
		return penduduk.getNama();
	}

	public void setNama(String nama) {
		penduduk.setNama(nama);
	}

	@Transient
	public Kelamin getKelamin() {
		return penduduk.getKelamin();
	}

	public void setKelamin(Kelamin kelamin) {
		penduduk.setKelamin(kelamin);
	}

	@Transient
	public Date getTanggalLahir() {
		return penduduk.getTanggalLahir();
	}

	public void setTanggalLahir(Date tanggalLahir) {
		penduduk.setTanggalLahir(tanggalLahir);
	}

	@Transient
	public String getDarah() {
		return penduduk.getDarah();
	}

	public void setDarah(String darah) {
		penduduk.setDarah(darah);
	}

	@Transient
	public String getAgama() {
		return penduduk.getAgama();
	}

	public void setAgama(String agama) {
		penduduk.setAgama(agama);
	}

	@Transient
	public String getTelepon() {
		return penduduk.getTelepon();
	}

	public void setTelepon(String telepon) {
		penduduk.setTelepon(telepon);
	}
	
	@Transient
	public String getNik() {
		return penduduk.getNik();
	}

	public void setNik(String nik) {
		penduduk.setNik(nik);
	}
	
	@Transient
	public abstract String getName();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cicilan == null) ? 0 : cicilan.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((kode == null) ? 0 : kode.hashCode());
		result = prime * result
				+ ((penduduk == null) ? 0 : penduduk.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((tanggalMasuk == null) ? 0 : tanggalMasuk.hashCode());
		result = prime * result
				+ ((tanggungan == null) ? 0 : tanggungan.hashCode());
		result = prime * result
				+ ((totalTagihan == null) ? 0 : totalTagihan.hashCode());
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
		Pasien other = (Pasien) obj;
		if (cicilan == null) {
			if (other.cicilan != null)
				return false;
		} else if (!cicilan.equals(other.cicilan))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (kode == null) {
			if (other.kode != null)
				return false;
		} else if (!kode.equals(other.kode))
			return false;
		if (penduduk == null) {
			if (other.penduduk != null)
				return false;
		} else if (!penduduk.equals(other.penduduk))
			return false;
		if (status != other.status)
			return false;
		if (tanggalMasuk == null) {
			if (other.tanggalMasuk != null)
				return false;
		} else if (!tanggalMasuk.equals(other.tanggalMasuk))
			return false;
		if (tanggungan != other.tanggungan)
			return false;
		if (totalTagihan == null) {
			if (other.totalTagihan != null)
				return false;
		} else if (!totalTagihan.equals(other.totalTagihan))
			return false;
		return true;
	}
}
