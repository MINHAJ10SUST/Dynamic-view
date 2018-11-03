package com.mworkstation.dynamicform.jasonobject;

import android.content.Context;

import com.mworkstation.dynamicform.object.MEditText;

public class JsnEditTextView {
    String text;
    String hint;
    int hieght;
    int width;
    String textColor;
    String bgColor;
    int line;
    int position;

    public JsnEditTextView() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public int getHieght() {
        return hieght;
    }

    public void setHieght(int hieght) {
        this.hieght = hieght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public JsnEditTextView(int line) {
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public static MEditText getView(Context context, JsnEditTextView jsnEditTextView){
        return new MEditText(context,jsnEditTextView);
    }
}
