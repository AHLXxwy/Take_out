package entity;

public class Order {
	private String fname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
	public float getFprice() {
		return fprice;
	}
	public void setFprice(float fprice) {
		this.fprice = fprice;
	}
	public int getFtime() {
		return ftime;
	}
	public void setFtime(int ftime) {
		this.ftime = ftime;
	}
	public String getFimgsrc() {
		return fimgsrc;
	}
	public void setFimgsrc(String fimgsrc) {
		this.fimgsrc = fimgsrc;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	private String ftype;
	private float fprice;
	private int ftime;
	private String fimgsrc;
	private String cname;
	private String caddress;
	private String cphone;

}
