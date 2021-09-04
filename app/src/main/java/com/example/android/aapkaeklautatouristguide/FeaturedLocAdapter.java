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

import org.jetbrains.annotations.NotNull;


public class FeaturedLocAdapter extends RecyclerView.Adapter<FeaturedLocAdapter.FeaturedLocViewHolder> {

    private int [] featuredLocationImage;
    private String [] featuredLocationName;
    Context context;

    LayoutInflater inflater;

    public FeaturedLocAdapter(Context context,String []featuredLocationName,int [] featuredLocationImage) {
        this.context=context;
        this.featuredLocationImage =featuredLocationImage;
        this.featuredLocationName =featuredLocationName;
    }

    @Override
    public FeaturedLocViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = inflater.from(context).inflate(R.layout.featured_location_element,parent,false);
        return new FeaturedLocViewHolder(view);
    }

    @Override
    public void onBindViewHolder( FeaturedLocViewHolder holder, int position) {
        holder.featuredLocationElementName.setText(featuredLocationName[position]);
        holder.featuredLocationElementImage.setImageResource(featuredLocationImage[position]);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return featuredLocationName.length;
    }


    public class FeaturedLocViewHolder extends RecyclerView.ViewHolder {

        public TextView featuredLocationElementName;
        public ImageView featuredLocationElementImage;


        public FeaturedLocViewHolder( View itemView) {
            super(itemView);

            featuredLocationElementName=itemView.findViewById(R.id.nameOfLocation);
            featuredLocationElementImage=itemView.findViewById(R.id.imageOfLocation);
        }
    }
}
