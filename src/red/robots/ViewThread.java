package red.robots;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class ViewThread extends Thread {
	private SurfaceHolder _surfaceHolder;
	private ShipView shipView;
	private boolean _run = false;

	public ViewThread(SurfaceHolder surfaceHolder, ShipView sv) {
		_surfaceHolder = surfaceHolder;
		shipView = sv;
	}

	public void setRunning(boolean run) {
		_run = run;
	}

	
	public void run() {
		Canvas c;
		while (_run) {
			c = null;
			try {
				c = _surfaceHolder.lockCanvas(null);
				synchronized (_surfaceHolder) {
					shipView.onDraw(c); 
				}
			} finally {
				if (c != null) {
					_surfaceHolder.unlockCanvasAndPost(c);
				}
				
			}
		}
	}

}
