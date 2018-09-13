package shiro.am.i.uimockapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_1b);
        layout = 1;
    }

    @Override
    public void onBackPressed() {
        if (layout == 1) {
            setContentView(R.layout.layout_2b);
            layout = 2;
        } else if (layout == 2) {
            setContentView(R.layout.layout_3);
            layout = 3;
        } else {
            super.onBackPressed();
        }
    }
}
