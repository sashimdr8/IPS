package com.ips.views;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.TextView;

import com.ips.App;


/**
 * Created by brain on 2/23/17.
 */

public class FontIcon extends TextView {
    public FontIcon(Context context) {
        super(context);
        init();
    }

    public FontIcon(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FontIcon(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public FontIcon(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode())
            setTypeface(App.component(getContext()).getTypefaceProvider().getFontIcon());
    }


}
