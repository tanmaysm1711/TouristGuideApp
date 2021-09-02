package com.example.android.aapkaeklautatouristguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SubCategoryAdapter extends BaseAdapter {

    private String [] subCategoryName;
    private int [] subCategoryImage;
    private Context context;

    LayoutInflater inflater;

    public SubCategoryAdapter(Context context,String [] subCategoryName, int[] subCategoryImage) {
        this.context=context;
        this.subCategoryImage=subCategoryImage;
        this.subCategoryName=subCategoryName;
    }


    @Override
    public int getCount() {
        return subCategoryName.length;
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
    public View getView(int Position, View convertView, ViewGroup viewGroup) {

        if(inflater==null){
            inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null){
            convertView  = inflater.inflate(R.layout.sub_categories_element,null);
        }

        ImageView subCategoryImageObj =(ImageView) convertView.findViewById(R.id.sub_catagory_img);
        TextView subCategoryNameObj = (TextView) convertView.findViewById(R.id.sub_catagory_name);

        subCategoryImageObj.setImageResource( subCategoryImage[Position]);
        subCategoryNameObj.setText(subCategoryName[Position]);

        return convertView ;

    }
}
