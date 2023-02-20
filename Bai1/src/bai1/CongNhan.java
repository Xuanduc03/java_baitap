package bai1;
public class CongNhan extends CanBo {
	private int level;
	public CongNhan(String name, int age, String gender, String address, int level) {
		super(name, age, gender, address);
		this.level = level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLevel() {
		return level;
	}
	@Override
	public String toString() {
		return "CongNhan{" + 
				"level=" + level +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
	}
}
