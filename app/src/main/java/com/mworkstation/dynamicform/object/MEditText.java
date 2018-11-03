package com.mworkstation.dynamicform.object;

import android.content.Context;
import android.widget.EditText;

import com.mworkstation.dynamicform.jasonobject.JsnEditTextView;

import androidx.appcompat.widget.AppCompatEditText;

public class MEditText extends AppCompatEditText {
    public MEditText(Context context, JsnEditTextView jsnEditTextView) {
        super(context);
        this.setHint(jsnEditTextView.getHint());
        this.setLines(jsnEditTextView.getLine());
        this.setHeight(jsnEditTextView.getHieght());
    }
}
