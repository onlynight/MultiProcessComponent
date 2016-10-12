package org.github.lion.multiprocesscomponent;

import android.app.ActivityManager;
import android.content.Context;

/**
 * Created by lion on 2016/10/12.
 */

public class Utils {

    public static String getProcessName(Context context) {
        int pid = android.os.Process.myPid();
        String processName = "";
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningAppProcessInfo process : manager.getRunningAppProcesses()) {
            if (process.pid == pid) {
                processName = process.processName;
            }
        }

        return processName;
    }
}
