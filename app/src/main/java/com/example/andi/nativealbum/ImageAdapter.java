package com.example.andi.nativealbum;

/**
 * Created by sigit on 26/01/16.
 */
import com.squareup.picasso.Picasso;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    int imageTotal = mThumbIds.length;
    public static String[] mThumbIds = {
            "http://i.imgur.com/Mm9HkvJ.png",
            "http://i.imgur.com/ySAHFH6.jpg",
            "http://i.imgur.com/v2VDH7T.jpg",
            "http://i.imgur.com/I8MfUqrb.jpg",
            "http://i.imgur.com/sH4GhYOb.jpg",
            "http://i.imgur.com/XONeaV3b.jpg",
            "http://i.imgur.com/21uExo8b.jpg",
            "http://i.imgur.com/ISbWckpb.jpg",
            "http://i.imgur.com/BOdeu7Nb.jpg",
            "http://i.imgur.com/adHMsnVb.jpg",
            "http://i.imgur.com/Z2u0PqYb.jpg",
            "http://i.imgur.com/c2SJIsUb.jpg",
            "http://i.imgur.com/RxYRmEab.jpg",
            "http://i.imgur.com/WJx8VqDb.jpg",
            "http://i.imgur.com/Kk4EJZqb.jpg",
            "http://i.imgur.com/hOVKNXvb.jpg",
            "http://i.imgur.com/e8yZULab.jpg",
            "http://i.imgur.com/hqe6QVtb.jpg",
            "http://i.imgur.com/LLZfRf9b.jpg",
            "http://i.imgur.com/AKJzIHBb.jpg",
            "http://i.imgur.com/CgRvwzjb.jpg"


    };

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return imageTotal;
    }

    @Override
    public String getItem(int position) {
        return mThumbIds[position];
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(480, 480));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        String url = getItem(position);
        Picasso.with(mContext)
                .load(url)
                .placeholder(R.drawable.loader)
                .fit()
                .centerCrop().into(imageView);
        return imageView;
    }
}
