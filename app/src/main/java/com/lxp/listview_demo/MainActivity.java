package com.lxp.listview_demo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        this.mListView = findViewById(R.id.lv);

        // 新建User类型的List
        List<User> userList = new ArrayList<>();
        userList.add(new User("张三", 15));
        userList.add(new User("Lisa", 24));
        userList.add(new User("Michael", 35));
        userList.add(new User("Franklin", 27));

        this.mListView.setAdapter(new UserAdapter(this, R.layout.item_view, userList));

        this.mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                User user = userList.get(position);
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage(String.format("姓名：%1s，年龄：%2s", user.getName(), user.getAge()))
                        .show();
            }
        });
    }
}