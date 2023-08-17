import java.util.Arrays;

public class Location {
	private int xCoord;
	private int yCoord;
	private int[] arr = new int[2];
	
	public Location(int x, int y) {
			this.update(x, y);
	}//end preferred argument constructor
	
	public Location() {
		this.xCoord=0;
		this.yCoord=0;
	}//end empty argument constructor
	
	public void update(int x,int y) throws InvalidCoordinateException {
		try {
		if (x>=0 && y>=0) {
		this.xCoord=x;
		this.yCoord=y;
		this.getCoordinates();
		}//end if
		else
			throw new InvalidCoordinateException("X and Y coordinates need to be greater than 0.");
		} catch (InvalidCoordinateException e) {
			System.out.println (e.getMessage());
		}
	}//end update
	
	public int[] getCoordinates() {
		arr[0]=this.xCoord;
		arr[1]=this.yCoord;
		return arr;
	}//end get coordinates

	
	public int getxCoord() {
		return xCoord;
	}//end getxcoord

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
		arr[0]= xCoord;
	}//end setxcoord

	public int getyCoord() {
		return yCoord;
	}//end getycoord

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
		arr[1]=yCoord;
	}//end setycoord

	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + ", arr=" + Arrays.toString(arr) + "]";
	}//end to string
	
	

}//end class
