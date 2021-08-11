package pack2;

public class MainInterno {
	public static void main(String[] args) {
		ClasseBase b = new ClasseBase(3);
		System.out.println("x = " + b.x);
		System.out.println(b.visibileAlleSottoClassi());
	}
}
