package com.mworkstation.dynamicform.jasonobject;

import android.content.Context;

import com.mworkstation.dynamicform.object.MTextView;

public class JsnTextView {
    String text;
    String hint;
    int hieght;
    int width;
    String textColor;
    String bgColor;
    int position;

    public JsnTextView() {
    }

    public JsnTextView(String text, String hint, int hieght, int width, String textColor, String bgColor) {
        this.text = text;
        this.hint = hint;
        this.hieght = hieght;
        this.width = width;
        this.textColor = textColor;
        this.bgColor = bgColor;
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


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public static MTextView getView(Context context, JsnTextView jsnTextView){
        return new MTextView(context,jsnTextView);
    }
}
