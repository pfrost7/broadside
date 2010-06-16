package red.robots;

import java.util.List;

import android.graphics.Bitmap;

public interface Part {
	public int getID();
	public Part getParent();
	public List<Part> getChildren();
	public void setAngle(int angle);
	public int getAngle();
	public Bitmap getBitmap();
	public int getDistanceFromParent();
	public void setDistanceFromParent(int distance);
	public int getAngleFromParent();
	public void setAngleFromeParent();

}
