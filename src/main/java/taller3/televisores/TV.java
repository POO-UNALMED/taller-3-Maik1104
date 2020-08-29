package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV = 0;

	public TV(Marca mar, boolean est){
		marca = mar;
		estado = est;
		numTV++;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		if (this.getEstado() && 1<=this.getCanal() && this.getCanal()<120) {
			canal++;
		}
	}
	
	public void canalDown() {
		if (this.getEstado() && 1<this.getCanal() && this.getCanal()<=120) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if (this.getEstado() && 0<=this.getVolumen() && this.getVolumen()<7) {
		this.volumen++;
		}
	}
	
	public void volumenDown() {
		if (this.getEstado() && 0<this.getVolumen() && this.getVolumen()<=7) {
			this.volumen--;
			}
	}
	
	
	
	
	public boolean getEstado() {
		return estado;
	}

	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (this.getEstado() && 0<canal && canal<=120) {
			this.canal = canal;
		}
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
}
