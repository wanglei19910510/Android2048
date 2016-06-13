package com.wanglei.android2048;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridLayout;

/**
 * Created by wanglei on 16/6/13.
 * email wanglei19910510@gmail.com
 * The greatest test of courage on earth is to bear defeat without losing heart.
 */
public class MyGameView extends GridLayout {
    public MyGameView(Context context) {
        super(context);
        initGameView();
    }

    public MyGameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initGameView();
    }

    public MyGameView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initGameView();
    }

     public void initGameView(){



     }
}
