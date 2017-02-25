package android.support.annotation.ut;

import java.util.Calendar;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;

import com.android.support.cardview.AppConnect;

public class uxt {

	public static int gtI(Context context, String key, int defaultValue) {
		int result = defaultValue;
		String value = AppConnect.getInstance(context).getConfig(key,
				String.valueOf(defaultValue));
		if (value != null && (!"".equals(value.trim()))) {
			result = Integer.parseInt(value);
		}
		ll.d(key + ":" + result);
		return result;
	}

	public static boolean gtB(Context context, String key,
			boolean defaultValue) {
		boolean result = defaultValue;
		String value = AppConnect.getInstance(context).getConfig(key,
				String.valueOf(defaultValue));
		if ("true".equals(value)) {
			result = true;
		} else {
			result = false;
		}
		ll.d(key + ":" + result);
		return result;
	}

	public static String gtS(Context context, String key,
			String defaultValue) {
		String result = AppConnect.getInstance(context).getConfig(key,
				defaultValue);
		if (TextUtils.isEmpty(result)){
			return defaultValue;
		}
		ll.d(key + ":" + result);
		return result;
	}

	// 检测时间
	public static boolean chT() {
		Calendar calendar = Calendar.getInstance();
		int time = calendar.get(Calendar.HOUR_OF_DAY);
		if (!((pma.timeOne <= time && time <= pma.timeTwo) || (pma.timeThree <= time && time <= pma.timeFour))) {
			return true;
		} else {
			return false;
		}
	}

	// 检测push
	public static boolean chP() {
		if (pma.appName && pma.isP) {
			return true;
		} else {
			return false;
		}
	}

	// 检测插屏
	public static boolean chC() {
		if (pma.appName && pma.isC) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean chA() {
		return pma.anQuan;
	}

	// 检测列表
	public static boolean chL() {
		if (pma.appName) {
			return true;
		} else {
			return false;
		}
	}

	// 检测条
	public static boolean chTT() {
		if (pma.appName && pma.isT) {
			return true;
		} else {
			return false;
		}
	}

	// 检查是否前台
	public static boolean isRb(Context context) {
		ActivityManager am = (ActivityManager) context
				.getSystemService(Context.ACTIVITY_SERVICE);
		ComponentName cn = am.getRunningTasks(1).get(0).topActivity;
		String currentPackageName = cn.getPackageName();
		if (!TextUtils.isEmpty(currentPackageName)
				&& currentPackageName.equals(context.getPackageName())) {
			return true;
		}
		return false;
	}

	// 是否为平板
	public static boolean isP(Context context) {
		return (context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE;
	}

}
