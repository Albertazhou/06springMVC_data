package can.vo;

public class User {
	private int id;
	private String name;
	private String passw;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassw() {
		return passw;
	}
	public void setPassw(String passw) {
		this.passw = passw;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", passw=" + passw + "]";
	}
	

}
