package android.support.annotation.vw;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.ut.bs;

public class ma extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		bs.onCreate(this);

	}

	@Override
	protected void onResume() {
		bs.onResume();
		super.onResume();
	}
}
