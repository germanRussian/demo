
public class Elevator {
	// 필드
	int currFloor;// 현재층
	int floorMax;
	int floorMin;
	boolean doorSW;// false면 닫힘,true면 열림.
	int lampSW;// false면 꺼짐,true면 켜짐.
	int weight;// 무게
	int numberOfPassense;	 //탑승인원
	int numberOfPassenseMax; //최대탑승인원

	// 메소드
	void openDoor() throws InterruptedException {
		System.out.println("문열림");
		Thread.sleep(2000);
	}

	void closeDoor() throws InterruptedException {
		System.out.println("문닫힘");
		Thread.sleep(2000);
	}

	void downFloor(int currFloor, int finishFloor) throws InterruptedException {
		System.out.println("내려갑니다.");
		for (int i = currFloor; i >= finishFloor; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}

	}

	void upFloor(int currFloor, int finishFloor) throws InterruptedException {
		System.out.println("올라갑니다.");
		for(int i = currFloor; i <= finishFloor; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		
		}
		numberOfPassense = 0;
	}

	void buttonCtl() {
		System.out.println("버튼 컨트롤");
	}
}
