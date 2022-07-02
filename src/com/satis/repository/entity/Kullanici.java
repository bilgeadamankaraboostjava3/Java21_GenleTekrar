package com.satis.repository.entity;

import java.util.UUID;

public class Kullanici {
	
	String uuid;
	String kullaniciAdi;
	String sifre;
	/**
	 * Kullanýcýnýn aktifliðini tutar
	 * 0-> pasif
	 * 1-> aktif
	 */
	boolean durum;
	
	public Kullanici(String kullaniciAdi, String sifre) {
		uuid = UUID.randomUUID().toString();
		durum = true;
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
	}
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public boolean isDurum() {
		return durum;
	}
	public void setDurum(boolean durum) {
		this.durum = durum;
	}
	
	
}
