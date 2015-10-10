package com.dbsys.rs.lib.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.dbsys.rs.lib.Kelas;

@Entity
@DiscriminatorValue("RAWAT INAP")
public class PasienRawatInap extends Pasien {

	public enum KeadaanPasien {
		SEMBUH, RUJUK, SAKIT, MATI, LARI
	}
	
	private Date tanggalKeluar;
	private KeadaanPasien keadaan;
	private Kelas kelas;
	private Unit ruangPerawatan;

	public PasienRawatInap() {
		super();
	}

	public PasienRawatInap(PasienRawatJalan pasien) {
		super();
		setPenduduk(pasien.getPenduduk());
		setCicilan(pasien.getCicilan());
		setId(pasien.getId());
		setKode(pasien.getKode());
		setStatus(pasien.getStatus());
		setTanggalMasuk(pasien.getTanggalMasuk());
		setTanggungan(pasien.getTanggungan());
		setTotalTagihan(pasien.getTotalTagihan());
	}

	public PasienRawatInap(PasienRawatInap pasien) {
		super();
		setPenduduk(pasien.getPenduduk());
		setCicilan(pasien.getCicilan());
		setId(pasien.getId());
		setKeadaan(pasien.getKeadaan());
		setKelas(pasien.getKelas());
		setKode(pasien.getKode());
		setRuangPerawatan(pasien.getRuangPerawatan());
		setStatus(pasien.getStatus());
		setTanggalKeluar(pasien.getTanggalKeluar());
		setTanggalMasuk(pasien.getTanggalMasuk());
		setTanggungan(pasien.getTanggungan());
		setTotalTagihan(pasien.getTotalTagihan());
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

	@Override
	@Transient
	public String getName() {
		return "RAWAT INAP";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((keadaan == null) ? 0 : keadaan.hashCode());
		result = prime * result + ((kelas == null) ? 0 : kelas.hashCode());
		result = prime * result
				+ ((ruangPerawatan == null) ? 0 : ruangPerawatan.hashCode());
		result = prime * result
				+ ((tanggalKeluar == null) ? 0 : tanggalKeluar.hashCode());
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
		PasienRawatInap other = (PasienRawatInap) obj;
		if (keadaan != other.keadaan)
			return false;
		if (kelas != other.kelas)
			return false;
		if (ruangPerawatan == null) {
			if (other.ruangPerawatan != null)
				return false;
		} else if (!ruangPerawatan.equals(other.ruangPerawatan))
			return false;
		if (tanggalKeluar == null) {
			if (other.tanggalKeluar != null)
				return false;
		} else if (!tanggalKeluar.equals(other.tanggalKeluar))
			return false;
		return true;
	}
}
