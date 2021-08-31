package com.example.android.aapkaeklautatouristguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListOfPlacesNearYouActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_grid);

        FloatingActionButton sideBarButton;
//        sideBarButton = findViewById(R.id.sidebar);
        // Creating a list of tourist attractions in Mumbai
        String[] touristPlaceNames = {"Gateway of India","Sanjay Gandhi National Park","Haji Ali Dargah",
                "Elephanta Caves","Siddhivinayak Temple","Chhatrapati Shivaji Terminus (CST)","ISKCON Temple",
                "Shri Mahalakshmi Temple","Powai Lake,","Kidzania","EsselWorld","Juhu Beach","Marine Drive",
                "Chota Kashmir","Worli Sea Face","Hanging Gardens","Madh Island",
                "Bandra-Worli Sea Link","Colaba Causeway","Mumbai Film City","Snow World"};

        String[] touristPlaceDescriptions = {"Gateway of India, the best place to visit in Mumbai, " +
                "Located next to the iconic Taj Mahal Palace and facing the vast Arabian Sea, the " +
                "Gateway of India leaves you spellbound in every way possible.", "Sprawling over an " +
                "area of 104 sq. km. of land, this is one of the most-visited national parks in Asia " +
                "and because of this, I give it the 2nd spot among all the best places to visit in Mumbai. " +
                "With all sorts of fun activities, this park can surely be a family entertainer.", "" +
                "Haji Ali Dargah, one of the most popular religious shrines in Mumbai, is built right " +
                "in the middle of the Arabian Sea. This grand edifice is made of white marbles and exemplifies " +
                "the Indo-Islamic style of architecture. A walk through the causeway that connects the " +
                "Dargah to the Lala Rajput Rai Marg is the main attraction of this place.", "" +
                "Take a tour to this UNESCO World Heritage Site in Mumbai and get wonderstruck by " +
                "the massive rock-cut caves that date back to several centuries. It has five caves " +
                "dedicated to Hindu god Shiva and two caves depicting Buddhist architectures.", "" +
                "One of the most frequented temples in Mumbai, the Siddhivinayak Temple is dedicated " +
                "to Lord Ganesh. Devotees from across India including famous personalities from " +
                "Bollywood and sports throng the temple to seek the blessings of Siddhivinayak Ganapati.", "" +
                "Chatrapati Shivaji Terminus is a UNESCO World Heritage Site " +
                "situated right in the heart of Mumbai. While you are here, don’t forget to take a photograph" +
                "with your family and kids. And guess what, the magnificent CST is the most photographed" +
                "building in India after Taj Mahal!", "Also known as Sri Sri Radha Rasabihari ji Temple, " +
                "it is close to Juhu Beach and boasts 4 acres of land area. The gorgeously carved temple " +
                "draws Hindu devotees in droves and hosts festivals like Ratha Yatra, Janmashtami, " +
                "Radhasthami, Makarsankranti, and Gaura Purnima with great pomp and show.", "" +
                "Built in 1831 by a Hindu merchant named Dhakji Dadaji, this beautiful temple attracts " +
                "numerous devotees daily, and more so on Diwali and Navaratra. On these two occasions, " +
                "Shri Mahalakshmi is believed to come alive and grant the wishes of her worshippers", "" +
                "The beautiful and artificial Powai Lake is 12m deep and spread over 6.6 km. " +
                "IIT Bombay is situated to the lake’s east and adds extra sparkle to it. Nature " +
                "enthusiasts flock to this lake for its pretty pink-purple Balsam bushes and the wide " +
                "variety of birds that you can see here",
                "Kidzania is an indoor amusement park made exclusively for kids with a unique concept " +
                "of role-playing in a real city-like environment. Here, kids are required to perform a " +
                "‘job’ as a part of their role-playing. After successful completion of the job, " +
                "they get paid in the form of kidzos money as an encouragement.", "Looking for adventure " +
                "and thrill in the heart of bustling Mumbai? You can head to EsselWorld to have fun with" +
                " the whole family. A wide array of vibrant and exciting rides await at this famous " +
                "amusement park, to give you the adrenaline rush you want while shooting up in the " +
                "air or plunging into cold water.", "Nothing can be more romantic than watching the " +
                "crimson sun and the luminous orange sky on a breezy beach, with your loved one. " +
                "Juhu Beach is one such spectacular place in Mumbai, often visited by couples who " +
                "need a little romantic escape from the humdrum of city life.", "Walk hand in hand " +
                "with your lover along the walkway at Marine Drive witnessing the sunset hues reflecting " +
                "on the vast Arabian Sea. It is an ideal place to relax and spend some romantic moments " +
                "on a beautiful evening. This is also one of the popular places to visit in Mumbai at night.", "" +
                "If you are in search of a peaceful yet serene place to cherish some intimate moments " +
                "with your partner, Chota Kashmir should be the right spot while you are in Mumbai. " +
                "It has a beautifully landscaped garden and a placid lake that tranquillizes your " +
                "body and mind", "Worli Sea Face, undoubtedly, is one of the favorite hangout spots " +
                "for couples, where they can walk along the long stretched promenade in the evening or " +
                "late night hours with a splendid view of the sea in the background.", "Every relationship " +
                "deserves a break from monotonous daily routines. Take your significant other to this " +
                "amazing Hanging Garden and unwind and slacken yourself amidst the flower beds, " +
                "spectacular water fountains, and lush green animal shaped hedges.", "Are you looking " +
                "for places to roam in Mumbai that will give you a break from your busy city life? " +
                "Connect with rustic farmlands and charming fishing villages at Madh Island. Dotted " +
                "with serene beaches like Aksa, Silver, Erangel and Dana Pani, Madh Island has a " +
                "modest Portuguese fort as well", "A magnificent example of modern architecture, " +
                "the Bandra-Worli Sea Link is a cable-stayed bridge that features viaducts made of " +
                "pre-stressed concrete and steel on either side. It can support a total of 8 lanes " +
                "of traffic (to and fro) and is a staggering 5.6 km in length.", "With shops after " +
                "shops piled up with goodies, you are sure to have a great time shopping everything at " +
                "Colaba Causeway from inexpensive clothes to sophisticated designer wears, home décor " +
                "items to jewelry, and everything in between.", "Sprawling over approximately " +
                "100,000 sq. ft. area, the Dadasaheb Phalke Chitranagari also known as Mumbai Film City " +
                "is a world of wonders where you can see theaters, gardens, lakes, recording rooms, " +
                "and grounds that are leased out for Bollywood film shootings.", "Now, you can experience -10° C " +
                "temperature in Mumbai with some frolicsome activities at Snow world, another great " +
                "place to have serious fun with your friends. Feel the natural snowfall, " +
                "slide through the ice in a rubber tube, play snowball wars with your buddies and " +
                "many more fun filled activities"};

        int[] touristPlaceImages = {R.drawable.gateway_of_india, R.drawable.sgnp, R.drawable.haji_ali,
                R.drawable.elephanta_caves, R.drawable.siddhivinayak_mandir, R.drawable.chhatrapati_shivaji_terminus,
                R.drawable.iskcon_temple, R.drawable.mahalakhmi_mandir, R.drawable.powai_lake, R.drawable.kidzania,
                R.drawable.essel_world, R.drawable.juhu_beach, R.drawable.marine_drive, R.drawable.chota_kashmir,
                R.drawable.worli_sea_face, R.drawable.hanging_gardens, R.drawable.madh_island_beach,
                R.drawable.worli_sea_link, R.drawable.colaba_causeway, R.drawable.film_city, R.drawable.snow_world};

        String[] touristPlaceLocation = {"Colaba, Mumbai", "Borivali East, Mumbai","Dargah Road, Mumbai",
                "Gharapuri, Mumbai","Prabhadevi, Mumbai","Chhatrapati Shivaji Terminus Area, Mumbai",
                "Hare Krishna Land, Juhu, Mumbai","Mahalaxmi West, Cumballa Hill, Mumbai",
                "Powai Valley, Mumbai","Ghatkopar West, Mumbai","Borivali West, Mumbai","Juhu Tara Road, Mumbai",
                "Chowpatty, Mumbai","Goregaon, Mumbai","Worli, Mumbai","Malabar Hill, Mumbai","north-western coast of Mumbai",
                "Koliwada, Worli, Mumbai","Collaba Causeway, Mumbai","Goregaon East, Mumbai","Phoenix Market City, Mumbai"};

        String[] touristPlaceTimings = {"Jab aapki marzi kare", "07:30 am to 06:30 pm","05:30 am to 10:00 pm",
                "9:00 am to 5:30 pm","05:30 am to 10:00 pm","Jab aapki marzi kare","08:00 am to 09:00 pm",
                "06:00 am to 10:00 pm","06:00 am to 10:00 am","10:00 am to 08:00 pm","10:00 am to 06:30 pm",
                "Jab aapki marzi kare","Jab aapki marzi kare","10:00 am to 06:00 pm","Jab aapki marzi kare",
                "05:00 am to 09:00 pm","Jab aapki marzi kare","Jab aapki marzi kare","Jab aapki marzi kare",
                "10:00 am to 05:00 pm","11:00 am to 10:00 pm"};

        String[] touristPlaceEntryFee = {"Free entry", "₹28 - ₹53 per person","Free entry","₹10 per person",
                "Free entry","Free entry","Free entry","Free entry","Free entry","₹300 - ₹1500","₹300 - ₹1600",
                "Free entry","Free entry","Free entry","Free entry","Free entry","Free entry",
                "₹70 - ₹145 Toll Charges","Free entry","Tours starting at ₹599","₹575 per person"};

//        sideBarButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(CardGridViewActivity.this, SideBarActivity.class);
//                startActivity(intent);
//            }
//        });

        CardGridAdapter touristPlacesAdapter = new CardGridAdapter(this, touristPlaceNames, touristPlaceImages);
        GridView gridView = (GridView) findViewById(R.id.grid);
        gridView.setAdapter(touristPlacesAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListOfPlacesNearYouActivity.this, "Taking you to " + touristPlaceNames[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ListOfPlacesNearYouActivity.this, DescriptionActivity.class);
                intent.putExtra("nameOfPlace",touristPlaceNames[position]);
                intent.putExtra("descriptionOfPlace", touristPlaceDescriptions[position]);
                intent.putExtra("locationOfPlace", touristPlaceLocation[position]);
                intent.putExtra("timingsOfPlace", touristPlaceTimings[position]);
                intent.putExtra("entryFeeOfPlace", touristPlaceEntryFee[position]);
                startActivity(intent);
            }
        });

    }
}
