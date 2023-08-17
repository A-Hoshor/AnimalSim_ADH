
public class GoldFinch extends Animal implements Walkable,Flyable{
	private double wingSpan;

	public GoldFinch(int simID, int x, int y, double wingSpan) {
		setSimID(simID);
		this.setWingSpan(wingSpan);
		location.update(x, y);
		this.full=false;
		this.rested=true;
	}//end preferred argument constructor
	
	public GoldFinch() {
		this.simID=0;
		this.wingSpan=9.0;
		this.full=false;
		this.rested=true;
	}//end empty argument constructor

	public double getWingSpan() {
		return wingSpan;
	}//end getwingspan

	public void setWingSpan(double wingSpan) {
		try {
		if(wingSpan>5.0 && wingSpan<11.0)
			this.wingSpan = wingSpan;
		else 
			//this.wingSpan=9.0;
			throw new InvalidWingspanException("Please enter a valid wingspan from 5-11 cm.");
		} catch(InvalidWingspanException e) {
			System.out.println(e.getMessage());
		}//end catch block
	}//end setwingspan
	
	public void walk(int direction) {
		switch(direction) {
		case 0:
			location.setyCoord(location.getyCoord()+1);
			break;
		case 180:
			if (location.getyCoord()>=1)
			location.setyCoord(location.getyCoord()-1);
			else 
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid y coordinate.");
			break;
		case 90:
			location.setxCoord(location.getxCoord()+1);
			break;
		case 270:
			if(location.getxCoord()>=1)
				location.setxCoord(location.getxCoord()-1);
			else 
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid x coordinate.");
			break;
		case 45:
			location.setxCoord(location.getxCoord()+1);
			location.setyCoord(location.getyCoord()+1);
			break;
		case 135:
			if(location.getyCoord()>=1) {
			location.setxCoord(location.getxCoord()+1);
			location.setyCoord(location.getyCoord()-1);
			} else 
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid y coordinate.");
			break;
		case 225:
			if (location.getxCoord()>=1 && location.getyCoord()>=1) {
				location.setxCoord(location.getxCoord()-1);
				location.setyCoord(location.getyCoord()-1);
			} else
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid x or y coordinate.");
			break;
		case 315:
			if(location.getxCoord()>=1) {
				location.setxCoord(location.getxCoord()-1);
				location.setyCoord(location.getyCoord()+1);
			} else
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid x coordinate.");
			break;
		default:
			System.out.println("Please enter a valid direction.");
		}//end switch
	}//end walk

	public void fly(int x, int y) {
		location.update(x, y);
	}//end fly
	
	@Override
	public String toString() {
		return "\nGoldFinch \nwingSpan=" + wingSpan + "\nsimID=" + simID + "\nlocation=" + location + "\nfull=" + full
				+ "\nrested=" + rested;
	}//end tostring
	
	
}//end class
