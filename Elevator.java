
public class Elevator {
	//필드
	int currFloor; //현재층 
	int floorMax;
	int floorMin; 
	//int door;
	boolean doorSW; //false면 닫음, true면 열림. 
	int lampSW; //false면 꺼짐, true면 켜짐.
	int weight; //무게 
	int nops; //현재 탑승 인원 numberOfPassengers
	int nopsMAX;//최대 탑승 인원 
	
	//메소드
	void openDoor() throws InterruptedException {
		System.out.println("문열림");
		Thread.sleep(1000);
	}
	void closeDoor() throws InterruptedException {
		System.out.println("문닫힘");
		Thread.sleep(1000);
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
		System.out.println("버튼 컨트롤");
	}
}
