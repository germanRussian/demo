import java.util.Scanner;

public class ElevatorExam {

	public static void main(String[] args) throws Exception {
		Elevator e = new Elevator();
		e.currFloor = 1;
		e.floorMax = 4;
		e.floorMin = 1;
		e.weight = 550;
		e.nopsMAX = 8;
		
		Scanner scan = new Scanner(System.in);
		
		int menuNum = 0;
		
		System.out.println("현재 계신 층을 눌러주세요.");
		switch (scan.next()) {
		case "1상":
			e.currFloor = 1;
			e.openDoor();
			System.out.println("탑승했습니다.");
			e.closeDoor();
			
			break;

		default:
			break;
		}
		
		while(true) {
			System.out.println("===메뉴선택===");
			System.out.println("1:층이동");
			System.out.println("2:현재층");
			System.out.println("0:종료");
			menuNum = scan.nextInt();
			switch (menuNum) {
			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.println("탑승인원은 몇명입니까?");
				e.nops += scan.nextInt();
				if(e.nops > e.nopsMAX) {
					System.out.println("만원입니다. 다음에 이용해주세요.");
					Thread.sleep(1000);
				}
				System.out.println("이동할 층을 눌러주세요");
				int finishFloor = scan.nextInt();
				if(finishFloor <=e.floorMax && finishFloor >= e.floorMin) {
					System.out.println("현재 층은 " + e.currFloor);
					System.out.println("이동할 층은 " + finishFloor);
					
					if(e.currFloor < finishFloor) {
						e.upFloor(e.currFloor, finishFloor);
					} else if(e.currFloor > finishFloor){
						e.downFloor(e.currFloor, finishFloor);
					}
					e.currFloor = finishFloor; 
				} else {
					System.out.println("처음부터 다시 하세요.");
				}
				break;
			case 2:
				System.out.println("현재 층은 " + e.currFloor);
				break;
			default:
				break;
			}
		}
	}

}
