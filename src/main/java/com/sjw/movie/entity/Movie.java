package com.sjw.movie.entity;

public class Movie {

	private Integer id;
	private String name;
	private String actor;
	private int price;
	private String uptime;
	private int longtime;
	private String type;
	private int years;
	private String area;
	private int status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public int getLongtime() {
		return longtime;
	}
	public void setLongtime(int longtime) {
		this.longtime = longtime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", actor=" + actor + ", price=" + price + ", uptime=" + uptime
				+ ", longtime=" + longtime + ", type=" + type + ", years=" + years + ", area=" + area + ", status="
				+ status + "]";
	}
	public Movie(Integer id, String name, String actor, int price, String uptime, int longtime, String type, int years,
			String area, int status) {
		super();
		this.id = id;
		this.name = name;
		this.actor = actor;
		this.price = price;
		this.uptime = uptime;
		this.longtime = longtime;
		this.type = type;
		this.years = years;
		this.area = area;
		this.status = status;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
