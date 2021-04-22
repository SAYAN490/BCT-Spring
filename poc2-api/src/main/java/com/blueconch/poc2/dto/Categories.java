package com.blueconch.poc2.dto;

public class Categories {
	private int cat_id;
	private String cat_name;
	private String cat_image;
	private int cat_active;
	private int prod_id;
	
	public Categories()
	{
		
	}
	
	public Categories(int cat_id, String cat_name, String cat_image, int cat_active, int prod_id) {
		super();
		this.cat_id = cat_id;
		this.cat_name = cat_name;
		this.cat_image = cat_image;
		this.cat_active = cat_active;
		this.prod_id = prod_id;
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public String getCat_name() {
		return cat_name;
	}

	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

	public String getCat_image() {
		return cat_image;
	}

	public void setCat_image(String cat_image) {
		this.cat_image = cat_image;
	}

	public int getCat_active() {
		return cat_active;
	}

	public void setCat_active(int cat_active) {
		this.cat_active = cat_active;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	
	
	

}
