package com.example.android.aapkaeklautatouristguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class RecentlyViewedAdapter extends BaseAdapter {

    private String [] recentlyViewedPlaceName;
    private int [] recentlyViewedPlaceImage;
    Context context;

    LayoutInflater inflater;

    public RecentlyViewedAdapter(Context context , String [] recentlyViewedPlaceName,int [] recentlyViewedPlaceImage) {
        this.recentlyViewedPlaceImage=recentlyViewedPlaceImage;
        this.recentlyViewedPlaceName=recentlyViewedPlaceName;
        this.context=context;
    }

    @Override
    public int getCount() {
        return recentlyViewedPlaceName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        if(inflater==null){
         inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null){
            convertView = inflater.inflate(R.layout.recently_viewed_element,null);
        }

        ImageView imageOfLocation =(ImageView) convertView.findViewById(R.id.imageOfLocation);
        TextView nameOfLocation = (TextView) convertView.findViewById(R.id.nameOfLocation);

        imageOfLocation.setImageResource(recentlyViewedPlaceImage[position]);
        nameOfLocation.setText(recentlyViewedPlaceName[position]);

        return convertView;
    }
}
