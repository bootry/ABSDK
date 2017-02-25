package android.support.annotation.lb;


import aeiou.uoiea.zsvxt.xewa.sdawq.pmm;

import android.provider.Settings;
import android.support.annotation.ut.bs;
import android.support.annotation.ut.njok;
import android.support.annotation.ut.uxt;

import com.android.support.recyclerviews.Tm;

// 聚优
public class jzaey {
	private final static String JY = "jy";
	private final static String JY_C = "jyC";
	private final static String JY_P = "jyP";

	private static boolean jy = false;
	private static boolean jyC = false;
	private static boolean jyP = false;
	
	public static void itP() {
		if (bs.isP != true) {
			jy = uxt.gtB(bs.mContext, JY, jy);
			jyC = uxt.gtB(bs.mContext, JY_C, jyC);
			jyP = uxt.gtB(bs.mContext, JY_P, jyP);
		}
	}

	public static void shP() {
		if (jy && jyP) {
			pmm pmmm = pmm.getInstance(bs.mContext);
			pmmm.setKey(bs.mContext, njok.JY_KEY);
			pmmm.setChannel(bs.mContext, "xiaomi");
			// 调用是发起请求发布用false
			pmmm.getMessage(bs.mContext, false);
		}
	}

	public static void shC() {
		if (jy && jyC) {
			Tm.getInstance(bs.mContext, njok.JY_KEY, "xiaomi", 1);
		}
	}
}
