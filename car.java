
public class car {

	String modelName;
	int speed;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
/**
 * 함수설명 : 현재속도를 출력한다. 
 * @return 현재속도 km/h
 */
	public String getSpeed() {
		return speed+"km/h";
	}
	/**
	 * 함수설명 : 현재속도를 설정한다.
	 * 0이하는 0을 나타내고, 최고속도는 240이다.
	 * @param speed:현재속도 
	 */
	public void setSpeed(int speed) {
		if (speed <= 0) {
			this.speed = 0;
		} else if (speed > 240) {
			this.speed = 240;
		} else {
			this.speed = speed;
		}
	}
}

// else 대신
// if(speed <= 0) {
// this.speed = 0;
// return;
// }
// this.speed = speed;
// 로 사용 가능
