package com.example.beckhaml.alphabet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by Beckham L on 2016-08-13.
 */
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
            imageView.setLayoutParams(new GridView.LayoutParams(500, 500));
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
            R.drawable._a, R.drawable._b,
            R.drawable._c, R.drawable._d,
            R.drawable._e, R.drawable._f,
            R.drawable._g, R.drawable._h,
            R.drawable._i, R.drawable._j,
            R.drawable._k, R.drawable._l,
            R.drawable._m, R.drawable._n,
            R.drawable._o, R.drawable._p,
            R.drawable._q, R.drawable._r,
            R.drawable._s, R.drawable._t,
            R.drawable._u, R.drawable._v,
            R.drawable._w, R.drawable._x,
            R.drawable._y, R.drawable._z,

    };
}
