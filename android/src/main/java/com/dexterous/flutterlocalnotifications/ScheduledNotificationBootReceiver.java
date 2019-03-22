package com.dexterous.flutterlocalnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ScheduledNotificationBootReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(final Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null)
        {
            if (action.equals(android.content.Intent.ACTION_BOOT_COMPLETED)) {
                System.out.println("flutter_local_notifications: boot completed => scheduling notifications");
                FlutterLocalNotificationsPlugin.rescheduleNotifications(context);
            }
            else if (action.equals(android.content.Intent.ACTION_MY_PACKAGE_REPLACED)) {
                System.out.println("flutter_local_notifications: package replaced => scheduling notifications");
                FlutterLocalNotificationsPlugin.rescheduleNotifications(context);
            }
        }
    }
}
