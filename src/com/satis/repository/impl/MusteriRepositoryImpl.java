package com.satis.repository.impl;

import com.satis.repository.IMusteriRepository;
import com.satis.repository.entity.Musteri;
import com.satis.utility.DataBase;


public class MusteriRepositoryImpl implements IMusteriRepository {

	@Override
	public void save(Object o) {	
		DataBase.dbMusteri.ekle((Musteri)o);		
	}

	@Override
	public void update(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object findAll() {		
		return DataBase.dbMusteri.listele();
	}

	@Override
	public Object findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findById(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
