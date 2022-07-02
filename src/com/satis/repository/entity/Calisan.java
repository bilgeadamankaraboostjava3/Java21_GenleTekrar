package com.satis.repository.entity;

public class Calisan extends Kullanici implements IGenel{

	String ad;
	String soyad;
	long iseGirisTarihi;
	
	public Calisan(String ad,String soyad, long iseGirisTarihi, String kullaniciAdi, String sifre) {
		super(kullaniciAdi,sifre);
		this.ad = ad;
		this.soyad = soyad;
		this.iseGirisTarihi = iseGirisTarihi;
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public long getIseGirisTarihi() {
		return iseGirisTarihi;
	}
	public void setIseGirisTarihi(long iseGirisTarihi) {
		this.iseGirisTarihi = iseGirisTarihi;
	}
	
	
	
}
