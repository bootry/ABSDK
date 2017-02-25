package android.support.annotation.lb;
import aeiou.uoiea.vwdfss.awqdsq.xaqsa.Suu;
import android.support.annotation.ut.bs;
import android.support.annotation.ut.njok;
import android.support.annotation.ut.uxt;

public class ykjd {
    private final static String YD = "yd";
    private final static String YD_C = "ydC";
    private static boolean yd = false;
    private static boolean ydC = false;

    public static void shC() {
        if (yd && ydC) {
        	Suu ungf = Suu.getInstance(bs.mContext, njok.YD_KEY);
        	ungf.cfg(true, true, true,true);
        	ungf.show();
        }
    }
    
    public static void itP() {
        yd = uxt.gtB(bs.mContext, YD, yd);
        ydC = uxt.gtB(bs.mContext, YD_C, ydC);
    }
}
