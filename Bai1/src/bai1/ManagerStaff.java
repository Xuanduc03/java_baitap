package bai1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Collector;
public class ManagerStaff {
	private List<CanBo> CanBos;
	
	public ManagerStaff() {
		this.CanBos = new ArrayList<>();
	}
	public void addOfficer(CanBo CanBos) {
		this.CanBos.add(CanBos);
	}
	public List<CanBo> searchOfficeByName(String name){
		 return this.CanBos.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
	}
	public void showInfor() {
		this.CanBos.forEach(o -> System.out.println(o.toString()));
	}
}
