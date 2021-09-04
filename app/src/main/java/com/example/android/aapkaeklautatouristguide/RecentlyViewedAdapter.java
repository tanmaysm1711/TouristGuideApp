package com.example.android.aapkaeklautatouristguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecentlyViewedAdapter extends RecyclerView.Adapter<RecentlyViewedAdapter.RecentlyViewedViewHolder> {

    private String [] recentlyViewedPlaceName;
    private int [] recentlyViewedPlaceImage;
    Context context;

    public RecentlyViewedAdapter(Context context , String [] recentlyViewedPlaceName, int [] recentlyViewedPlaceImage) {
        this.recentlyViewedPlaceImage=recentlyViewedPlaceImage;
        this.recentlyViewedPlaceName=recentlyViewedPlaceName;
        this.context=context;
    }

    @NonNull
    @Override
    public RecentlyViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sub_categories_element, parent, false);
        return new RecentlyViewedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentlyViewedViewHolder holder, int position) {
        holder.imageOfLocation.setImageResource(recentlyViewedPlaceImage[position]);
        holder.nameOfLocation.setText(recentlyViewedPlaceName[position]);
    }

    @Override
    public int getItemCount() {
        return recentlyViewedPlaceName.length;
    }

    public class RecentlyViewedViewHolder extends RecyclerView.ViewHolder{
        ImageView imageOfLocation;
        TextView nameOfLocation;
        public RecentlyViewedViewHolder(@NonNull View itemView) {
            super(itemView);
            imageOfLocation = (ImageView) itemView.findViewById(R.id.imageOfLocation);
            nameOfLocation = (TextView) itemView.findViewById(R.id.nameOfLocation);
        }
    }
}
