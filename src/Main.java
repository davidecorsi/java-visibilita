import pack1.Visibile;
import pack2.ClasseBase;
import pack1.Invisibile;

public class Main {
	public static void main(String[] args) {
		Visibile v = new Visibile(3, 3); // il costruttore è di tipo amichevole
		System.out.println("y = " + v.y); // la variabile è di tipo amichevole
		System.out.println(v.nascostoFuori()); // il metodo è di tipo amichevole
		
		Invisibile i = new Invisibile(); // la classe è di tipo amichevole
		System.out.println(i.nascostoFuori());
		
		ClasseBase b = new ClasseBase(3); // il costruttore è di tipo protected
		System.out.println("x = " + b.x); // la variabile è di tipo protected
		System.out.println(b.visibileAlleSottoClassi()); // il metodo è protected
		
		ClasseEstesa e = new ClasseEstesa(3);
		e.usaProtected(); // riesco ad utilizzare il contenuto della variabile x della classe base perchè la estendo
	}
}
