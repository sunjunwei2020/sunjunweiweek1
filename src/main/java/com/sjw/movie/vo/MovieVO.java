package com.sjw.movie.vo;

import com.sjw.movie.entity.Movie;

public class MovieVO extends Movie{

	private int p1;//开始价格
	private int p2;
	
	private int l1;//开始时间长度
	private int l2;
	
	private String t1;//开始上映时间
	private String t2;
	
	//分页
	private Integer pageNum;
	
	private String orderName;//根据什么排序
	private String orderMonth;//正序倒序
	
	
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderMonth() {
		return orderMonth;
	}
	public void setOrderMonth(String orderMonth) {
		this.orderMonth = orderMonth;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public int getP1() {
		return p1;
	}
	public void setP1(int p1) {
		this.p1 = p1;
	}
	public int getP2() {
		return p2;
	}
	public void setP2(int p2) {
		this.p2 = p2;
	}
	public int getL1() {
		return l1;
	}
	public void setL1(int l1) {
		this.l1 = l1;
	}
	public int getL2() {
		return l2;
	}
	public void setL2(int l2) {
		this.l2 = l2;
	}
	public String getT1() {
		return t1;
	}
	public void setT1(String t1) {
		this.t1 = t1;
	}
	public String getT2() {
		return t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	
	public MovieVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieVO(Integer id, String name, String actor, int price, String uptime, int longtime, String type,
			int years, String area, int status) {
		super(id, name, actor, price, uptime, longtime, type, years, area, status);
		// TODO Auto-generated constructor stub
	}
	public MovieVO(Integer id, String name, String actor, int price, String uptime, int longtime, String type,
			int years, String area, int status, int p1, int p2, int l1, int l2, String t1, String t2, Integer pageNum,
			String orderName, String orderMonth) {
		super(id, name, actor, price, uptime, longtime, type, years, area, status);
		this.p1 = p1;
		this.p2 = p2;
		this.l1 = l1;
		this.l2 = l2;
		this.t1 = t1;
		this.t2 = t2;
		this.pageNum = pageNum;
		this.orderName = orderName;
		this.orderMonth = orderMonth;
	}
	@Override
	public String toString() {
		return "MovieVO [p1=" + p1 + ", p2=" + p2 + ", l1=" + l1 + ", l2=" + l2 + ", t1=" + t1 + ", t2=" + t2
				+ ", pageNum=" + pageNum + ", orderName=" + orderName + ", orderMonth=" + orderMonth + "]";
	}
	
	
}
