package com.example.android.aapkaeklautatouristguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class YourFavouritePlaceAdapter extends BaseAdapter {

    private String [] yourFavouritePlaceName ;
    private int [] yourFavouritePlaceImage ;
    Context context;

    LayoutInflater inflater;

    public YourFavouritePlaceAdapter(Context context,String [] yourFavouritePlaceName ,int [] yourFavouritePlaceImage) {
     this.context=context;
     this.yourFavouritePlaceImage=yourFavouritePlaceImage;
     this.yourFavouritePlaceName=yourFavouritePlaceName;
    }

    @Override
    public int getCount() {
        return yourFavouritePlaceImage.length;
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
        if(convertView==null){
            convertView = inflater.inflate(R.layout.recently_viewed_element,null);
        }

        ImageView imageOfLocation = (ImageView) convertView.findViewById(R.id.imageOfLocation);
        TextView nameOfLocation =(TextView) convertView.findViewById(R.id.nameOfLocation);

        imageOfLocation.setImageResource(yourFavouritePlaceImage[position]);
        nameOfLocation.setText(yourFavouritePlaceName[position]);

        return convertView;
    }
}
