package com.unisc.aula12;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MeuFirebaseInstanceService extends FirebaseMessagingService {
    public static final String TAG = "NOTIFICACAO";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"Tokem " + token);
    }
}
