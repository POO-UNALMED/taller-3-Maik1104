package taller3.televisores;

public class Control {
	private TV tv;
	public void enlazar(TV tv1) {
		tv = tv1;
		tv.setControl(this);
	}
	
	
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public void turnOn() {
		this.tv.turnOn();
	}
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	public void setCanal(int can) {
		this.tv.setCanal(can);
	}
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}
}
