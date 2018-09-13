package shiro.am.i.uimockapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivityA extends AppCompatActivity {

    int layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_1a);
        layout = 1;
    }

    @Override
    public void onBackPressed() {
        if (layout == 1) {
            setContentView(R.layout.layout_2a);
            layout = 2;
        } else if (layout == 2) {
            setContentView(R.layout.layout_3a);
            layout = 3;
        } else if (layout == 3) {
            setContentView(R.layout.layout_1a);
            layout = 1;
        }
    }
}
