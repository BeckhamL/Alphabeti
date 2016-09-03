package com.example.beckhaml.alphabet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Beckham L on 2016-08-22.
 */
public class ImageAdapter_g extends BaseAdapter {
    private Context mContext;

    public ImageAdapter_g(Context c) {
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
            imageView.setLayoutParams(new GridView.LayoutParams(750,750));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {

            R.drawable.g_pie3__1471917445_21900,R.drawable.g_pie2__1471917431_97071,
            R.drawable.g_pie4__1471917473_45139,R.drawable.g_pie1__1471917413_26330,
            R.drawable.g_pie6__1471917502_16411,R.drawable.g_pie5__1471917486_31248,


    };
}
