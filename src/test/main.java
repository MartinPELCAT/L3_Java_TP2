package test;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Formule form = new Sum(new Variable("x", 2.5),new Product(new Variable("y", 3), new Variable("v", 10)));
		
		System.out.println(form.asString());
		System.out.println(form.asValue());
	}

}
