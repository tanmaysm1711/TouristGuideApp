package com.example.android.aapkaeklautatouristguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CardGridAdapter extends BaseAdapter {
    Context context;
    String[] touristPlaceNames;
    int[] touristPlaceImages;

    LayoutInflater inflater;
    public CardGridAdapter(Context context, String[] touristPlaceNames, int[] touristPlaceImages) {
        this.context = context;
        this.touristPlaceNames = touristPlaceNames;
        this.touristPlaceImages = touristPlaceImages;
    }

    @Override
    public int getCount() {
        return touristPlaceNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {return 0;}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.card_view_grid_item, null);

        ImageView touristPlaceImage = convertView.findViewById(R.id.imageOfLocation);
        TextView touristPlaceName = convertView.findViewById(R.id.nameOfLocation);

        touristPlaceImage.setImageResource(touristPlaceImages[position]);
            touristPlaceName.setText(touristPlaceNames[position]);
        return convertView;
    }
}
