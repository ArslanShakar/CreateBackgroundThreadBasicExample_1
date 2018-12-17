package com.practice.coding.createbackgroundthreadbasicexample_1;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Handler handler;

    private TextView textView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        progressBar = findViewById(R.id.progressBarHorizontal);

    }

    public void runCode(View view) {

        DownloadSongsThread thread = new DownloadSongsThread();
        thread.start();
        textView.setText("code executing by "+thread.getName());
    }
}
