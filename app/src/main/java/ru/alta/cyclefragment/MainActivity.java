package ru.alta.cyclefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SampleCallback {

    String myMessage = "Stack Overflow is cool!";
  //  Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v) {

        BlankFragment fragment = new BlankFragment();
        Bundle bundle = new Bundle();
//        bundle.putInt(key, value);
//        fragment.setArguments(bundle);
//        Fragment frag1 = getFragmentManager().findFragmentById(R.id.fragment1);
//        ((TextView) frag1.getView().findViewById(R.id.textView))
//                .setText("Hello2");

    }

    @Override
    public void onButtonClicked() {
       TextView textView = findViewById(R.id.textView2);
       textView.setText("Hello");
    }

}
