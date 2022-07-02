package com.satis.repository.entity;

public class SatisDetay {

	long id;
	long satisId;
	String urunId;
	int adet;
	double fiyat;
	double toplamFiyat;
	
	
	
	public SatisDetay(long id, long satisId, String urunId, int adet, double fiyat, double toplamFiyat) {
		super();
		this.id = id;
		this.satisId = satisId;
		this.urunId = urunId;
		this.adet = adet;
		this.fiyat = fiyat;
		this.toplamFiyat = toplamFiyat;
	}
	public SatisDetay(long satisId, String urunId, int adet, double fiyat, double toplamFiyat) {
		super();
		this.satisId = satisId;
		this.urunId = urunId;
		this.adet = adet;
		this.fiyat = fiyat;
		this.toplamFiyat = toplamFiyat;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSatisId() {
		return satisId;
	}
	public void setSatisId(long satisId) {
		this.satisId = satisId;
	}
	public String getUrunId() {
		return urunId;
	}
	public void setUrunId(String urunId) {
		this.urunId = urunId;
	}
	public int getAdet() {
		return adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public double getToplamFiyat() {
		return toplamFiyat;
	}
	public void setToplamFiyat(double toplamFiyat) {
		this.toplamFiyat = toplamFiyat;
	}
	
	
	
}
