package uk.ac.belfastmet.largestBuildings.domain;

public class LargestBuilding {
	
	private String name;
	private String city;
	private String country;
	private int floorArea;
	private int footprint;
	private int usableVolume;
	
	
	
	public LargestBuilding() {
		super();
	}
	
	public LargestBuilding(String name, int floorArea) {
		this.name = name;
		this.floorArea = floorArea;
	}

	public LargestBuilding(int footprint, String name, String city, String country) {
		this.name = name;
		this.city = city;
		this.country = country;
		this.footprint = footprint;
	}
	
	public LargestBuilding(String name, String city, String country, int floorArea ) {
		this.name = name;
		this.city = city;
		this.country = country;
		this.floorArea = floorArea;
	}
	
	public LargestBuilding(String name, String city, int usableVolume, String country) {
		this.name = name;
		this.city = city;
		this.country = country;
		this.usableVolume = usableVolume;
	}

	public LargestBuilding(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getFloorArea() {
		return floorArea;
	}


	public void setFloorArea(int floorArea) {
		this.floorArea = floorArea;
	}


	public int getFootprint() {
		return footprint;
	}


	public void setFootprint(int footprint) {
		this.footprint = footprint;
	}


	public int getUsableVolume() {
		return usableVolume;
	}


	public void setUsableVolume(int usableVolume) {
		this.usableVolume = usableVolume;
	}
	
	
	public String toString() {
		return name + " " + city + " "+ country;
	}

}
