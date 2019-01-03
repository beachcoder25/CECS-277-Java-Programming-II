package lab6q1;


public class SimpleName implements NameInterface{
	
	String name;
	
	//simplename constructor
	
	public SimpleName(String n) {
		name = n;
	}
	
	@Override
	public void setName(String n) {
		name = n;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
