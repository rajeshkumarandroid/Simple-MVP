
package com.raaz.mvp.ui.splash;

import com.raaz.mvp.ui.base.MvpPresenter;

/**
 * Created by rajeshkumar on 08-01-2018.
 */

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();

}
