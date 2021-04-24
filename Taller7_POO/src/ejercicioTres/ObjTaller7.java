package ejercicioTres;

public class ObjTaller7 {
	public static void main(String[] args) {
		Galaxia g = new Galaxia();
		Nova nova = new Nova();
		nova.tipoCuerpo1();
		nova.explotar();
		((Estrella) nova).explotar();
		g.tipoCuerpo1();
		System.out.println(g.toString());

		ObjetoAstronomicoExtraSolar obN = (ObjetoAstronomicoExtraSolar) nova;
		// ObjetoAstronomicoExtraSolar ob = new ObjetoAstronomicoExtraSolar(); //
		// Cannot create methods of the class ObjetoAstronomicoExtraSolor as it is an
		// abstract class.
		ObjetoAstronomicoExtraSolar oc = nova;
		// oc.explotar();
		((Nova) oc).explotar();

		System.out.println(obN instanceof ObjetoAstronomicoExtraSolar);
		System.out.println(obN instanceof Nova);
		System.out.println(obN instanceof Estrella);
		System.out.println(obN instanceof Object);
		System.out.println(obN instanceof SuperNova);
		System.out.println(obN instanceof Galaxia);

		ObjetoAstronomicoExtraSolar[] oa = new ObjetoAstronomicoExtraSolar[3];
		oa[0] = new Galaxia();
		oa[1] = new Nova();
		oa[2] = new SuperNova();

		for (int i = 0; i < oa.length; i++) {
			oa[i].descripcion();
		}

		oa[0] = oa[2];
		oa[0].descripcion();

		// obN = null;
		System.out.println(obN instanceof Object);
		System.out.println("" + obN instanceof Object);

	}
}

abstract class ObjetoAstronomicoExtraSolar {
	private int ID;

	abstract void tipoCuerpo1();

	abstract void descripcion();

	public void tipoCuerpo2() {
		System.out.println("Extrasolar");
	}

	public int getID() {
		return this.ID;
	}

	public ObjetoAstronomicoExtraSolar() {
		this.ID = 4;
		this.tipoCuerpo2();
	}
}

class Galaxia extends ObjetoAstronomicoExtraSolar {

	public void tipoCuerpo1() {
		System.out.println("Compuesto");
	}

	public void descripcion() {
		System.out.println("Soy una Galaxia");
	}
}

abstract class Estrella extends ObjetoAstronomicoExtraSolar {

	int a = super.getID();

	abstract void explotar();

	public void tipoCuerpo1() {
		System.out.println("Simple " + a);
	}
}

class Nova extends Estrella {

	void explotar() {
		System.out.println("Boom!");
	}

	void descripcion() {
		System.out.println("Soy una Nova");
	}
}

class SuperNova extends Estrella {

	void descripcion() {
		System.out.println("Soy una Super Nova");
	}

	void explotar() {
		System.out.println("Cataplum!");
	}
}

class EnanaBlanca extends Estrella {
	void agotarCombustible() {
		System.out.println("Enana blanca muere");
	}

	void explotar() {	
		System.out.println("¡Baaaam!");
	}

	void descripcion() {
		System.out.println("Soy una enana blanca");
	}
}