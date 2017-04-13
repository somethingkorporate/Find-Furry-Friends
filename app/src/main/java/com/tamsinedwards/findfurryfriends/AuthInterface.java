package com.tamsinedwards.findfurryfriends;

import android.content.Intent;

/**
 * Created by sampendergast on 4/7/17.
 */

public interface AuthInterface {


    void signIn();
    void signOut();

    boolean onActivityResult(int requestCode, int resultCode, Intent data);

}

