package pack1;

public class Visibile {
	public int x;
	int y;
	
	public Visibile() {
		this(1, 2);
	}
	
	Visibile(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String VisibileFuori() {
		return "classe pack1.Visibile: metodo visibileFuori";
	}
	
	String nascostoFuori() {
		return "classe pack1.Visibile: metodo nascostoFuori";
	}
}
