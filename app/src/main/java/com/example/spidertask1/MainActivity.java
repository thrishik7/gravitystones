package com.example.spidertask1;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView stone1 ;
    private ImageView stone2 ;
    private ImageView stone3 ;
    private ImageView stone4 ;
    private ImageView stone5 ;
    private ImageView stone6 ;
    int a=0;
    long animationDuration1= 1000;
    long animationDuration2= 1500;
    long animationDuration3= 1800;
    long animationDuration4= 2000;
    long animationDuration5= 1500;
    long animationDuration6= 1000;



    private RelativeLayout myLayout =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       myLayout= (RelativeLayout)findViewById(R.id.myLayout);

       stone1= (ImageView)findViewById(R.id .stone1);
        stone2= (ImageView)findViewById(R.id .stone2);
        stone3= (ImageView)findViewById(R.id .stone3);
        stone4= (ImageView)findViewById(R.id .stone4);
        stone5= (ImageView)findViewById(R.id .stone5);
        stone6= (ImageView)findViewById(R.id .stone6);

       myLayout.setOnTouchListener(new View.OnTouchListener() {


           public boolean onTouch(View v, MotionEvent event) {

               if(a%2==0) {
                   handleAnimation(v);

               }
               else
                   {
                   handleAnimation1(v);
               }
               a++;
               return false
                       ;

           }
       });
    }
    public void handleAnimation(View view){


        ObjectAnimator animator1Y= ObjectAnimator.ofFloat(stone1, "y", 159f);
        ObjectAnimator animator11Y= ObjectAnimator.ofFloat(stone1, "rotation", 360);

        ObjectAnimator animator2Y= ObjectAnimator.ofFloat(stone2, "y", 150f);
        ObjectAnimator animator21Y= ObjectAnimator.ofFloat(stone2, "rotation", 180);
        ObjectAnimator animator3Y= ObjectAnimator.ofFloat(stone3, "y", 150f);
        ObjectAnimator animator31Y= ObjectAnimator.ofFloat(stone3, "rotation", 270);
        ObjectAnimator animator4Y= ObjectAnimator.ofFloat(stone4, "y", 150f);
        ObjectAnimator animator41Y= ObjectAnimator.ofFloat(stone4, "rotation", 180);
        ObjectAnimator animator5Y= ObjectAnimator.ofFloat(stone5, "y", 150f);
        ObjectAnimator animator51Y= ObjectAnimator.ofFloat(stone5, "rotation", 90);
        ObjectAnimator animator6Y= ObjectAnimator.ofFloat(stone6, "y", 150f);
        ObjectAnimator animator61Y= ObjectAnimator.ofFloat(stone6, "rotation", 360);





        animator1Y.setDuration(animationDuration1);animator11Y.setDuration(animationDuration1);
        animator2Y.setDuration(animationDuration2);animator21Y.setDuration(animationDuration1);
        animator3Y.setDuration(animationDuration3);animator31Y.setDuration(animationDuration1);
        animator4Y.setDuration(animationDuration4);animator41Y.setDuration(animationDuration1);
        animator5Y.setDuration(animationDuration5);animator51Y.setDuration(animationDuration1);
        animator6Y.setDuration(animationDuration6);animator61Y.setDuration(animationDuration1);
        AnimatorSet animatorSet= new AnimatorSet();
        animatorSet.playTogether(animator1Y);  animatorSet.playTogether(animator11Y);
        animatorSet.playTogether(animator2Y);animatorSet.playTogether(animator21Y);
        animatorSet.playTogether(animator3Y);animatorSet.playTogether(animator31Y);
        animatorSet.playTogether(animator4Y);animatorSet.playTogether(animator41Y);
        animatorSet.playTogether(animator5Y);animatorSet.playTogether(animator51Y);
        animatorSet.playTogether(animator6Y);animatorSet.playTogether(animator61Y);
        animatorSet.start();

    }
    public void handleAnimation1(View view){


        ObjectAnimator animator1Y= ObjectAnimator.ofFloat(stone1, "y", 1500f);
        ObjectAnimator animator11Y= ObjectAnimator.ofFloat(stone1, "rotation", 270);

        ObjectAnimator animator2Y= ObjectAnimator.ofFloat(stone2, "y", 1500f);
        ObjectAnimator animator21Y= ObjectAnimator.ofFloat(stone2, "rotation", 360);
        ObjectAnimator animator3Y= ObjectAnimator.ofFloat(stone3, "y", 1500f);
        ObjectAnimator animator31Y= ObjectAnimator.ofFloat(stone3, "rotation", 180);
        ObjectAnimator animator4Y= ObjectAnimator.ofFloat(stone4, "y", 1500f);
        ObjectAnimator animator41Y= ObjectAnimator.ofFloat(stone4, "rotation", 360);
        ObjectAnimator animator5Y= ObjectAnimator.ofFloat(stone5, "y", 1500f);
        ObjectAnimator animator51Y= ObjectAnimator.ofFloat(stone5, "rotation", 180);
        ObjectAnimator animator6Y= ObjectAnimator.ofFloat(stone6, "y", 1500f);
        ObjectAnimator animator61Y= ObjectAnimator.ofFloat(stone6, "rotation", 90);





        animator1Y.setDuration(animationDuration1);animator11Y.setDuration(animationDuration1);
        animator2Y.setDuration(animationDuration2);animator21Y.setDuration(animationDuration1);
        animator3Y.setDuration(animationDuration3);animator31Y.setDuration(animationDuration1);
        animator4Y.setDuration(animationDuration4);animator41Y.setDuration(animationDuration1);
        animator5Y.setDuration(animationDuration5);animator51Y.setDuration(animationDuration1);
        animator6Y.setDuration(animationDuration6);animator61Y.setDuration(animationDuration1);
        AnimatorSet animatorSet= new AnimatorSet();
        animatorSet.playTogether(animator1Y);  animatorSet.playTogether(animator11Y);
        animatorSet.playTogether(animator2Y);animatorSet.playTogether(animator21Y);
        animatorSet.playTogether(animator3Y);animatorSet.playTogether(animator31Y);
        animatorSet.playTogether(animator4Y);animatorSet.playTogether(animator41Y);
        animatorSet.playTogether(animator5Y);animatorSet.playTogether(animator51Y);
        animatorSet.playTogether(animator6Y);animatorSet.playTogether(animator61Y);
        animatorSet.start();

    }


}
