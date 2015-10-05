package com.dbsys.rs.lib;

import java.util.List;

/**
 * Kelas untuk men-generate daftar entity menjadi objek JSON.
 * 
 * @author Deddy Christoper Kakunsi
 *
 * @param <T>
 */
public class ListEntityRestMessage<T> extends RestMessage {
	private List<T> list;
	
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
}
