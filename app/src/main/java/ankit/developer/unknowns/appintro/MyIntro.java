package ankit.developer.unknowns.appintro;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by ankitsharma on 4/21/2017.
 */

public class MyIntro extends AppIntro {
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);



    addSlide(AppIntroFragment.newInstance("EDMTDev",

             "Coffe",

             R.drawable.ic_arrow_back_white,

             Color.parseColor("#51e2b7")));



    addSlide(AppIntroFragment.newInstance("EDMTDev",

             "Snack French Fries",

             R.drawable.ic_arrow_forward_white,

             Color.parseColor("#8c50e3")));



    addSlide(AppIntroFragment.newInstance("EDMTDev",

             "Cup Cake",

             R.drawable.ic_done_white,

             Color.parseColor("#4fd7ff")));



    addSlide(AppIntroFragment.newInstance("EDMTDev",

             "Snack Burger",

             R.drawable.ic_navigate_before_white,

             Color.parseColor("#00bcd4")));



    showStatusBar(false);

    setBarColor(Color.parseColor("#333639"));

    setSeparatorColor(Color.parseColor("#2196F3"));



}



    @Override

    public void onDonePressed() {

        startActivity(new Intent(this,MainActivity.class));

        finish();

    }



    @Override

    public void onSkipPressed(Fragment currentFragment) {

        Toast.makeText(this, "On Skip Clicked", Toast.LENGTH_SHORT).show();

    }



    @Override

    public void onSlideChanged() {

        Toast.makeText(this, "On Slide Changed", Toast.LENGTH_SHORT).show();

    }
}
