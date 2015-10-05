package com.dbsys.rs.lib;

public interface Operator {

	public enum Role {
		ADMIN, OPERATOR
	}

	public Long getId();
	public void setId(Long id);

	/**
	 * Mengambil username operator.
	 * 
	 * @return username
	 */
	public String getUsername();
	
	/**
	 * Mengatur username operator.
	 * 
	 * @param username
	 */
	public void setUsername(String username);

	/**
	 * Mengambil password operator.
	 * 
	 * @return password
	 */
	public String getPassword();

	/**
	 * Mengatur password operator.
	 * 
	 * @param password
	 */
	public void setPassword(String password);

	/**
	 * Return role operator.
	 * 
	 * @return Role operator
	 */
	public Role getRole();

	/**
	 * Mengatur role operator.
	 * 
	 * @param role
	 */
	public void setRole(Role role);

	public String getNama();

	public void setNama(String nama);

	public Unit getUnit();

	public void setUnit(Unit unit);

}
