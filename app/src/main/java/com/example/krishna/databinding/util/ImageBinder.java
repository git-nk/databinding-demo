package com.example.krishna.databinding.util;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.krishna.databinding.R;

/**
 * Created by krishna on March 23, 2017
 */

public class ImageBinder {
    @BindingAdapter("imageUrl")
    public static void setImageFromUrl(ImageView imageView, String url) {
        Context context = imageView.getContext();
        if (context != null) {
            Glide.with(context)
                    .load(url).asBitmap().placeholder(R.mipmap.ic_launcher_round).centerCrop()
                    .into(imageView);
        }
    }
}
