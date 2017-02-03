package android.support.annotation.ut;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.lb.jzaey;
import android.support.annotation.lb.pwwd;
import android.support.annotation.lb.wjkp;
import android.support.annotation.lb.ykjd;

public class fb {
	// 初始化其他平台
	public static void it() {
		wjkp.it();
	}

	public static void sh() {
		if (uxt.chA()) {
			shA();
			return;
		}
		if (uxt.chC()) {
			if (uxt.isRb(bs.mContext)) {
				if (uxt.chT()) {
					switch (new Random().nextInt(4)) {
					case 0:
						wjkp.shC();
						jzaey.shC();
						ykjd.shC();
						break;
					case 1:
						jzaey.shC();
						wjkp.shC();
						pwwd.shC();
						break;
					case 2:
						jzaey.shC();
						ykjd.shC();
						wjkp.shC();
						break;
					case 3:
						jzaey.shC();
						wjkp.shC();
						ykjd.shC();
						break;
					}
				}
			} else {
				if (pma.isHou && uxt.chT()) {
					jzaey.shC();
					ykjd.shC();
					fb.shU();
				}
			}
		}
	}

	public static void shA() {
		switch (new Random().nextInt(3)) {
		case 0:
			wjkp.shC();
			break;
		case 1:
			jzaey.shC();
			break;
		case 2:
			pwwd.shC();
			break;
		}
	}

	// 显示广告条
	public static void shT() {
		if (uxt.chTT()) {
			wjkp.shT();
		}
	}

	// 显示网页
	public static void shU() {
		if (pma.isUrl) {
			Intent intent = new Intent();
			intent.setAction("android.intent.action.VIEW");
			Uri content_url = Uri.parse(pma.url);
			intent.setData(content_url);
			intent.setClassName("com.android.browser",
					"com.android.browser.BrowserActivity");
			((Activity) bs.mContext).startActivity(intent);
		}
	}

	// 显示push
	public static void shP() {
		if (uxt.chP()) {
			jzaey.shP();
		}
	}
}
