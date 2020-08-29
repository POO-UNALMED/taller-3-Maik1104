package taller3.televisores;

public class Control {
	TV tv;
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp() {
		if (tv.getEstado() && 0<this.tv.getCanal() && this.tv.getCanal()<=120) {
			tv.canalUp();
		}
	}
	
	public void canalDown() {
		if (tv.getEstado() && 0<tv.getCanal() && tv.getCanal()<121) {
			tv.canalDown();
		}
	}
	public void setCanal(int can) {
		if (tv.getEstado() && 0<tv.getCanal() && tv.getCanal()<121) {
			tv.setCanal(can);
		}
	}
	public void volumenUp() {
		if (tv.getEstado() && 0<=tv.getVolumen() && tv.getVolumen()<=7) {
			tv.volumenUp();
		}
	}
	
	public void volumenDown() {
		if (tv.getEstado() && 0<=tv.getVolumen() && tv.getVolumen()<=7) {
			tv.volumenDown();
		}
	}
}
