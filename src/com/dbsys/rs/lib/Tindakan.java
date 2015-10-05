package com.dbsys.rs.lib;

public interface Tindakan {
	
	public enum Satuan {
		TINDAKAN, HARI, JAM
	}

	public Long getId();
	public void setId(Long id);

	public String getKode();
	public void setKode(String kode);

	public String getNama();
	public void setNama(String nama);

	public Long getTarif();
	public void setTarif(Long tarif);

	public KategoriTindakan getKategori();
	public void setKategori(KategoriTindakan kategori);

	public Kelas getKelas();
	public void setKelas(Kelas kelas);

	public Tanggungan getTanggungan();
	public void setTanggungan(Tanggungan tanggungan);

	public Satuan getSatuan();
	public void setSatuan(Satuan satuan);

	public String getKeterangan();
	public void setKeterangan(String keterangan);

}
