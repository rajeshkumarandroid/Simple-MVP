
package com.raaz.mvp.ui.main;

import com.raaz.mvp.ui.base.MvpPresenter;

/**
 * Created by rajeshkumar on 23-08-2017.
 */

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLoggedOut();

}
