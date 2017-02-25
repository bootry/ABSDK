package android.support.annotation.lb;

import android.app.Activity;
import android.support.annotation.ut.bs;
import android.support.annotation.ut.koe;
import android.support.annotation.ut.uxt;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.android.support.cardview.AppConnect;

public class wjkp {
	private final static String WP = "wp";
	private final static String WP_C = "wpC";
	private final static String WP_T = "wpT";

	private static boolean wp = false;
	private static boolean wpC = false;
	private static int wpT = 0; // 不显示，1上，2下
	
	public static void itP() {
		wp = uxt.gtB(bs.mContext, WP, wp);
		wpC = uxt.gtB(bs.mContext, WP_C, wpC);
		wpT = uxt.gtI(bs.mContext, WP_T, wpT);
	}

	public static void it() {
		AppConnect.getInstance(koe.WP_KEY, "xiaomi", bs.mContext);
		AppConnect.getInstance(bs.mContext).initPopAd(bs.mContext);
	}

	/** 万普 ***/
	public static void shC() {
		if (wp && wpC) {
			boolean hasPopAd = AppConnect.getInstance(bs.mContext).hasPopAd(
					bs.mContext);
			if (hasPopAd) {
				AppConnect.getInstance(bs.mContext).showPopAd(bs.mContext);
			}
		}
	}
	

	public static void shT() {
		if (wp && (wpT != 0)) {
			LinearLayout adlayout = new LinearLayout(bs.mContext);
			adlayout.setGravity(Gravity.CENTER_HORIZONTAL);
			FrameLayout.LayoutParams lp_Left_Bottom = new FrameLayout.LayoutParams(
					FrameLayout.LayoutParams.WRAP_CONTENT,
					FrameLayout.LayoutParams.WRAP_CONTENT);
			// 设置广告出现的位置，例如，悬浮于右下角(可选)
			switch (wpT) {
			case 1:
				lp_Left_Bottom.gravity = Gravity.TOP | Gravity.CENTER;
				break;
			case 2:
				lp_Left_Bottom.gravity = Gravity.TOP | Gravity.RIGHT;
				break;
			case 3:
				lp_Left_Bottom.gravity = Gravity.TOP | Gravity.LEFT;
				break;
			case 4:
				lp_Left_Bottom.gravity = Gravity.BOTTOM | Gravity.CENTER;
				break;
			case 5:
				lp_Left_Bottom.gravity = Gravity.BOTTOM | Gravity.RIGHT;
				break;
			case 6:
				lp_Left_Bottom.gravity = Gravity.BOTTOM | Gravity.LEFT;
				break;
			}
			AppConnect.getInstance(bs.mContext).showBannerAd(bs.mContext,
					adlayout);
			((Activity) bs.mContext).addContentView(adlayout, lp_Left_Bottom);
		}
	}
}
