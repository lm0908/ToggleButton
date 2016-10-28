package com.example.ekikousei.togglebuttondemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.ekikousei.view.ToggleButton;

public class MainActivity extends Activity {
    private ToggleButton mToggleButton01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToggleButton01 = (ToggleButton) findViewById(R.id.mToggleButton01);
        mToggleButton01.setOnToggleChanged(new ToggleButton.OnToggleChanged() {
            @Override
            public void onToggle(boolean on) {
                if (on) {
                    Toast.makeText(MainActivity.this, "打开", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "默认关闭", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
