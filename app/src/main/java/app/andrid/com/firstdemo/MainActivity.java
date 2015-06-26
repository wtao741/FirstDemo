package app.andrid.com.firstdemo;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
        SpannableString spannable = new SpannableString(tv.getText().toString());
        spannable.setSpan(new BackgroundColorSpan(Color.RED),0,2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    }

}
