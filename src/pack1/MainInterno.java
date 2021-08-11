package pack1;

public class MainInterno {
	public static void main(String[] args) {
		Visibile v = new Visibile(3, 3);
		System.out.println("y = " + v.y);
		System.out.println(v.nascostoFuori());
		
		Invisibile i = new Invisibile();
		System.out.println(i.nascostoFuori());
	}
}
