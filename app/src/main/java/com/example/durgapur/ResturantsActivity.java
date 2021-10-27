package com.example.durgapur;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ResturantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> resturantsWord = new ArrayList<>();

        resturantsWord.add(new Word("Barbeque Nation", "First floor Pushpanjali, Plot No. C-71/A, Shahid Khudiram Sarani, City Center, Durgapur, West Bengal 713216.", R.mipmap.ic_bbq_nation));
        resturantsWord.add(new Word("Lemon Grass", "6/13 Suhatta mall,city centre, Durgapur, West Bengal 713216.", R.mipmap.ic_lemon_grass));
        resturantsWord.add(new Word("Sizzling Glass", "Non-Company Housing Estate, City Center, Durgapur, West Bengal 713216", R.mipmap.ic_sizzling_glass));
        resturantsWord.add(new Word("Theque", "Non-Company Housing Estate, City Center, Durgapur, West Bengal 713216", R.mipmap.ic_theque));
        resturantsWord.add(new Word("Hotel Kohinoor", "Kohinoor Complex, Nachan Road, Benachity, Durgapur, West Bengal - 713213.", R.mipmap.ic_hotel_kohinoor));
        resturantsWord.add(new Word("McDonald's", "Lower Ground Floor, Junction Mall, Grand Trunk Rd, City Center, Durgapur, West Bengal 713216", R.mipmap.ic_mc_donalds));
        resturantsWord.add(new Word("Food Junction", "Sunity Chatterjee Path 3rd St, Non-Company Housing Estate, City Center, Durgapur, West Bengal 713216", R.mipmap.ic_food_junction));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, resturantsWord, R.color.category_resturants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}
