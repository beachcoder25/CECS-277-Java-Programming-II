package lab6q1;

public class NameAdapter implements FullNameInterface {

	private String firstName = null;
	private String lastName = null; 
    
	
	// You need to implement the interface your
	// client expects to use
	
	// NameInterface nameInt;
	
	SimpleName sName;
	public NameAdapter(SimpleName n) {
		
		sName = n;
		
	    if(n.name.split("\\w+").length>1){

	    	firstName = sName.name.substring(0, sName.name.lastIndexOf(" "));
	        lastName = sName.name.substring(sName.name.lastIndexOf(" ")+1);
	        
	     }
		
		// we need a reference to the object we
		// are adapting
		
	 	}


	@Override
	public void setFirstName(String f) {
	
		
		firstName = f;
		sName.setName(f);

	}

	@Override
	public void setLastName(String lN) {
		
		lastName = lN;
		String fN = this.getFirstName();
		
		sName.setName(fN + " " + lN);
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		
	    if(sName.name.split("\\w+").length>1){

	    	firstName = sName.name.substring(0, sName.name.lastIndexOf(" "));
	        lastName = sName.name.substring(sName.name.lastIndexOf(" ")+1);
	        
	     }
		return firstName;
	}

	@Override
	public String getLastName() {
	   
		if(sName.name.split("\\w+").length>1){

	    	firstName = sName.name.substring(0, sName.name.lastIndexOf(" "));
	        lastName = sName.name.substring(sName.name.lastIndexOf(" ")+1);
	        
	     }
		
		return lastName;
	}
	

}
