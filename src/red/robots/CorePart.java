package red.robots;

import java.util.List;

import android.graphics.Bitmap;

public class CorePart implements Part{
	private int ID;

	public CorePart(int id) {
		ID = id;
	}

	public int getAngle() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getAngleFromParent() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Bitmap getBitmap() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Part> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getDistanceFromParent() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Part getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAngle(int angle) {
		// TODO Auto-generated method stub
		
	}

	public void setAngleFromeParent() {
		// TODO Auto-generated method stub
		
	}

	public void setDistanceFromParent(int distance) {
		// TODO Auto-generated method stub
		
	}

	public int getID() {
		return ID;
	}

}
