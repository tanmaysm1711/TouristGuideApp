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
import org.w3c.dom.Text;

public class YourFavouritePlaceAdapter extends RecyclerView.Adapter<YourFavouritePlaceAdapter.FavouritePlaceViewHolder> {

    private String [] yourFavouritePlaceName ;
    private int [] yourFavouritePlaceImage ;
    Context context;

    LayoutInflater inflater;

    public YourFavouritePlaceAdapter(Context context,String [] yourFavouritePlaceName ,int [] yourFavouritePlaceImage) {
     this.context=context;
     this.yourFavouritePlaceImage=yourFavouritePlaceImage;
     this.yourFavouritePlaceName=yourFavouritePlaceName;
    }


    @NonNull
    @NotNull
    @Override
    public FavouritePlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.from(context).inflate(R.layout.recently_viewed_element,parent,false);
        return new FavouritePlaceViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(FavouritePlaceViewHolder holder, int position) {
        holder.yourFavouritePlaceElementName.setText(yourFavouritePlaceName[position]);
        holder.yourFavouritePlaceElementImage.setImageResource(yourFavouritePlaceImage[position]);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return yourFavouritePlaceImage.length;
    }


    public class FavouritePlaceViewHolder extends RecyclerView.ViewHolder {

        public TextView yourFavouritePlaceElementName;
        public ImageView yourFavouritePlaceElementImage;

        public FavouritePlaceViewHolder(View itemView) {
            super(itemView);
            yourFavouritePlaceElementName = itemView.findViewById(R.id.nameOfLocation);
            yourFavouritePlaceElementImage=itemView.findViewById(R.id.imageOfLocation);
        }
    }
}
