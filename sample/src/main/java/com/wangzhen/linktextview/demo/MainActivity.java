package com.wangzhen.linktextview.demo;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.wangzhen.linktextview.LinkTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinkTextView textView = (LinkTextView) findViewById(R.id.tv_linktext);
        //设置超链接颜色
        textView.setLinkColor(ContextCompat.getColor(this, R.color.colorAccent));
        //监听超链接点击事件
        textView.setOnLinkClickListener(new LinkTextView.OnLinkClickListener() {
            @Override
            public void onClick(String url) {
                Toast.makeText(MainActivity.this, url, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
