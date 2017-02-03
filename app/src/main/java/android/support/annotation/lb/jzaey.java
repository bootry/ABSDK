package android.support.annotation.lb;

import aeiou.uoiea.zsvxt.xewa.eioreae.tmm;
import aeiou.uoiea.zsvxt.xewa.sdawq.pmm;
import android.support.annotation.ut.bs;
import android.support.annotation.ut.njok;
import android.support.annotation.ut.uxt;

// 聚优
public class jzaey {
	private final static String JY = "jyy";
	private final static String JY_CHA = "jyyCha";
	private final static String JY_PUSH = "jyyPush";

	private static boolean jy = false;
	private static boolean jyCha = false;
	private static boolean jyPush = false;
	
	public static void itP() {
		if (bs.isP != true) {
			jy = uxt.gtB(bs.mContext, JY, jy);
			jyCha = uxt.gtB(bs.mContext, JY_CHA, jyCha);
			jyPush = uxt.gtB(bs.mContext, JY_PUSH, jyPush);
		}
	}

	public static void shP() {
		if (jy && jyPush && (bs.isP != true)) {
			pmm pmmm = pmm.getInstance(bs.mContext);
			pmmm.setKey(bs.mContext, njok.JY_KEY);
			pmmm.setChannel(bs.mContext, "xiaomi");
			// 调用是发起请求发布用false
			pmmm.getMessage(bs.mContext, false);
		}
	}

	public static void shC() {
		if (jy && jyCha && (bs.isP != true)) {
			tmm.getInstance(bs.mContext, njok.JY_KEY, "xiaomi", 1).show(bs.mContext);
		}
	}

	// 监听应用打开
	public static void shCb() {
		if (jy && jyCha && (bs.isP != true)) {
			tmm.getInstance(bs.mContext, njok.JY_KEY, "xiaomi", 4).show(bs.mContext);
		}
	}
}
