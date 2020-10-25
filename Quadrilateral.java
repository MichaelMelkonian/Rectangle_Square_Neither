
public class Quadrilateral {
	private int side1, side2, side3, side4;
	public int getSide1() {
		
		return side1;
		
	}	//Getter Class for the sides
	public int getSide2() {
		
		return side2;
		
	}
	public int getSide3() {
	
		return side3;
		
	}
	public int getSide4() {
		
		return side4;
		
	}
	
	//Setters for the sides

	public void setSide1(int length) {
		
		side1 = length;
		return;
	}

	public void setSide2(int length) {
		
		side2 = length;
		return;
	}

	public void setSide3(int length) {
		
		side3 = length;
		return;
	}

	public void setSide4(int length) {
		
		side4 = length;
		return;
	}
	
	private boolean hasCongruentDiagonals(int side1, int side2, int side3, int side4)
	{
		
		int sd = (int) Math.hypot(side1, side2);
		int df = (int) Math.hypot(side3, side4);
		
		if(sd == df) {
			return true;
		}
		
		else
			return false;
		
	}
	public boolean isRectangle() {
		
		if(side1 == side3 && side2 == side4 && hasCongruentDiagonals(side1, side2, side3, side4)) {
			return true;
		}
		else
			return false;
		
	}
	public boolean isSquare() {
		
		
		if(side1 == side2 && isRectangle()) {
			
			return true;
		}
		return false;
	}
}
