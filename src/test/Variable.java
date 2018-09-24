package test;

public class Variable implements Formule{

	String name;
	double value;
	
	public Variable(String name, double value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String asString() {
		return this.name;
	}
	
	@Override
	public double asValue() {
		return this.value;
	}
}
