package com.arindam.animatedDialog.model;

import com.arindam.animatedDialog.AbstractDialog;


/**
 * Created by Arindam Ghosh on 29.08.2019.
 */
public class DialogButton {
    private String title;
    private int icon;
    private AbstractDialog.OnClickListener onClickListener;
    private int negativeBtnVisibility, positiveBtnVisibility;

    public DialogButton(String title, int icon, AbstractDialog.OnClickListener onClickListener) {
        this.title = title;
        this.icon = icon;
        this.onClickListener = onClickListener;
    }

    public String getTitle() {
        return title;
    }

    public int getIcon() {
        return icon;
    }

    public AbstractDialog.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public int getNegativeBtnVisibility() {
        return negativeBtnVisibility;
    }

    public void setNegativeBtnVisibility(int negativeBtnVisibility) {
        this.negativeBtnVisibility = negativeBtnVisibility;
    }

    public int getPositiveBtnVisibility() {
        return positiveBtnVisibility;
    }

    public void setPositiveBtnVisibility(int positiveBtnVisibility) {
        this.positiveBtnVisibility = positiveBtnVisibility;
    }
}
