package com.satis.repository.entity;

public class Satis {

	long id;
	String calisanId;
	String musteriId;
	double fiyat;
	double kdvTutari;
	double toplamFiyat;
	long satisTarihi;
	long islemTarihi;
	

	public Satis(long id, String calisanId, String musteriId, double fiyat, double kdvTutari, double toplamFiyat,
			long satisTarihi, long islemTarihi) {
		super();
		this.id = id;
		this.calisanId = calisanId;
		this.musteriId = musteriId;
		this.fiyat = fiyat;
		this.kdvTutari = kdvTutari;
		this.toplamFiyat = toplamFiyat;
		this.satisTarihi = satisTarihi;
		this.islemTarihi = islemTarihi;
	}
	public Satis(String calisanId, String musteriId, double fiyat, double kdvTutari, double toplamFiyat,
			long satisTarihi, long islemTarihi) {
		super();
		this.calisanId = calisanId;
		this.musteriId = musteriId;
		this.fiyat = fiyat;
		this.kdvTutari = kdvTutari;
		this.toplamFiyat = toplamFiyat;
		this.satisTarihi = satisTarihi;
		this.islemTarihi = islemTarihi;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCalisanId() {
		return calisanId;
	}
	public void setCalisanId(String calisanId) {
		this.calisanId = calisanId;
	}
	public String getMusteriId() {
		return musteriId;
	}
	public void setMusteriId(String musteriId) {
		this.musteriId = musteriId;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public double getKdvTutari() {
		return kdvTutari;
	}
	public void setKdvTutari(double kdvTutari) {
		this.kdvTutari = kdvTutari;
	}
	public double getToplamFiyat() {
		return toplamFiyat;
	}
	public void setToplamFiyat(double toplamFiyat) {
		this.toplamFiyat = toplamFiyat;
	}
	public long getSatisTarihi() {
		return satisTarihi;
	}
	public void setSatisTarihi(long satisTarihi) {
		this.satisTarihi = satisTarihi;
	}
	public long getIslemTarihi() {
		return islemTarihi;
	}
	public void setIslemTarihi(long islemTarihi) {
		this.islemTarihi = islemTarihi;
	}
	
	
	
}
