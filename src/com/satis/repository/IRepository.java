package com.satis.repository;

public interface IRepository<T> {

	/**
	 * Object -> t�m de�i�kenlerin ve s�n�flar�n t�redi�i ana s�n�f diye d���nebilirsiniz
	 * ve t�m de�erlerini kapsar, en �st k�memizdir.
	 * 
	 */
	
	public void save(T o);
	public void update(T o);
	public void delete(T o);
	public T findAll(); // String[]
	public T findById(long id);
	public T findById(String uuid);
	
	
}
