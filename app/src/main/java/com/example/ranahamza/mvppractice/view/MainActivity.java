package com.example.ranahamza.mvppractice.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ranahamza.mvppractice.R;
import com.example.ranahamza.mvppractice.contract.MainActivityContract;
import com.example.ranahamza.mvppractice.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    Button button;
    TextView textView;
    MainActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter=new MainActivityPresenter(this);

    }


    @Override
    public void initView() {

        button=findViewById(R.id.btn);
        textView=findViewById(R.id.txt);

    }

    @Override
    public void setViewData(String data) {

        textView.setText(data);
    }
}
