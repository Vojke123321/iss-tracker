package com.vojislav.ISSTrackerFinal.domain;

public class issPosition {
	////{"message": "success", "timestamp": 1618317423, "iss_position": {"latitude": "41.8704", "longitude": "46.1406"}}
	private double latitude;
	private double longitude;
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "issPosition [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
}
