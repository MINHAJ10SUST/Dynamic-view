package com.mworkstation.dynamicform.jasonobject;

public class GenericView<E> {
    private E content;

    // Constructor
    public GenericView(E content) {
        this.content = content;
    }

    public GenericView() {

    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public String toString() {
        return content + " (" + content.getClass() + ")";
    }
}
