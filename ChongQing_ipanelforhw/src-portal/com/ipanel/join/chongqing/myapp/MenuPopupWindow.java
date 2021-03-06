package com.ipanel.join.chongqing.myapp;

import com.ipanel.chongqing_ipanelforhw.R;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.PopupWindow;


public class MenuPopupWindow implements OnKeyListener{
	private MyAppActivity mActivity;
	private PopupWindow popwindow;

	public MenuPopupWindow(Activity mActivity) {
		this.mActivity = (MyAppActivity) mActivity;
		View v = mActivity.getLayoutInflater().inflate(
				R.layout.myapp_menu, null);
		popwindow = new PopupWindow(v);
		popwindow.setFocusable(true);
		ColorDrawable dw = new ColorDrawable(0x00000000);
		popwindow.setBackgroundDrawable(dw);
		v.setOnKeyListener(this);
	}

	public PopupWindow getPop() {
		return popwindow;
	}

	@Override
	public boolean onKey(View v, int keyCode, KeyEvent event) {
		if(event.getAction() == KeyEvent.ACTION_DOWN){
			mActivity.onKeyDown(keyCode, event);
		}
		return false;
	}
	
	public boolean isMenuWindowShowing(){
		if(popwindow != null)
			return popwindow.isShowing();
		return false;
	}
	
	public void hideMenuWindow(){
		if(popwindow != null)
			popwindow.dismiss();
	}
}
