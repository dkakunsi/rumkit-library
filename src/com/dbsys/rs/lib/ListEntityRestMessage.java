package com.dbsys.rs.lib;

import java.util.List;

import com.dbsys.rs.lib.entity.Apoteker;
import com.dbsys.rs.lib.entity.BahanHabisPakai;
import com.dbsys.rs.lib.entity.Dokter;
import com.dbsys.rs.lib.entity.KategoriTindakan;
import com.dbsys.rs.lib.entity.ObatFarmasi;
import com.dbsys.rs.lib.entity.Operator;
import com.dbsys.rs.lib.entity.Pekerja;
import com.dbsys.rs.lib.entity.PemakaianBhp;
import com.dbsys.rs.lib.entity.PemakaianObat;
import com.dbsys.rs.lib.entity.Penduduk;
import com.dbsys.rs.lib.entity.Perawat;
import com.dbsys.rs.lib.entity.StokKeluar;
import com.dbsys.rs.lib.entity.StokMasuk;
import com.dbsys.rs.lib.entity.Tindakan;
import com.dbsys.rs.lib.entity.Unit;

/**
 * Kelas untuk men-generate daftar entity menjadi objek JSON.
 * 
 * @author Deddy Christoper Kakunsi
 *
 * @param <T>
 */
public class ListEntityRestMessage<T> extends RestMessage {
	private List<T> list;
	
	public ListEntityRestMessage() {
		super();
	}
	
	protected ListEntityRestMessage(Exception ex) {
		super(ex);
	}

	protected ListEntityRestMessage(List<T> list) {
		super("Berhasil", Type.LIST);
		this.list = list;
	}
	
	public List<T> getList() {
		return list;
	}

	/**
	 * Buat objek JSON utuk pesan error.
	 * 
	 * @param cause
	 * 
	 * @return
	 */
	public static <T> ListEntityRestMessage<T> listEntityError(Exception cause) {
		return new ListEntityRestMessage<T>(cause);
	}

	public static ListEntityRestMessage<Unit> createListUnit(List<Unit> list) {
		return new ListEntityRestMessage<Unit>(list);
	}

	public static ListEntityRestMessage<Operator> createListOperator(List<Operator> list) {
		return new ListEntityRestMessage<Operator>(list);
	}

	public static ListEntityRestMessage<Penduduk> createListPenduduk(List<Penduduk> list) {
		return new ListEntityRestMessage<Penduduk>(list);
	}

	public static ListEntityRestMessage<Tindakan> createListTindakan(List<Tindakan> list) {
		return new ListEntityRestMessage<Tindakan>(list);
	}

	public static ListEntityRestMessage<ObatFarmasi> createListObat(List<ObatFarmasi> list) {
		return new ListEntityRestMessage<ObatFarmasi>(list);
	}

	public static ListEntityRestMessage<BahanHabisPakai> createListBhp(List<BahanHabisPakai> list) {
		return new ListEntityRestMessage<BahanHabisPakai>(list);
	}

	public static ListEntityRestMessage<Dokter> createListDokter(List<Dokter> list) {
		return new ListEntityRestMessage<Dokter>(list);
	}

	public static ListEntityRestMessage<Perawat> createListPerawat(List<Perawat> list) {
		return new ListEntityRestMessage<Perawat>(list);
	}

	public static ListEntityRestMessage<Apoteker> createListApoteker(List<Apoteker> list) {
		return new ListEntityRestMessage<Apoteker>(list);
	}

	public static ListEntityRestMessage<Pekerja> createListPekerja(List<Pekerja> list) {
		return new ListEntityRestMessage<Pekerja>(list);
	}

	public static ListEntityRestMessage<KategoriTindakan> createListKategori(List<KategoriTindakan> list) {
		return new ListEntityRestMessage<KategoriTindakan>(list);
	}

	public static ListEntityRestMessage<StokMasuk> createListStokMasuk(List<StokMasuk> list) {
		return new ListEntityRestMessage<>(list);
	}

	public static ListEntityRestMessage<StokKeluar> createListStokKeluar(List<StokKeluar> list) {
		return new ListEntityRestMessage<>(list);
	}

	public static ListEntityRestMessage<PemakaianBhp> createListPemakaianBhp(List<PemakaianBhp> list) {
		return new ListEntityRestMessage<PemakaianBhp>(list);
	}

	public static ListEntityRestMessage<PemakaianObat> createListPemakaianObat(List<PemakaianObat> list) {
		return new ListEntityRestMessage<PemakaianObat>(list);
	}
}
