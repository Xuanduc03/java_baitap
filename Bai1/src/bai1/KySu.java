package bai1;

public class KySu extends CanBo{
	private String branch;
	public KySu(String name, int age, String gender, String address , String branch) {
		super(name, age, gender, address);
		this.branch = branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBranch() {
		return branch;
	}
	@Override
	public String toString() {
		return "KySu{" + 
				" name='" + name + '\'' + 
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                "branch= '" + branch + '\'' +
                '}';
	}
	
}
