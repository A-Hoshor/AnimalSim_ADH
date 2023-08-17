
public abstract class Animal {

	protected int simID;
	protected Location location=new Location(0,0);   
	protected boolean full;
	protected boolean rested;
	public Animal(int simID,int x, int y) throws InvalidCoordinateException {
		try {
		this.setSimID(simID);
		location.update(x,y);
		this.full = false;
		this.rested = false;
		} catch (InvalidCoordinateException e) {
			System.out.println(e.getLocalizedMessage());}
	}//end preferred argument constructor
	
	public Animal() {
		this.simID =0;
		location.update(0,0);
		this.full=false;
		this.rested=false;
	}//empty argument constructor
	
	public boolean eat() {
		double x = Math.random();
		if (x>=0.5) {
			full = true;
		} else {
			full =false;}
		return full;
	}//end eat
	
	public boolean sleep() {
		double x=Math.random();
		if (x>=0.5) {
			rested=true;
		} else {
			rested=false;
		}//end else
		return rested;
	}//end rested

	//Getters and Setters 
	
	public int getSimID() {
		return simID;
	}//end get simID

	public void setSimID(int simID) {
		try {
		if (simID>=0) {
			this.simID=simID;
		}//end if
		else
			throw new InvalidSimIDException("SimID must be greater than 0.");
		} catch (InvalidSimIDException e) {
			System.out.println(e.getMessage());
		}//end catch block
	}//end setSimID

	public Location getLocation() {
		return getLocation();
	}//end getLocation

	public void setLocation(int x, int y) throws InvalidCoordinateException {
		location.update(x, y);
	}//end set location

	public boolean isFull() {
		return full;
	}//end isFull

	public boolean isRested() {
		return rested;
	}//end isRested
	
}//end class
