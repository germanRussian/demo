package impl;
 /**
  * 
  * 인터페이스 구성은 상수, 추상메소드만 사용가능하다.
  * 
  * @author smart17
  *
  */
public interface Remotecontrol {

	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; //상수만 오기때문에 final을 작성하지 않다도 된다. 자동  final.
	 
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
