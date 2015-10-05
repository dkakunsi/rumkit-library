package com.dbsys.rs.lib;

import java.util.List;

public interface KategoriTindakan {

	public Long getId();
	public void setId(Long id);

	public String getNama();
	public void setNama(String nama);

	public KategoriTindakan getParent();
	public void setParent(KategoriTindakan parent);

	public List<Tindakan> getDaftarTindakan();
	public void setDaftarTindakan(List<Tindakan> daftarTindakan);

	public List<KategoriTindakan> getDaftarSubKategori();
	public void setDaftarSubKategori(List<KategoriTindakan> daftarSubKategori);

}
