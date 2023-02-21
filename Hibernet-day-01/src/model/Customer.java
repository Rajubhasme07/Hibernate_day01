package model;

public class Customer {

	private int id;
	private String cname,cadd;

	public Customer(int id, String cname, String cadd) {
		super();
		this.id = id;
		this.cname = cname;
		this.cadd = cadd;
	}
	
	public Customer(String cname) {
		super();
		this.cname = cname;
	}

	

	public Customer() {
		super();
	}

	public Customer(int id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}

	public Customer(String cname, String cadd) {
		super();
	
		this.cname = cname;
		this.cadd = cadd;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	
	
	
	

}
