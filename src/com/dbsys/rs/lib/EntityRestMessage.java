package com.dbsys.rs.lib;

/**
 * Kelas untukmen-generate entity menjadi JSON.
 * 
 * @author Deddy Christoper Kakunsi
 *
 * @param <T>
 */
public class EntityRestMessage<T> extends RestMessage {
	private T model;
	
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
}
