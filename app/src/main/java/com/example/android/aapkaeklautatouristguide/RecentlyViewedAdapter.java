package com.example.android.aapkaeklautatouristguide;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecentlyViewedAdapter extends RecyclerView.Adapter<RecentlyViewedAdapter.RecentlyViewedViewHolder> {
    String[] recentlyViewedPlaceName;
    int[] recentlyViewedPlaceImage;
    Context context;

    public RecentlyViewedAdapter(Context context, String[] recentlyViewedPlaceName, int[] recentlyViewedPlaceImage) {
        this.context = context;
        this.recentlyViewedPlaceName = recentlyViewedPlaceName;
        this.recentlyViewedPlaceImage = recentlyViewedPlaceImage;
    }

    @NonNull
    @Override
    public RecentlyViewedAdapter.RecentlyViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recently_viewed_element, parent, false);
        return new RecentlyViewedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentlyViewedAdapter.RecentlyViewedViewHolder holder, int position) {
        holder.imageView.setImageResource(recentlyViewedPlaceImage[position]);
        holder.textView.setText(recentlyViewedPlaceName[position]);
    }

    @Override
    public int getItemCount() {
        return recentlyViewedPlaceImage.length;
    }

    public class RecentlyViewedViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public RecentlyViewedViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageOfLocation);
            textView = (TextView) itemView.findViewById(R.id.nameOfLocation);
        }
    }
}
