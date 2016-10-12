package org.github.lion.multiprocesscomponent;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class ThirdService extends Service {
    public ThirdService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "ThirdService running in : " + Utils.getProcessName(this), Toast.LENGTH_SHORT).show();
        System.out.println("ThirdService running in : " + Utils.getProcessName(this));
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
//        throw new UnsupportedOperationException("Not yet implemented");
        return null;
    }
}
