package bai1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner inner = new Scanner(System.in);
	ManagerStaff manager = new ManagerStaff();
	while(true) {
		System.out.println("Application Manager Officer");
		System.out.println("Enter 1: Thêm cán bộ");
		System.out.println("Enter 2: Tìm kiếm cán bộ bằng tên");
		System.out.println("Enter 3: Hiện thị thông tin cán bộ");
		System.out.println("Enter 4: Thoát");
		String line = inner.nextLine();
		switch(line) {
		case "1" : {
			System.out.println("Enter a: Thêm kỹ sư");
			System.out.println("Enter b: Thêm Công nhân");
			System.out.println("Enter c: Thêm Nhân viên");
			String type = inner.nextLine();
			switch(type) {
			case "a" :{
				System.out.println("Nhập tên của kỹ sư : ");
				String name = inner.nextLine();
				System.out.println("Nhập tuổi của kỹ sư : ");
				int age = inner.nextInt();
				System.out.println("Nhập giới tính của kỹ sư : ");
				inner.nextLine();
				String gender = inner.nextLine();
				System.out.println("Nhập địa chỉ của kỹ sư : ");
				String address = inner.nextLine();
				System.out.println("Nhập chi nhánh của kỹ sư : ");
				String branch = inner.nextLine();
				CanBo KySu = new KySu(name, age, gender, address, branch);
				manager.addOfficer(KySu);
				System.out.println(KySu.toString());
				break;
				}
			case "b" :{
				System.out.println("Nhập tên của công nhân : ");
				String name = inner.nextLine();
				System.out.println("Nhập tuổi của công nhân : ");
				int age = inner.nextInt();
				System.out.println("Nhập địa chỉ của công nhân : ");
				String address = inner.nextLine();
				System.out.println("Nhập giới tính của công nhân : ");
				String gender = inner.nextLine();
				System.out.println("Nhập bậc của công nhân : ");
				int level = inner.nextInt();
				CanBo CongNhan = new CongNhan(name, age, gender, address, level);
				manager.addOfficer(CongNhan);
				System.out.println(CongNhan.toString());
				break;
			}
			case "c" : {
				System.out.println("Nhập tên của nhân viên : ");
				String name = inner.nextLine();
				System.out.println("Nhập tuổi của nhân viên : ");
				int age = inner.nextInt();
				System.out.println("Nhập địa chỉ của nhân viên  : ");
				String address = inner.nextLine();
				System.out.println("Nhập giới tính của nhân viên : ");
				String gender = inner.nextLine();
				System.out.println("Nhập nhiệm vụ của nhân viên : ");
				String task = inner.nextLine();
				CanBo NhanVien = new NhanVien(name, age, gender, address, task);
				manager.addOfficer(NhanVien);
				System.out.println(NhanVien.toString());
				break;
			}
			default :
				System.out.println("Invalid");
				break;
			}
			break;
		}
		case "2" : {
			System.out.println("Nhập tên để tìm kiếm ");
			String name = inner.nextLine();
			manager.searchOfficeByName(name).forEach(CanBo -> {
				System.out.println(CanBo.toString());
			});
			break;
		}
		case "3" : {
			manager.showInfor();
			break;
		}
		case "4" : {
			return;
		}
		default :
			System.out.println("Invalid");
			continue;
			}
		}
	}
}
