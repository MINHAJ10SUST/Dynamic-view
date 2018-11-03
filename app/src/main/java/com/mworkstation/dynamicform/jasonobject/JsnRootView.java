package com.mworkstation.dynamicform.jasonobject;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.mworkstation.dynamicform.object.MEditText;
import com.mworkstation.dynamicform.object.MLinearLayout;
import com.mworkstation.dynamicform.object.MTextView;

import java.util.ArrayList;

public class JsnRootView {
   JsnTextView jsnTextView;
   JsnEditTextView jsnEditTextView;

    public JsnRootView() {
    }

    public JsnTextView getJsnTextView() {
        return jsnTextView;
    }

    public void setJsnTextView(JsnTextView jsnTextView) {
        this.jsnTextView = jsnTextView;
    }

    public JsnEditTextView getJsnEditTextView() {
        return jsnEditTextView;
    }

    public void setJsnEditTextView(JsnEditTextView jsnEditTextView) {
        this.jsnEditTextView = jsnEditTextView;
    }

    public ArrayList<GenericView> genericViews(Context context){

        GenericView<MTextView> el1 = new GenericView<MTextView>(JsnTextView.getView(context,jsnTextView));
        GenericView<MEditText> el2 = new GenericView<MEditText>(JsnEditTextView.getView(context,jsnEditTextView));
        ArrayList<GenericView> genericViews=new ArrayList<>();
        genericViews.add(el1);
        genericViews.add(el2);

        ArrayList<GenericView> genericSort=new ArrayList<>();


        return genericViews;
    }


    public static MLinearLayout getView(MLinearLayout form,ArrayList<GenericView> genericViews){
        form.setOrientation(LinearLayout.VERTICAL);
        for(int i=0;i<genericViews.size();i++){
            form.addView((View) genericViews.get(i).getContent());
        }

        return  form;
    }


}
