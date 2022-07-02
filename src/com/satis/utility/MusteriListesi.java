package com.satis.utility;

import com.satis.repository.entity.Musteri;

public class MusteriListesi {
	
	Musteri[] liste;
	int uzunluk=0;
	Musteri[] tmp;
	
	public void ekle(Musteri musteri){
		if(uzunluk==0) {
			liste = new Musteri[1];
			liste[0] = musteri;
			uzunluk = 1;
		}else {
			uzunluk++;
			tmp = new Musteri[uzunluk];
			for(int i=0;i<liste.length;i++)
				tmp[i]=liste[i];
			tmp[liste.length]=musteri;
			liste = tmp;
		}
	}
	public Musteri[] listele() {
		return liste;
	}

}
