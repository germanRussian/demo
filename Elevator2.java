import java.util.Scanner;

public class Elevator2 {

	//필드
	int currFloor;//현재층
	int floorMax;
	int floorMin;
	//int door;
	boolean doorSW;//false면 닫음, true면 열림
	int lampSW;//false면 꺼짐, true면 켜짐
	int weight;//무게
	int nops;//현재탑승인원
	int nopsMax;//최대탑승인원
	
	//메소드
	void openDoor() throws InterruptedException  {
		System.out.println("문열림");
		Thread.sleep(2000);
	}
	void closeDoor() throws InterruptedException {
		System.out.println("문닫힘");
		Thread.sleep(2000);
	}
	void downFloor(int currFloor, int finishFloor) throws InterruptedException {
		System.out.println("내려갑니다.");
		for(int i = currFloor; i >= finishFloor; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}	
		nops = 0;
	}
	void upFloor(int currFloor, int finishFloor) throws InterruptedException {
		System.out.println("올라갑니다.");
		for(int i = currFloor; i <= finishFloor; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		nops = 0;
	}
	void buttonCtl() {
		System.out.println("버튼 콘트롤");
	}
	public void displayMenu() throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		int menuNum = 0;
		//while (true) {
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
				nops += scan.nextInt();
				if (nops > nopsMax) {
					System.out.println("미안합니다. 최씨성은 다 내리세요");
					Thread.sleep(1000);
				}
				System.out.println("이동할 층을 눌러주세요?");
				int finishFloor = scan.nextInt();// 숫자를 받아야함.

				if (finishFloor <= floorMax && finishFloor >= floorMin) {
					System.out.println("현재 층은 " + currFloor);
					System.out.println("이동할 층은 " + finishFloor);

					if (currFloor < finishFloor) {
						upFloor(currFloor, finishFloor);
					} else if (currFloor > finishFloor) {
						downFloor(currFloor, finishFloor);
					}
					currFloor = finishFloor;
					openDoor();
					System.out.println("하차하셨습니다.");
					closeDoor();
				} else {
					System.out.println("처음부터 다시 하세요.");
				}

				break;
			case 2:
				System.out.println("현재 층은 " + currFloor);
				break;
			default:
				break;
			}
		//}
		
	}
}




