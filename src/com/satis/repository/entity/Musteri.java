package com.satis.repository.entity;

public class Musteri extends Kullanici{

	String adsoyad;
	String telefon;
	String adres;
	

	public Musteri(String adsoyad, String telefon, String adres,String kullaniciAdi ,String sifre) {
		super(kullaniciAdi,sifre);
		this.adres = adres;
		this.adsoyad = adsoyad;
		this.telefon = telefon;
		
	}
	
	public String getAdsoyad() {
		return adsoyad;
	}
	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	
}
