import java.util.Scanner;

public class ElevatorExam {

	public static void main(String[] args) throws Exception {

		Elevator e = new Elevator();
		e.currFloor = 1;
		e.floorMax = 4;
		e.floorMin = 1;
		e.numberOfPassenseMax = 8;

		Scanner scan = new Scanner(System.in);
		int menuNum = 0;
		
		System.out.println("현재 계신 층을 선택해주세요.");
		switch (scan.next()) {
		case "1상":
			e.currFloor = 1;
			e.openDoor();
			System.out.println("탑승했습니다.");
			Thread.sleep(2000);
			e.closeDoor();
			
			break;

		default:
			break;
		}
		
		
		
		
		while (true) {
			System.out.println("=========== 메뉴 선택 ==========");
			System.out.println("0: 종료");
			System.out.println("1: 이동");
			System.out.println("2: 현재층");
			System.out.println("3: 탑승인원");
			System.out.println("==============================");

			menuNum = scan.nextInt();

			switch (menuNum) {

			case 0:
				System.exit(0);// if(menuNum ==0) break와 같은 기능을한다.
				break;

			case 1:
				System.out.println("탑승인원은 몇명입니까?");
				e.numberOfPassense += scan.nextInt();
				if(e.numberOfPassense > e.numberOfPassenseMax) {
					System.out.println("내리세요.");
					Thread.sleep(1000);
				}
				
				
				System.out.println("이동할 층을 선택해주세요");

				int finishFloor = scan.nextInt();
				if (finishFloor <= e.floorMax && finishFloor >= e.floorMin) {
					System.out.println("현재 층은 " + e.currFloor);
					System.out.println("이동할 층은 " + finishFloor);

					if (e.currFloor < finishFloor) {
						e.upFloor(e.currFloor, finishFloor);

					} else if (e.currFloor > finishFloor) {
						e.downFloor(e.currFloor, finishFloor);
					}
					e.currFloor = finishFloor;

				} else {
					System.out.println("처음부터 다시 하세요.");
				}

				break;

			case 2:
				System.out.println("현재층은 " + e.currFloor);
				break;

			default:
				break;

			}

		}

	}

}
