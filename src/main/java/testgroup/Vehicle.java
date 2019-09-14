package testgroup;

public class Vehicle
{
	String name;
	String regNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name+"s";
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	@Override
	public String toString() {
		return getName() + "/" + getRegNo();
	}
}
