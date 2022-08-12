package com.Project.Entities;

public class Address {
	private int house;
	private int road;
	private int sector;
	private int postcode;
	private char block;
	private String area;

	public Address(int house, int road, int sector, int postcode, char block, String area) {
		this.house = house;
		this.road = road;
		this.sector = sector;
		this.postcode = postcode;
		this.block = block;
		this.area = area;

	}

	public int getHouse() {
		return house;
	}

	public void setHouse(int house) {
		this.house = house;
	}

	public int getRoad() {
		return road;
	}

	public void setRoad(int road) {
		this.road = road;
	}

	public int getSector() {
		return sector;
	}

	public void setSector(int sector) {
		this.sector = sector;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public char getBlock() {
		return block;
	}

	public void setBlock(char block) {
		this.block = block;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String printAddress() {
		return "Address [house=" + house + ", road=" + road + ", sector=" + sector + ", postcode=" + postcode
				+ ", block=" + block + ", area=" + area + "]";
	}
}
