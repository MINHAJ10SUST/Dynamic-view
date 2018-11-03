package com.mworkstation.dynamicform.object;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

import com.mworkstation.dynamicform.jasonobject.JsnTextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class MTextView extends AppCompatTextView {

    public MTextView(Context context, JsnTextView jsnTextView) {
        super(context);
        this.setHint(jsnTextView.getHint());
        this.setTextColor(Color.parseColor(jsnTextView.getTextColor()));
    }


}
