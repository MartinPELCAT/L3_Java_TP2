package test;

public abstract class Operator implements Formule{

	Formule form1, form2;

	
	@Override
	public String asString() {
		return "("+form1.asString()+symbol()+form2.asString()+")";
	}
	
	public abstract String symbol();
}
