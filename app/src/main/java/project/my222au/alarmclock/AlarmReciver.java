package project.my222au.alarmclock;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;



public class AlarmReciver extends BroadcastReceiver {

    private static final String TAG = AlarmReciver.class.getSimpleName() ;

    @Override
    public void onReceive(Context ctx, Intent intent) {
       Intent intent1 = new Intent(ctx,AlarmActivity.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);

        Log.d(TAG, "onReceive: Intent ");
        ctx.startActivity(intent1);
    }

}


