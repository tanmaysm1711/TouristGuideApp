package com.example.android.aapkaeklautatouristguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.SubCategoryViewHolder> {

    private String [] subCategoryName;
    private int [] subCategoryImage;
    private Context context;

    LayoutInflater inflater;

    public SubCategoryAdapter(Context context,String [] subCategoryName, int[] subCategoryImage) {
        this.context=context;
        this.subCategoryImage=subCategoryImage;
        this.subCategoryName=subCategoryName;
    }

    @NonNull
    @NotNull
    @Override
    public SubCategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.from(context).inflate(R.layout.sub_categories_element,parent,false);
        return new SubCategoryViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(SubCategoryViewHolder holder, int position) {
        holder.subCategoryElementName.setText(subCategoryName[position]);
        holder.subCategoryElementImage.setImageResource(subCategoryImage[position]);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return subCategoryName.length;
    }

    public class SubCategoryViewHolder extends RecyclerView.ViewHolder {

        public TextView subCategoryElementName;
        public ImageView subCategoryElementImage;

        public SubCategoryViewHolder(View view) {
            super(view);
            subCategoryElementName= view.findViewById(R.id.sub_catagory_name) ;
            subCategoryElementImage = view.findViewById(R.id.sub_catagory_img);
        }
    }
}
