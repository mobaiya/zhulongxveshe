package com.teach.teach1907.interfaces;

/**
 * Created  on 2020/6/9.
 */
public interface OnRecyclerItemClick<T> {
    void onItemClick(int pos,T... pTS);
}
