
public class BrownBear extends Animal implements Walkable, Swimmable{

	private String subSpecies;
	
	public BrownBear() throws InvalidCoordinateException {
		this.simID=0;
		location.update(0,0);
		this.full=false;
		this.rested=true;
		this.subSpecies="Alaskan";
	}//end empty argument constructor
	
	public BrownBear(int simID, int x, int y, String subSpecies) throws InvalidCoordinateException, InvalidSubSpeciesException {
		try {
		this.simID=simID;
		location.update(x, y);
		this.setSubSpecies(subSpecies);
		this.full=false;
		this.rested=true;
		} catch (InvalidSimIDException e2) {
			System.out.println(e2.getMessage());
		}
	}//end preferred argument constructor

	public String getSubSpecies() {
		return subSpecies;
	}//end getSubSpecies

	public void setSubSpecies(String subSpecies) {
		try {
		switch(subSpecies.toLowerCase()) {
		case "alaskan" :
			this.subSpecies="Alaskan";
			break;
		case "asiatic" :
			this.subSpecies="Asiatic";
			break;
		case "european" :
			this.subSpecies="European";
			break;
		case "grizzly" :
			this.subSpecies="Grizzly";
			break;
		case "kodiak" :
			this.subSpecies="Kodiak";
			break;
		case "siberian" :
			this.subSpecies="Siberian";
			break; 
	default:
		throw new InvalidSubSpeciesException ("Please enter a valid subspecies.");
		}//end switch
		} catch(InvalidSubSpeciesException e) {
			System.out.println(e.getMessage());
		}
	
	}//end set sub species
	
	public void update(int x,int y) {
		try {
		location.update(x, y);}
		catch(InvalidCoordinateException e) {
			System.out.println(e.getMessage());
		}
	}//end update
	
	public void walk(int direction) {
		try {
		switch(direction) {
		case 0:
			location.setyCoord(location.getyCoord()+3);
			break;
		case 180:
			if (location.getyCoord()>=3)
			location.setyCoord(location.getyCoord()-3);
			else 
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid y coordinate.");
			break;
		case 90:
			location.setxCoord(location.getxCoord()+3);
			break;
		case 270:
			if(location.getxCoord()>=3)
				location.setxCoord(location.getxCoord()-3);
			else 
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid x coordinate.");
			break;
		case 45:
			location.setxCoord(location.getxCoord()+3);
			location.setyCoord(location.getyCoord()+3);
			break;
		case 135:
			if(location.getyCoord()>=2) {
			location.setxCoord(location.getxCoord()+3);
			location.setyCoord(location.getyCoord()-3);
			} else 
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid y coordinate.");
			break;
		case 225:
			if (location.getxCoord()>=3 && location.getyCoord()>=3) {
				location.setxCoord(location.getxCoord()-3);
				location.setyCoord(location.getyCoord()-3);
			} else
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid x or y coordinate.");
			break;
		case 315:
			if(location.getxCoord()>=2) {
				location.setxCoord(location.getxCoord()-3);
				location.setyCoord(location.getyCoord()+3);
			} else
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid x coordinate.");
			break;
		default:
			System.out.println("Please enter a valid direction.");
		}//end switch
		} catch (InvalidCoordinateException e1) {
			System.out.println(e1.toString());
		}
				
			
			
	}//end walk

	public void swim(int direction) {
		switch(direction) {
		case 0:
			location.setyCoord(location.getyCoord()+2);
			break;
		case 180:
			if (location.getyCoord()>=2)
			location.setyCoord(location.getyCoord()-2);
			else 
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid y coordinate.");
			break;
		case 90:
			location.setxCoord(location.getxCoord()+2);
			break;
		case 270:
			if(location.getxCoord()>=2)
				location.setxCoord(location.getxCoord()-2);
			else 
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid x coordinate.");
			break;
		case 45:
			location.setxCoord(location.getxCoord()+2);
			location.setyCoord(location.getyCoord()+2);
			break;
		case 135:
			if(location.getyCoord()>=2) {
			location.setxCoord(location.getxCoord()+2);
			location.setyCoord(location.getyCoord()-2);
			} else 
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid y coordinate.");
			break;
		case 225:
			if (location.getxCoord()>=2 && location.getyCoord()>=0) {
				location.setxCoord(location.getxCoord()-2);
				location.setyCoord(location.getyCoord()-2);
			} else
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid x or y coordinate.");
			break;
		case 315:
			if(location.getxCoord()>=2) {
				location.setxCoord(location.getxCoord()-2);
				location.setyCoord(location.getyCoord()+2);
			} else
				throw new InvalidCoordinateException("The move you are attempting will result in an invalid x coordinate.");
			break;
		default:
			System.out.println("Please enter a valid direction.");
		}//end switch
				
		
			
	}//end walk
	@Override
	public String toString() {
		return "\nBrownBear \nsubSpecies=" + subSpecies + "\nLocation=" + location + "\nsimID=" + simID +"\nFull=" + full + "\nRested=" + rested;
	}//end tostring
	
	
}//end class
