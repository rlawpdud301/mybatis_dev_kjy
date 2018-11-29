package kr.or.yi.mybatis_dev_kjy.dto;

public class PhoneNumber {
	private String countryCode;
	private String ststeCode;
	private String number;
	public PhoneNumber() {
		// TODO Auto-generated constructor stub
	}
	public PhoneNumber(String countryCode, String ststeCode, String number) {
		this.countryCode = countryCode;
		this.ststeCode = ststeCode;
		this.number = number;
	}
	
	public PhoneNumber(String str) {
		if (str != null) {
			String[] parts = str.split("-");
			
			if(parts.length>0) this.countryCode = parts[0];
			if(parts.length>1) this.ststeCode = parts[1];
			if(parts.length>2) this.number = parts[2];
		}
	}
	@Override
	public String toString() {
		return String.format("%s-%s-%s", countryCode, ststeCode, number);
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getStsteCode() {
		return ststeCode;
	}
	public void setStsteCode(String ststeCode) {
		this.ststeCode = ststeCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
