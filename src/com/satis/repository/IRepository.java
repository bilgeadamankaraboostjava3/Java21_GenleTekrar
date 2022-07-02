package com.satis.repository;

public interface IRepository<T> {

	/**
	 * Object -> tüm deðiþkenlerin ve sýnýflarýn türediði ana sýnýf diye düþünebilirsiniz
	 * ve tüm deðerlerini kapsar, en üst kümemizdir.
	 * 
	 */
	
	public void save(T o);
	public void update(T o);
	public void delete(T o);
	public T findAll(); // String[]
	public T findById(long id);
	public T findById(String uuid);
	
	
}
