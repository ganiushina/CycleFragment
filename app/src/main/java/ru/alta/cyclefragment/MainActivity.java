package ru.alta.cyclefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SampleCallback {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v) {
        Fragment frag1 = getFragmentManager().findFragmentById(R.id.fragment1); // не понимаю, как передать строку во фрагмент. Здест ошибка, так не работает :(
        ((TextView) frag1.getView().findViewById(R.id.textView))
                .setText("Hello2");

    }

    @Override
    public void onButtonClicked() {
       TextView textView = findViewById(R.id.textView2);
       textView.setText("Hello");
    }

}
