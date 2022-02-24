
public class Car {

	String carmodelName;
	int speed;
	
	/**
	 * 차 이름을 나타낸다.
	 * @return
	 */
	public String getCarmodelName() {
		return carmodelName;
	}
	
	/**
	 * 차 이름을 설정한다.
	 * @param carmodelName
	 */
	public void setCarmodelName(String carmodelName) {
		this.carmodelName = carmodelName;
	}
	
	/**
	 * 
	 * 함수 설명 : 현재속도를 출력한다.
	 * @return 현재속도km/h
	 */
	public String getSpeed() {
		return speed + "km/h";
	}
	
	
	/**
	 * 함수 설명 : 차 속도를 설정합니다.
	 * 0이하는 0을 나타내고
	 * 속도 리밋은 240이다.
	 * @param speed : 현재속도
	 */
	public void setSpeed(int speed) {
		if(speed<=0) {
			this.speed = 0;
		}else if(speed>240) {
			this.speed =240;
		}else {
			this.speed = speed;
		}
		
	}
	
		
}
