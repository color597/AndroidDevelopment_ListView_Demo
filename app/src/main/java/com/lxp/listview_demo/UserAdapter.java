package com.lxp.listview_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class UserAdapter extends ArrayAdapter<User> {

    private int resId;

    public UserAdapter(@NonNull Context context, int resource, @NonNull List<User> objects) {
        super(context, resource, objects);
        this.resId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        User user = getItem(position);

        View view;

        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(this.resId, parent, false);
        }
        else{
            view = convertView;
        }
        TextView nameView = view.findViewById(R.id.name);
        TextView ageView = view.findViewById(R.id.age);

        nameView.setText(user.getName());
        // 由于获取到的数据是int类型，直接使用的话，setText()方法会把数据当成资源ID，故需要用String.valueOf()方法将其转成String类型
        ageView.setText(String.valueOf(user.getAge()));

        return view;
    }

}
