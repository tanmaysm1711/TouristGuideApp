package com.example.android.aapkaeklautatouristguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class CategoryFragment extends Fragment {

    View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_category, container, false);

        RecyclerView subCategoryList = (RecyclerView) rootView.findViewById(R.id.sub_category);
        RecyclerView featuredLocList = (RecyclerView) rootView.findViewById(R.id.featured_loc_list);
        RecyclerView yourFavouritePlaceList = (RecyclerView) rootView.findViewById(R.id.your_favourite_place_list);
        RecyclerView recentlyViewedList = (RecyclerView) rootView.findViewById(R.id.recently_viewed_list);

        LinearLayoutManager subCategoryLinearLayoutManager = new LinearLayoutManager((MainActivity) getActivity(), LinearLayoutManager.HORIZONTAL, false);
        subCategoryList.setLayoutManager(subCategoryLinearLayoutManager);
        subCategoryList.setAdapter(new SubCategoryAdapter((MainActivity) getActivity(), subCategoryName, subCategoryImage));

        LinearLayoutManager featuredLocLayoutManager = new LinearLayoutManager((MainActivity) getActivity(), LinearLayoutManager.HORIZONTAL, false);
        featuredLocList.setLayoutManager(featuredLocLayoutManager);
        featuredLocList.setAdapter(new FeaturedLocAdapter((MainActivity) getActivity(), featuredLocationName, featuredLocationImage));

        LinearLayoutManager yourFavouritePlaceLayoutManager = new LinearLayoutManager((MainActivity) getActivity(), LinearLayoutManager.HORIZONTAL, false);
        yourFavouritePlaceList.setLayoutManager(yourFavouritePlaceLayoutManager);
        yourFavouritePlaceList.setAdapter(new YourFavouritePlaceAdapter((MainActivity) getActivity(), yourFavouritePlaceName, yourFavouritePlaceImage));

        LinearLayoutManager recentlyViewedLinearLayoutManager = new LinearLayoutManager((MainActivity) getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recentlyViewedList.setLayoutManager(recentlyViewedLinearLayoutManager);
        recentlyViewedList.setAdapter(new RecentlyViewedAdapter((MainActivity) getActivity(), recentlyViewedPlaceName, recentlyViewedPlaceImage));

        return rootView;
    }

    public String[] subCategoryName = {" Beach", "Mountain", "Monument", "Temple", "Waterfall", "Market",
            "Gardens", "Amusement Parks", "Wildlife", "Malls", "snow"};
    public int[] subCategoryImage = {R.drawable.beach, R.drawable.mountains, R.drawable.monuments,
            R.drawable.temple, R.drawable.waterfall, R.drawable.market, R.drawable.garden,
            R.drawable.amusement_park, R.drawable.wildlife, R.drawable.mall, R.drawable.snow};


    public String[] featuredLocationName = {"Gateway of India", "Sanjay Gandhi National Park", "Haji Ali Dargah",
            "Elephanta Caves", "Siddhivinayak Temple", "Chhatrapati Shivaji Terminus (CST)", "ISKCON Temple",
            "Shri Mahalakshmi Temple", "Powai Lake,", "Kidzania", "EsselWorld"};
    public int[] featuredLocationImage = {R.drawable.gateway_of_india, R.drawable.sgnp, R.drawable.haji_ali,
            R.drawable.elephanta_caves, R.drawable.siddhivinayak_mandir, R.drawable.chhatrapati_shivaji_terminus
            , R.drawable.iskcon_temple, R.drawable.mahalakhmi_mandir, R.drawable.powai_lake, R.drawable.kidzania
            , R.drawable.essel_world};


    public String[] yourFavouritePlaceName = {
            "EsselWorld", "Juhu Beach", "Marine Drive",
            "Chota Kashmir", "Worli Sea Face", "Hanging Gardens", "Madh Island",
            "Bandra-Worli Sea Link", "Colaba Causeway", "Mumbai Film City", "Snow World"};
    public int[] yourFavouritePlaceImage = {R.drawable.essel_world, R.drawable.juhu_beach, R.drawable.marine_drive
            , R.drawable.chota_kashmir, R.drawable.worli_sea_face, R.drawable.hanging_gardens, R.drawable.madh_island_beach
            , R.drawable.worli_sea_face, R.drawable.colaba_causeway, R.drawable.film_city, R.drawable.snow_world};


    String[] recentlyViewedPlaceName = {
            "EsselWorld", "Juhu Beach", "Marine Drive",
            "Chota Kashmir", "Worli Sea Face", "Hanging Gardens", "Madh Island",
            "Bandra-Worli Sea Link", "Colaba Causeway", "Mumbai Film City", "Snow World"};
    int[] recentlyViewedPlaceImage = {R.drawable.essel_world, R.drawable.juhu_beach, R.drawable.marine_drive
            , R.drawable.chota_kashmir, R.drawable.worli_sea_face, R.drawable.hanging_gardens, R.drawable.madh_island_beach
            , R.drawable.worli_sea_face, R.drawable.colaba_causeway, R.drawable.film_city, R.drawable.snow_world};
}


