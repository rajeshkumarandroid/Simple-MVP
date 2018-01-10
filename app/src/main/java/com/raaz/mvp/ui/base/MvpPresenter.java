
package com.raaz.mvp.ui.base;

/**
 * Created by rajeshkumar on 05-01-2018.
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

}
