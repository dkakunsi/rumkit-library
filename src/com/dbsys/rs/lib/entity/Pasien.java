package com.dbsys.rs.lib.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.dbsys.rs.lib.Kelas;
import com.dbsys.rs.lib.Tanggungan;
import com.dbsys.rs.lib.entity.Penduduk.Kelamin;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pasien")
public class Pasien {

	public enum StatusPasien {
		OPEN, PAID, UNPAID
	}

	public enum KeadaanPasien {
		SEMBUH, RUJUK, SAKIT, MATI, LARI
	}
	
	public enum Type {
		RAWAT_JALAN, RAWAT_INAP
	}
	
	private Long id;
	private String kode;
	private Date tanggalMasuk;
	private Long totalTagihan;
	private Long cicilan;
	private StatusPasien status;
	private Tanggungan tanggungan;
	private Penduduk penduduk;
	private Type tipe;
	private Date tanggalKeluar;
	private KeadaanPasien keadaan;
	private Kelas kelas;
	private Unit ruangPerawatan;
	
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
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "penduduk")
	public Penduduk getPenduduk() {
		return penduduk;
	}

	public void setPenduduk(Penduduk penduduk) {
		this.penduduk = penduduk;
	}

	@Column(name = "tipe")
	public Type getTipe() {
		return tipe;
	}

	public void setTipe(Type tipe) {
		this.tipe = tipe;
	}

	@Column(name = "tanggal_keluar")
	public Date getTanggalKeluar() {
		return tanggalKeluar;
	}

	public void setTanggalKeluar(Date tanggalKeluar) {
		this.tanggalKeluar = tanggalKeluar;
	}

	/**
	 * Keadaan pasien saat keluar.
	 * 
	 * @return keadaan pasien
	 */
	@Column(name = "keadaan")
	public KeadaanPasien getKeadaan() {
		return keadaan;
	}

	public void setKeadaan(KeadaanPasien keadaan) {
		this.keadaan = keadaan;
	}

	@Column(name = "kelas")
	public Kelas getKelas() {
		return kelas;
	}

	public void setKelas(Kelas kelas) {
		this.kelas = kelas;
	}

	@ManyToOne
	@JoinColumn(name = "ruang_perawatan")
	public Unit getRuangPerawatan() {
		return ruangPerawatan;
	}

	public void setRuangPerawatan(Unit ruangPerawatan) {
		this.ruangPerawatan = ruangPerawatan;
	}

	@Transient
	public Long getIdPenduduk() {
		return penduduk.getId();
	}
	
	public void setIdPenduduk(Long idPenduduk) {
		penduduk.setId(idPenduduk);
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
	public String getKodePenduduk() {
		return penduduk.getKode();
	}
	
	public void setKodePenduduk(String kode) {
		penduduk.setKode(kode);
	}

	public void generateKode() {
		Integer i = Math.abs(hashCode());
		Integer t = Math.abs(tanggalMasuk.hashCode());
		
		this.kode = String.format("%s-%s", i, t);
	}

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
