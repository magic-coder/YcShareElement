package us.pinguo.shareelementdemo.simple;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import us.pinguo.shareelementdemo.R;
import us.pinguo.shareelementdemo.TransitionHelper;

/**
 * Created by huangwei on 2018/9/18 0018.
 */
public class SimpleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        TransitionHelper.enableTransition(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        getSupportFragmentManager().beginTransaction().add(R.id.simple_container, new Simple1Fragment()).commit();
    }
}
