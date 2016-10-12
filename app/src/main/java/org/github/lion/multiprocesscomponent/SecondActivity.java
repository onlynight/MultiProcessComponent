package org.github.lion.multiprocesscomponent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ((TextView) findViewById(R.id.textProcess)).setText(
                "SecondActivity running in : " + Utils.getProcessName(this)
        );

        System.out.println("SecondActivity running in : " + Utils.getProcessName(this));
    }
}
