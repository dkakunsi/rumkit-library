package com.dbsys.rs.lib;

import com.dbsys.rs.lib.entity.Barang;
import com.dbsys.rs.lib.entity.Operator;
import com.dbsys.rs.lib.entity.Pasien;
import com.dbsys.rs.lib.entity.PasienRawatInap;
import com.dbsys.rs.lib.entity.PasienRawatJalan;
import com.dbsys.rs.lib.entity.Pegawai;
import com.dbsys.rs.lib.entity.Penduduk;
import com.dbsys.rs.lib.entity.Tindakan;
import com.dbsys.rs.lib.entity.Token;
import com.dbsys.rs.lib.entity.Unit;

/**
 * Kelas untukmen-generate entity menjadi JSON.
 * 
 * @author Deddy Christoper Kakunsi
 *
 * @param <T>
 */
public class EntityRestMessage<T> extends RestMessage {
	private T model;
	
	public EntityRestMessage() {
		super();
	}
	
	protected EntityRestMessage(Exception ex) {
		super(ex);
	}
	
	protected EntityRestMessage(T model) {
		super("Berhasil", Type.ENTITY, model);
		this.model = model;
	}
	
	public T getModel() {
		return model;
	}
	
	public static <T> EntityRestMessage<T> entityError(Exception cause) {
		return new EntityRestMessage<T>(cause);
	}

	public static EntityRestMessage<Token> createToken(Token token) {
		return new EntityRestMessage<Token>(token);
	}

	public static EntityRestMessage<Unit> createUnit(Unit unit) {
		return new EntityRestMessage<Unit>(unit);
	}

	public static EntityRestMessage<Operator> createOperator(Operator operator) {
		return new EntityRestMessage<Operator>(operator);
	}

	public static EntityRestMessage<Penduduk> createPenduduk(Penduduk penduduk) {
		return new EntityRestMessage<Penduduk>(penduduk);
	}

	public static EntityRestMessage<Tindakan> createTindakan(Tindakan tindakan) {
		return new EntityRestMessage<Tindakan>(tindakan);
	}

	public static EntityRestMessage<Barang> createBarang(Barang barang) {
		return new EntityRestMessage<Barang>(barang);
	}

	public static EntityRestMessage<Pegawai> createPegawai(Pegawai pegawai) {
		return new EntityRestMessage<Pegawai>(pegawai);
	}

	public static EntityRestMessage<Pasien> createPasien(Pasien pasien) {
		return new EntityRestMessage<Pasien>(pasien);
	}

	public static EntityRestMessage<Pasien> createPasienRawatInap(PasienRawatInap pasien) {
		return new EntityRestMessage<Pasien>(pasien);
	}

	public static EntityRestMessage<Pasien> createPasienRawatJalan(PasienRawatJalan pasien) {
		return new EntityRestMessage<Pasien>(pasien);
	}
}
