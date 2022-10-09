package com.example.manager22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class CustomBaseAdapter extends BaseAdapter {
    String [] teams;
    Context context;
    LayoutInflater inflater;

    CustomBaseAdapter(Context ctx,String[] l){
        this.context=ctx;
        inflater=LayoutInflater.from(ctx);
        teams=l;

    }
    @Override
    public int getCount() {
        return teams.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup vg) {
        v = inflater.inflate(R.layout.activity_custom_list_view,null);
        Button buttonView=(Button) v.findViewById(R.id.button3);
        buttonView.setText(teams[i]);
        return v;
    }
}
