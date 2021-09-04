package com.example.android.aapkaeklautatouristguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {

    public String [] subCategoryName ={" Beach","Mountain","Monument","Temple","Waterfall","Market",
    "Gardens","Amusement Parks","Wildlife","Malls","snow"};
    public int [] subCategoryImage ={R.drawable.beach,R.drawable.mountains,R.drawable.monuments,
            R.drawable.temple,R.drawable.waterfall,R.drawable.market, R.drawable.garden,
            R.drawable.amusement_park,R.drawable.wildlife,R.drawable.mall,R.drawable.snow};


    public String [] featuredLocationName ={ "Gateway of India","Sanjay Gandhi National Park","Haji Ali Dargah",
            "Elephanta Caves","Siddhivinayak Temple","Chhatrapati Shivaji Terminus (CST)","ISKCON Temple",
            "Shri Mahalakshmi Temple","Powai Lake,","Kidzania","EsselWorld"};
    public int [] featuredLocationImage ={R.drawable.gateway_of_india,R.drawable.sgnp,R.drawable.haji_ali,
            R.drawable.elephanta_caves,R.drawable.siddhivinayak_mandir,R.drawable.chhatrapati_shivaji_terminus
            ,R.drawable.iskcon_temple,R.drawable.mahalakhmi_mandir,R.drawable.powai_lake,R.drawable.kidzania
            ,R.drawable.essel_world};


    public String [] yourFavouritePlaceNmae={
            "EsselWorld","Juhu Beach","Marine Drive",
            "Chota Kashmir","Worli Sea Face","Hanging Gardens","Madh Island",
            "Bandra-Worli Sea Link","Colaba Causeway","Mumbai Film City","Snow World"};
    public int [] yourFavouritePlaceImage ={R.drawable.essel_world,R.drawable.juhu_beach,R.drawable.marine_drive
            ,R.drawable.chota_kashmir,R.drawable.worli_sea_face,R.drawable.hanging_gardens,R.drawable.madh_island_beach
            ,R.drawable.worli_sea_face,R.drawable.colaba_causeway,R.drawable.film_city,R.drawable.snow_world};


    public String [] recentlyViewedPlaceName={
            "EsselWorld","Juhu Beach","Marine Drive",
            "Chota Kashmir","Worli Sea Face","Hanging Gardens","Madh Island",
            "Bandra-Worli Sea Link","Colaba Causeway","Mumbai Film City","Snow World"};
    public int [] recentlyViewedPlaceImage ={R.drawable.essel_world,R.drawable.juhu_beach,R.drawable.marine_drive
            ,R.drawable.chota_kashmir,R.drawable.worli_sea_face,R.drawable.hanging_gardens,R.drawable.madh_island_beach
            ,R.drawable.worli_sea_face,R.drawable.colaba_causeway,R.drawable.film_city,R.drawable.snow_world};



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        ListView subCategory = (ListView) findViewById(R.id.sub_category);
        ListView featuredLocList = (ListView) findViewById(R.id.featured_loc_list);
        ListView yourFavouritePlaceList = (ListView) findViewById(R.id.your_favourite_place_list);
        RecyclerView recentlyViewedList = (RecyclerView) findViewById(R.id.recently_viewed_list);

        subCategory.setAdapter(new SubCategoryAdapter(this,subCategoryName,subCategoryImage));
        featuredLocList.setAdapter(new FeaturedLocAdapter(this,featuredLocationName,featuredLocationImage));
        yourFavouritePlaceList.setAdapter(new YourFavouritePlaceAdapter(this,yourFavouritePlaceNmae,yourFavouritePlaceImage));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recentlyViewedList.setLayoutManager(linearLayoutManager);
        recentlyViewedList.setAdapter(new RecentlyViewedAdapter(this,recentlyViewedPlaceName,recentlyViewedPlaceImage));

    }
}
