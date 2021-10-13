import pack2.ClasseBase;

public class ClasseEstesa extends ClasseBase {
	
	public ClasseEstesa(int x) {
		super(x);
	}
	
	public void usaProtected() {
		System.out.println("x = " + x);
		System.out.println(visibileAlleSottoClassi());
	}
}
