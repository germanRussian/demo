import java.util.Scanner;

public class ElevatorExam2 {

	public static void main(String[] args) throws Exception {
		Elevator2 e = new Elevator2();
		e.currFloor = 1;
		e.floorMax = 4;
		e.floorMin = 1;
		e.weight = 550;
		e.nopsMax = 8;// 8명

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("현재 계신 층을 눌러주세요");
			switch (scan.next()) {
			case "1상":
				e.currFloor = 1;
				break;
			case "2상":
			case "2하":
				e.currFloor = 2;
				break;
			case "3상":
			case "3하":
				e.currFloor = 3;
				break;
			case "4하":
				e.currFloor = 4;
				break;
			default:
				break;
			}
			e.openDoor();
			System.out.println("탑승했습니다.");
			e.closeDoor();
			e.displayMenu();
		}

	}

}
