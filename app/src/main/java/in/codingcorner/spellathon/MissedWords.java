package in.codingcorner.spellathon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Avinash on 19-01-2015.
 */
public class MissedWords extends Activity {

    WordsList w = new WordsList();
    LinearLayout myLayout;
    int counter = 0;
    ArrayList<TextView> myTextViewList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.missedwords);

        myLayout = (LinearLayout) findViewById(R.id.tvMissed);
        myTextViewList = new ArrayList<>();

        for (int i = 0; i < myLayout.getChildCount(); i++)
            if (myLayout.getChildAt(i) instanceof TextView)
                myTextViewList.add((TextView) myLayout.getChildAt(i));


        Intent iin = getIntent();
        Bundle b = iin.getExtras();


        if (b != null) {

            int passed_set = (int) b.get("setaa");

            if (passed_set == 1) {
                for (int i = 0; i < 19; i++) {
                    String set1 = w.set1.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 2) {
                for (int i = 0; i < 20; i++) {
                    String set1 = w.set2.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 3) {
                for (int i = 0; i < 21; i++) {
                    String set1 = w.set3.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 4) {
                for (int i = 0; i < 17; i++) {
                    String set1 = w.set4.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 5) {
                for (int i = 0; i < 14; i++) {
                    String set1 = w.set5.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 6) {
                for (int i = 0; i < 10; i++) {
                    String set1 = w.set6.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 7) {
                for (int i = 0; i < 5; i++) {
                    String set1 = w.set7.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 8) {
                for (int i = 0; i < 11; i++) {
                    String set1 = w.set8.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 9) {
                for (int i = 0; i < 4; i++) {
                    String set1 = w.set9.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 10) {
                for (int i = 0; i < 27; i++) {
                    String set1 = w.set10.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 11) {
                for (int i = 0; i < 11; i++) {
                    String set1 = w.set11.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 12) {
                for (int i = 0; i < 20; i++) {
                    String set1 = w.set12.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 13) {
                for (int i = 0; i < 24; i++) {
                    String set1 = w.set13.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 14) {
                for (int i = 0; i < 24; i++) {
                    String set1 = w.set14.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 15) {
                for (int i = 0; i < 11; i++) {
                    String set1 = w.set15.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 16) {
                for (int i = 0; i < 3; i++) {
                    String set1 = w.set16.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 17) {
                for (int i = 0; i < 6; i++) {
                    String set1 = w.set17.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 18) {
                for (int i = 0; i < 12; i++) {
                    String set1 = w.set18.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 19) {
                for (int i = 0; i < 4; i++) {
                    String set1 = w.set19.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 20) {
                for (int i = 0; i < 4; i++) {
                    String set1 = w.set20.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 21) {
                for (int i = 0; i < 23; i++) {
                    String set1 = w.set21.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 22) {
                for (int i = 0; i < 12; i++) {
                    String set1 = w.set22.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 23) {
                for (int i = 0; i < 12; i++) {
                    String set1 = w.set23.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 24) {
                for (int i = 0; i < 8; i++) {
                    String set1 = w.set24.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 25) {
                for (int i = 0; i < 7; i++) {
                    String set1 = w.set25.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 26) {
                for (int i = 0; i < 7; i++) {
                    String set1 = w.set26.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 27) {
                for (int i = 0; i < 11; i++) {
                    String set1 = w.set27.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 28) {
                for (int i = 0; i < 16; i++) {
                    String set1 = w.set28.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 29) {
                for (int i = 0; i < 26; i++) {
                    String set1 = w.set29.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 30) {
                for (int i = 0; i < 3; i++) {
                    String set1 = w.set30.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 31) {
                for (int i = 0; i < 6; i++) {
                    String set1 = w.set31.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 32) {
                for (int i = 0; i < 23; i++) {
                    String set1 = w.set32.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 33) {
                for (int i = 0; i < 7; i++) {
                    String set1 = w.set33.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 34) {
                for (int i = 0; i < 8; i++) {
                    String set1 = w.set34.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 35) {
                for (int i = 0; i < 26; i++) {
                    String set1 = w.set35.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 36) {
                for (int i = 0; i < 16; i++) {
                    String set1 = w.set36.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 37) {
                for (int i = 0; i < 4; i++) {
                    String set1 = w.set37.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 38) {
                for (int i = 0; i < 10; i++) {
                    String set1 = w.set38.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 39) {
                for (int i = 0; i < 17; i++) {
                    String set1 = w.set39.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 40) {
                for (int i = 0; i < 4; i++) {
                    String set1 = w.set40.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 41) {
                for (int i = 0; i < 11; i++) {
                    String set1 = w.set41.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 42) {
                for (int i = 0; i < 6; i++) {
                    String set1 = w.set42.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 43) {
                for (int i = 0; i < 4; i++) {
                    String set1 = w.set43.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 44) {
                for (int i = 0; i < 19; i++) {
                    String set1 = w.set44.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 45) {
                for (int i = 0; i < 12; i++) {
                    String set1 = w.set45.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 46) {
                for (int i = 0; i < 6; i++) {
                    String set1 = w.set46.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 47) {
                for (int i = 0; i < 24; i++) {
                    String set1 = w.set47.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 48) {
                for (int i = 0; i < 7; i++) {
                    String set1 = w.set48.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 49) {
                for (int i = 0; i < 8; i++) {
                    String set1 = w.set49.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            } else if (passed_set == 0) {
                for (int i = 0; i < 14; i++) {
                    String set1 = w.set50.get(i);
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(set1);
                    counter++;
                }
            }


        }
    }
}


    
    
    
    
    