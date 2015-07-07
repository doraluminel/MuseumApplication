package com.example.esic.myapplication;

import android.widget.ListAdapter;
import android.widget.ImageView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.BaseAdapter;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(230, 230));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(1, 1, 1, 1);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.mipmap.un, R.mipmap.six,
            R.mipmap.deux, R.mipmap.un,
            R.mipmap.trois, R.mipmap.deux,
            R.mipmap.quatre, R.mipmap.cinq,
            R.mipmap.cinq, R.mipmap.six,
            R.mipmap.six, R.mipmap.deux,
            R.mipmap.un, R.mipmap.un,
            R.mipmap.deux, R.mipmap.trois,
            R.mipmap.trois, R.mipmap.cinq,
            R.mipmap.quatre, R.mipmap.un,
            R.mipmap.cinq, R.mipmap.deux
    };
}
