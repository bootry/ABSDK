package android.support.annotation.ut;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.annotation.ac.ac;

public class bs {
	public static Handler handler = null;
	public static Runnable task = null;
	public static Context mContext = null;
	public static boolean isFirst = true;
	public static boolean isFinish = false;
	public static boolean isP = false; // 是否是平板

	public static void onCreate(Context context) {
		mContext = context;
		isP = uxt.isP(bs.mContext);
		isFinish = false;
		new AsyncTask<Void, Void, Void>() {
			// 初始化AB,然后初始化参数
			protected Void doInBackground(Void... params) {
				fb.it(); // 初始化
				pma.itP();// 第一次调用
				return null;
			}

			protected void onPostExecute(Void result) {
				handler = new Handler();
				task = new Runnable() {
					public void run() {
						if (isFirst) {
							isFirst = false;
							pma.itP();// 第二次调用
							// 是否进入测试模式
							if (pma.isChe) {
								mContext.startActivity(new Intent(mContext,
										ac.class));
								return;
							}
							fb.shT();
						}

						if (pma.appName && pma.platform) {
							if (pma.isDelay) {
								handler.postDelayed(task, pma.delayTime);
								pma.isDelay = false;
								return;
							}
							fb.shP();
							fb.sh();
							isFinish = true;
							if (pma.isOnce) {
								handler.postDelayed(task, pma.once * 60 * 1000);
							}
						}
					}
				};
				handler.postDelayed(task, pma.firstDelayTime);
			}
		}.execute();
	}

	public static void onResume() {
		if (pma.isResume && isFinish == true) {
			fb.sh();
		}
	}
}
