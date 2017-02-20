package com.example.user.recyclerviewcardview;

import java.util.ArrayList;

/**
 * Created by User on 12/15/2016.
 */

public class Data {

    public static ArrayList<Information> getData() {

        ArrayList<Information> data = new ArrayList<Information>();

        Integer images[] = {R.drawable.ani_cat_one,
                R.drawable.ani_cat_two,
                R.drawable.ani_cat_three,
                R.drawable.ani_cat_four,
                R.drawable.ani_cat_five,
                R.drawable.ani_cat_six,
                R.drawable.ani_cat_seven,

                R.drawable.ani_deer_one,
                R.drawable.ani_deer_two,
                R.drawable.ani_deer_three,
                R.drawable.ani_deer_four,

                R.drawable.ani_dog_one,
                R.drawable.ani_dog_two,
                R.drawable.ani_dog_three,
                R.drawable.ani_dog_four,
                R.drawable.ani_dog_five,

                R.drawable.bird_parrot_one,
                R.drawable.bird_parrot_two,
                R.drawable.bird_parrot_three,
                R.drawable.bird_parrot_four,
                R.drawable.bird_parrot_five,
                R.drawable.bird_parrot_six,
                R.drawable.bird_parrot_seven,
                R.drawable.bird_parrot_eight
        };

        String categories[] = {"Cat 1",
                "Cat 2",
                "Cat 3",
                "Cat 4",
                "Cat 5",
                "Cat 6",
                "Cat 7",

                "Deer 1",
                "Deer 2",
                "Deer 3",
                "Deer 4",

                "Dog 1",
                "Dog 2",
                "Dog 3",
                "Dog 4",
                "Dog 5",

                "Bird 1",
                "Bird 2",
                "Bird 3",
                "Bird 4",
                "Bird 5",
                "Bird 6",
                "Bird 7",
                "Bird 8",
        };

        for (int i = 0; i < images.length; i++) {
            data.add(new Information(images[i], categories[i]));
        }
        return data;
    }
}
