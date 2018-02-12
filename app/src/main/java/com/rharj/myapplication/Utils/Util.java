package com.rharj.myapplication.Utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;

/**
 * Created by rharj on 2/9/2018.
 */

public class Util {

    public static ProgressDialog progressDialog;

    public static void showProgressDialog(Context context, String msg, boolean cancelable, boolean cancelOnTouchInside) {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(context);
        }

        progressDialog.setMessage(msg);
        progressDialog.setCancelable(cancelable);
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.parseColor("#dde2e6")));
        progressDialog.setCanceledOnTouchOutside(cancelOnTouchInside);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.show();
    }

    public static void hideProgressDialog(Activity activity) {
        if (progressDialog != null && !activity.isFinishing())
            progressDialog.dismiss();
        progressDialog = null;
    }
}
