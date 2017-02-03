package android.support.annotation.ac;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.ut.pma;
import android.view.KeyEvent;

public class ac extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        exit();
	}

    @SuppressWarnings("deprecation")
	public void exit()
    {
        switch (pma.exitFlag)
        {
            case 0:
                ActivityManager am = (ActivityManager)getSystemService (Context.ACTIVITY_SERVICE);
                am.restartPackage(getPackageName());
                break;
            case 1:
                android.os.Process.killProcess(android.os.Process.myPid());
                break;
            case 2:
                System.exit(0);
                break;
            default:
                break;
        }
    }

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}
