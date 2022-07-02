package com.satis;

import com.satis.repository.impl.MusteriRepositoryImpl;
import com.satis.repository.impl.UrunRepositoryImpl;

public class Runner {

	public static void main(String[] args) {
		
		MusteriRepositoryImpl dbMusteri = new MusteriRepositoryImpl();
		UrunRepositoryImpl dbUrun = new UrunRepositoryImpl();
		dbMusteri.save(5345353);
		dbMusteri.save("selam nasýlsýn?");
		dbMusteri.save(new Runner());

	}

}
