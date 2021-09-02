package com.example.android.aapkaeklautatouristguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class FeaturedLocAdapter extends BaseAdapter {

    private int [] featuredLocationImage;
    private String [] featuredLocationName;
    Context context;

    LayoutInflater inflater;

    public FeaturedLocAdapter(Context context,int [] featuredLocationImage,String []featuredLocationName) {
        this.context=context;
        this.featuredLocationImage =featuredLocationImage;
        this.featuredLocationName =featuredLocationName;
    }

    @Override
    public int getCount() {
        return featuredLocationName.length;
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
        if( inflater==null){
            inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (convertView==null){
            convertView = inflater.inflate(R.layout.featured_location_element,null);
        }

        ImageView imageOfLocation = (ImageView) convertView.findViewById(R.id.imageOfLocation);
        TextView nameOfLocation = (TextView) convertView.findViewById((R.id.nameOfLocation));

        imageOfLocation.setImageResource(featuredLocationImage[position]);
        nameOfLocation.setText(featuredLocationName[position]);

        return convertView;
    }
}
