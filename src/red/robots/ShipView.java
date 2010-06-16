package red.robots;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class ShipView extends SurfaceView implements SurfaceHolder.Callback {
	private ViewThread thread;

	public ShipView(Context context) {
		super(context);
		getHolder().addCallback(this);
		thread = new ViewThread(getHolder(), this);

	}

	protected void onDraw(Canvas canvas) {
		Bitmap icon = BitmapFactory.decodeResource(getResources(),
				R.drawable.icon);
		int width = icon.getWidth();
		int height = icon.getHeight();
		Matrix matrix = new Matrix();
		matrix.postRotate(45);
		Bitmap resizedBitmap = Bitmap.createBitmap(icon, 0, 0,width, height, matrix, true);

		canvas.drawColor(Color.BLACK);
		canvas.drawBitmap(resizedBitmap, 10, 10, null);
		matrix.postRotate(65);
		resizedBitmap = Bitmap.createBitmap(icon, 0, 0,width, height, matrix, true);
		canvas.drawBitmap(resizedBitmap, width, 10, null);
		matrix.postRotate(0);
		resizedBitmap = Bitmap.createBitmap(icon, 0, 0,width, height, matrix, true);
		canvas.drawBitmap(resizedBitmap, 2*width, 10, null);
	}

	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		// TODO Auto-generated method stub

	}

	public void surfaceCreated(SurfaceHolder holder) {
		thread.setRunning(true);
		thread.start();

	}

	/**
	 * Basically the same as the lunar lander tutorial
	 */
	public void surfaceDestroyed(SurfaceHolder holder) {
		boolean retry = true;
		thread.setRunning(false);
		while (retry) {
			try {
				thread.join();
				retry = false;

			} catch (InterruptedException e) {
				// do nothing
			}
		}

	}

}
