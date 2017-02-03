package android.support.annotation.lb;
import aeiou.uoiea.vwdfss.awqdsq.xaqsa.Suu;
import android.support.annotation.ut.bs;
import android.support.annotation.ut.njok;
import android.support.annotation.ut.uxt;

public class ykjd {
    private final static String YD = "yd";
    private final static String YD_CHA = "ydCha";
    private static boolean yd = false;
    private static boolean ydCha = false;

    public static void shC() {
        if (yd && ydCha) {
        	Suu ungf = Suu.getInstance(bs.mContext, njok.YD_KEY);
        	ungf.cfg(true, true, true,true);
        	ungf.show();
        }
    }
    
    public static void itP() {
        yd = uxt.gtB(bs.mContext, YD, yd);
        ydCha = uxt.gtB(bs.mContext, YD_CHA, ydCha);
    }
}
