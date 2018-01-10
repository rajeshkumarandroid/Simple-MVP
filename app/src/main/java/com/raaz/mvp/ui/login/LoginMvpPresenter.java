

package com.raaz.mvp.ui.login;

import com.raaz.mvp.ui.base.MvpPresenter;

/**
 * Created by rajeshkumar on 05-01-2018.
 */

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);

}
