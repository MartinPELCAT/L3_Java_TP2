package test;

public class Sum extends Operator implements Formule {
	
	public Sum(Formule form1, Formule form2) {
		super.form1 = form1;
		super.form2 = form2;
	}

	@Override
	public String symbol() {
		return " + ";
	}

	@Override
	public double asValue() {
		return form1.asValue() + form2.asValue();
	}
}
