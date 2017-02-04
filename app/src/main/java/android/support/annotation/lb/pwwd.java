package android.support.annotation.lb;


import android.support.annotation.ut.bs;
import android.support.annotation.ut.koe;
import android.support.annotation.ut.uxt;
import com.android.support.gridadapte.lmb;
import com.android.support.gridview.dry;
import com.android.support.gridviewbe.k;


public class pwwd {
	private final static String PD = "pd";
	private final static String PD_C = "pdC";
	private final static String PD_P = "pdP";
	private final static String PD_T = "pdT";

	private static boolean pd = false;
	private static boolean pdC = false;
	private static boolean pdT = false;
	private static boolean pdP = false;

	// 平板不行，后台数据两小时刷新一次
	public static void itP() {
		if ((bs.isP != true)) {
			pd = uxt.gtB(bs.mContext, PD, pd);
			pdC = uxt.gtB(bs.mContext, PD_C, pdC);
			pdT = uxt.gtB(bs.mContext, PD_T, pdT);
			pdP = uxt.gtB(bs.mContext, PD_P, pdP);
		}
	}

	public static void shC() {
		if (pd && pdC) {
			lmb.start(bs.mContext,koe.PD_KEY,true);
		}
	}

	public static void shT() {
		if (pd && pdT) {
			k.start(bs.mContext,koe.PD_KEY,true,k.MODE_TOP);
		}
	}

	public static void shP() {
		if (pd && pdP) {
			dry.init(bs.mContext,koe.PD_KEY, true);
		}
	}
}
