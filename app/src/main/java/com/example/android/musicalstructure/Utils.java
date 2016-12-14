package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/**
 * Created by pedro on 12/13/16.
 */

public class Utils {
    public static final boolean FINISH_CALLING_ACTIVITY = true;
    public static final boolean LEAVE_CALLING_ACTIVITY_OPEN = false;

    /**
     * Utility method to add the onClick event listener to a view, with the startActivity action
     * inside of it.
     *
     * @param view              where to add the onClick event listener
     * @param fromActivity      the activity that is displaying the view
     * @param activityClass     the activity class that will be put in the intent to be used in the
     *                          startActivity method
     * @param closeFromActivity true or false indicating if the fromActivity needs to be closed
     *                          with the finish() method
     */
    public static void addOnClickListenerToOpenActivity(View view, final Activity fromActivity,
                                                        final Class<? extends Activity>
                                                                activityClass, final boolean
                                                                closeFromActivity) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPlay = new Intent(fromActivity, activityClass);
                fromActivity.startActivity(intentPlay);

                if (closeFromActivity) {
                    fromActivity.finish();
                }
            }
        });
    }
}
