package in.codingcorner.spellathon;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;


public class MainActivity extends Activity implements OnClickListener {

    Button b1, b2, b3, b4, b5, b6, b7, submit, back, howtoPlay, giveUp;
    TextView score;
    EditText res;
    int randomInt;
    LinearLayout myLayout;
    ArrayList<TextView> myTextViewList;
    WordsList w = new WordsList();
    int counter = 0;
    BufferedReader reader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Initialize();
        gameLogic();
    }

    private void gameLogic() {
        Random r = new Random();
        Set<Character> mySet = new <Character>HashSet();
        while (mySet.size() != 7) {
            char c = (char) (r.nextInt(26) + 'a');
            mySet.add(c);
        }

        Iterator iter = mySet.iterator();
        while (iter.hasNext()) {

            b1.setText(iter.next().toString());
            b2.setText(iter.next().toString());
            b3.setText(iter.next().toString());
            b4.setText(iter.next().toString());
            b5.setText(iter.next().toString());
            b6.setText(iter.next().toString());
            b7.setText(iter.next().toString());
        }
    }
   /* private void gameLogic() {
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(50);

        switch (randomInt) {


            case 1:
                score.setText(" 0 /  19");
                b1.setText("d");
                b2.setText("a");
                b3.setText("i");
                b4.setText("s");
                b5.setText("a");
                b6.setText("e");
                b7.setText("n");
                break;
            case 2:
                score.setText(" 0 /  20");
                b1.setText("f");
                b2.setText("r");
                b3.setText("d");
                b4.setText("e");
                b5.setText("l");
                b6.setText("o");
                b7.setText("o");
                break;
            case 3:
                score.setText(" 0 /  21");
                b1.setText("u");
                b2.setText("a");
                b3.setText("d");
                b4.setText("m");
                b5.setText("l");
                b6.setText("l");
                b7.setText("e");
                break;
            case 4:
                score.setText(" 0 /  17");
                b1.setText("r");
                b2.setText("e");
                b3.setText("d");
                b4.setText("i");
                b5.setText("v");
                b6.setText("v");
                b7.setText("e");
                break;
            case 5:
                score.setText(" 0 /  14");
                b1.setText("v");
                b2.setText("r");
                b3.setText("e");
                b4.setText("e");
                b5.setText("l");
                b6.setText("i");
                b7.setText("e");

                break;
            case 6:
                score.setText(" 0 /  10");
                b1.setText("a");
                b2.setText("m");
                b3.setText("e");
                b4.setText("a");
                b5.setText("i");
                b6.setText("n");
                b7.setText("a");
                break;
            case 7:
                score.setText(" 0 /  5");
                b1.setText("a");
                b2.setText("u");
                b3.setText("e");
                b4.setText("v");
                b5.setText("y");
                b6.setText("r");
                b7.setText("q");
                break;
            case 8:
                score.setText(" 0 /  11");
                b1.setText("r");
                b2.setText("e");
                b3.setText("e");
                b4.setText("r");
                b5.setText("v");
                b6.setText("e");
                b7.setText("s");
                break;
            case 9:
                score.setText(" 0 /  4");
                b1.setText("l");
                b2.setText("d");
                b3.setText("m");
                b4.setText("l");
                b5.setText("r");
                b6.setText("a");
                b7.setText("a");
                break;
            case 10:
                score.setText(" 0 /  27");
                b1.setText("s");
                b2.setText("d");
                b3.setText("r");
                b4.setText("r");
                b5.setText("e");
                b6.setText("a");
                b7.setText("t");
                break;
            case 11:
                score.setText(" 0 /  11");
                b1.setText("r");
                b2.setText("k");
                b3.setText("a");
                b4.setText("l");
                b5.setText("s");
                b6.setText("e");
                b7.setText("p");
                break;
            case 12:
                score.setText(" 0 /  20");
                b1.setText("u");
                b2.setText("r");
                b3.setText("e");
                b4.setText("s");
                b5.setText("a");
                b6.setText("f");
                b7.setText("l");
                break;
            case 13:
                score.setText(" 0 /  24");
                b1.setText("m");
                b2.setText("a");
                b3.setText("r");
                b4.setText("s");
                b5.setText("t");
                b6.setText("n");
                b7.setText("o");
                break;
            case 14:
                score.setText(" 0 /  24");
                b1.setText("a");
                b2.setText("d");
                b3.setText("n");
                b4.setText("g");
                b5.setText("r");
                b6.setText("e");
                b7.setText("e");
                break;
            case 15:
                score.setText(" 0 /  11");
                b1.setText("n");
                b2.setText("r");
                b3.setText("s");
                b4.setText("o");
                b5.setText("f");
                b6.setText("a");
                b7.setText("i");
                break;
            case 16:
                score.setText(" 0 /  3");
                b1.setText("n");
                b2.setText("v");
                b3.setText("i");
                b4.setText("m");
                b5.setText("d");
                b6.setText("f");
                b7.setText("l");
                break;
            case 17:
                score.setText(" 0 /  6");
                b1.setText("a");
                b2.setText("e");
                b3.setText("e");
                b4.setText("e");
                b5.setText("c");
                b6.setText("s");
                b7.setText("d");
                break;
            case 18:
                score.setText(" 0 /  12");
                b1.setText("a");
                b2.setText("v");
                b3.setText("s");
                b4.setText("g");
                b5.setText("e");
                b6.setText("e");
                b7.setText("l");
                break;
            case 19:
                score.setText(" 0 /  4");
                b1.setText("y");
                b2.setText("u");
                b3.setText("v");
                b4.setText("l");
                b5.setText("b");
                b6.setText("l");
                b7.setText("o");
                break;

            case 20:
                score.setText(" 0 /  4");
                b1.setText("q");
                b2.setText("y");
                b3.setText("b");
                b4.setText("o");
                b5.setText("e");
                b6.setText("u");
                b7.setText("s");
                break;
            case 21:
                score.setText(" 0 /  23");
                b1.setText("r");
                b2.setText("t");
                b3.setText("d");
                b4.setText("p");
                b5.setText("e");
                b6.setText("e");
                b7.setText("a");
                break;
            case 22:
                score.setText(" 0 /  12");
                b1.setText("v");
                b2.setText("a");
                b3.setText("r");
                b4.setText("t");
                b5.setText("n");
                b6.setText("i");
                b7.setText("b");
                break;
            case 23:
                score.setText(" 0 /  12");
                b1.setText("r");
                b2.setText("e");
                b3.setText("c");
                b4.setText("r");
                b5.setText("p");
                b6.setText("u");
                b7.setText("o");
                break;
            case 24:
                score.setText(" 0 /  8");
                b1.setText("c");
                b2.setText("i");
                b3.setText("a");
                b4.setText("a");
                b5.setText("r");
                b6.setText("n");
                b7.setText("o");
                break;
            case 25:
                score.setText(" 0 /  7");
                b1.setText("l");
                b2.setText("a");
                b3.setText("c");
                b4.setText("c");
                b5.setText("i");
                b6.setText("d");
                b7.setText("f");
                break;
            case 26:
                score.setText(" 0 /  7");
                b1.setText("i");
                b2.setText("a");
                b3.setText("v");
                b4.setText("l");
                b5.setText("i");
                b6.setText("n");
                b7.setText("l");
                break;
            case 27:
                score.setText(" 0 /  11");
                b1.setText("t");
                b2.setText("i");
                b3.setText("m");
                b4.setText("o");
                b5.setText("x");
                b6.setText("a");
                b7.setText("e");
                break;
            case 28:
                score.setText(" 0 /  16");
                b1.setText("c");
                b2.setText("d");
                b3.setText("m");
                b4.setText("u");
                b5.setText("r");
                b6.setText("b");
                b7.setText("e");
                break;
            case 29:
                score.setText(" 0 /  26");
                b1.setText("w");
                b2.setText("s");
                b3.setText("e");
                b4.setText("p");
                b5.setText("o");
                b6.setText("c");
                b7.setText("h");
                break;
            case 30:
                score.setText(" 0 /  3");
                b1.setText("k");
                b2.setText("j");
                b3.setText("c");
                b4.setText("t");
                b5.setText("a");
                b6.setText("p");
                b7.setText("o");
                break;
            case 31:
                score.setText(" 0 /  6");
                b1.setText("x");
                b2.setText("s");
                b3.setText("e");
                b4.setText("a");
                b5.setText("a");
                b6.setText("l");
                b7.setText("u");
                break;
            case 32:
                score.setText(" 0 /  23");
                b1.setText("s");
                b2.setText("e");
                b3.setText("p");
                b4.setText("s");
                b5.setText("i");
                b6.setText("r");
                b7.setText("t");
                break;
            case 33:
                score.setText(" 0 /  7");
                b1.setText("y");
                b2.setText("l");
                b3.setText("b");
                b4.setText("r");
                b5.setText("i");
                b6.setText("a");
                b7.setText("r");
                break;
            case 34:
                score.setText(" 0 /  8");
                b1.setText("s");
                b2.setText("p");
                b3.setText("a");
                b4.setText("h");
                b5.setText("i");
                b6.setText("k");
                b7.setText("i");
                break;
            case 35:
                score.setText(" 0 /  26");
                b1.setText("n");
                b2.setText("l");
                b3.setText("n");
                b4.setText("e");
                b5.setText("i");
                b6.setText("d");
                b7.setText("s");
                break;
            case 36:
                score.setText(" 0 /  16");
                b1.setText("p");
                b2.setText("c");
                b3.setText("r");
                b4.setText("e");
                b5.setText("e");
                b6.setText("a");
                b7.setText("f");
                break;
            case 37:
                score.setText(" 0 /  4");
                b1.setText("f");
                b2.setText("i");
                b3.setText("c");
                b4.setText("u");
                b5.setText("e");
                b6.setText("s");
                b7.setText("f");
                break;
            case 38:
                score.setText(" 0 /  10");
                b1.setText("d");
                b2.setText("e");
                b3.setText("m");
                b4.setText("e");
                b5.setText("i");
                b6.setText("s");
                b7.setText("d");
                break;
            case 39:
                score.setText(" 0 /  17");
                b1.setText("l");
                b2.setText("m");
                b3.setText("g");
                b4.setText("e");
                b5.setText("e");
                b6.setText("a");
                b7.setText("n");
                break;
            case 40:
                score.setText(" 0 /  4");
                b1.setText("w");
                b2.setText("w");
                b3.setText("d");
                b4.setText("o");
                b5.setText("o");
                b6.setText("l");
                b7.setText("n");
                break;
            case 41:
                score.setText(" 0 /  11");
                b1.setText("t");
                b2.setText("i");
                b3.setText("i");
                b4.setText("e");
                b5.setText("s");
                b6.setText("c");
                b7.setText("d");
                break;
            case 42:
                score.setText(" 0 /  6");
                b1.setText("c");
                b2.setText("y");
                b3.setText("t");
                b4.setText("r");
                b5.setText("e");
                b6.setText("r");
                b7.setText("o");
                break;
            case 43:
                score.setText(" 0 /  4");
                b1.setText("n");
                b2.setText("i");
                b3.setText("t");
                b4.setText("t");
                b5.setText("i");
                b6.setText("y");
                b7.setText("r");
                break;
            case 44:
                score.setText(" 0 /  19");
                b1.setText("l");
                b2.setText("a");
                b3.setText("i");
                b4.setText("e");
                b5.setText("n");
                b6.setText("n");
                b7.setText("m");
                break;
            case 45:
                score.setText(" 0 /  12");
                b1.setText("g");
                b2.setText("n");
                b3.setText("r");
                b4.setText("o");
                b5.setText("w");
                b6.setText("i");
                b7.setText("n");
                break;
            case 46:
                score.setText(" 0 /  6");
                b1.setText("g");
                b2.setText("a");
                b3.setText("i");
                b4.setText("l");
                b5.setText("l");
                b6.setText("a");
                b7.setText("c");
                break;
            case 47:
                score.setText(" 0 /  24");
                b1.setText("d");
                b2.setText("a");
                b3.setText("r");
                b4.setText("e");
                b5.setText("e");
                b6.setText("t");
                b7.setText("f");
                break;
            case 48:
                score.setText(" 0 /  7");
                b1.setText("o");
                b2.setText("d");
                b3.setText("g");
                b4.setText("e");
                b5.setText("s");
                b6.setText("n");
                b7.setText("d");
                break;
            case 49:
                score.setText(" 0 /  8");
                b1.setText("s");
                b2.setText("l");
                b3.setText("a");
                b4.setText("a");
                b5.setText("a");
                b6.setText("g");
                b7.setText("n");
                break;
            case 0:
                score.setText(" 0 /  14");
                b1.setText("r");
                b2.setText("t");
                b3.setText("e");
                b4.setText("a");
                b5.setText("e");
                b6.setText("c");
                b7.setText("f");
                break;


            default:
                break;
        }

    }*/

    private void Initialize() {

        res = (EditText) findViewById(R.id.editText1);
        submit = (Button) findViewById(R.id.submit);
        back = (Button) findViewById(R.id.back);

        score = (TextView) findViewById(R.id.score);
        howtoPlay = (Button) findViewById(R.id.howtoPlay);
        giveUp = (Button) findViewById(R.id.giveUp);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);

        submit.setOnClickListener(this);
        back.setOnClickListener(this);
        giveUp.setOnClickListener(this);
        howtoPlay.setOnClickListener(this);


        myLayout = (LinearLayout) findViewById(R.id.tvLayout);
        myTextViewList = new ArrayList<>();

        for (int i = 0; i < myLayout.getChildCount(); i++)
            if (myLayout.getChildAt(i) instanceof TextView)
                myTextViewList.add((TextView) myLayout.getChildAt(i));

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                res.append(((Button) v).getText().toString());

                break;
            case R.id.button2:
                res.append(((Button) v).getText().toString());

                break;
            case R.id.button3:
                res.append(((Button) v).getText().toString());

                break;
            case R.id.button4:
                res.append(((Button) v).getText().toString());

                break;
            case R.id.button5:
                res.append(((Button) v).getText().toString());

                break;
            case R.id.button6:
                res.append(((Button) v).getText().toString());

                break;
            case R.id.button7:
                res.append(((Button) v).getText().toString());

                break;
            case R.id.submit:

                checkValidOrNot();
                res.setText("");

                break;
            case R.id.back:
                String textString = res.getText().toString();
                if (textString.length() > 0) {
                    res.setText(textString.substring(0, textString.length() - 1));
                }
                break;
            case R.id.howtoPlay:
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setTitle("How To Play");
                alertDialogBuilder
                        .setMessage(R.string.how_to_play)
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                break;
            case R.id.giveUp:


                String scr = "You 've Guessed " + String.valueOf(counter) + " words !";
                Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                ii.putExtra("score", scr);
                ii.putExtra("set", randomInt);
                startActivity(ii);

                break;


            default:
                break;
        }

    }

    public void checkValidOrNot() {
        String ss = (res.getText()).toString();
        String middle = b2.getText().toString();
   /*    if (ss.length() < 4) {
            Toast.makeText(this, "Word Should me minumim of 4 letters !", Toast.LENGTH_SHORT)
                    .show();
        } else if (!ss.contains(middle)) {

            Toast.makeText(this, "Word must contain middle letter !", Toast.LENGTH_SHORT)
                    .show();
        }*/


        try {
            final InputStream file = getAssets().open("words.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(file));
            String line;
            while ((line=reader.readLine()) != null) {


                Toast.makeText(this, line, Toast.LENGTH_SHORT)
                        .show();
                if (ss.equals(line)) {
                    Toast.makeText(this, "Working!", Toast.LENGTH_SHORT)
                            .show();
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(line);
                } else {
                    Toast.makeText(this, "Not found !", Toast.LENGTH_SHORT)
                            .show();

                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

       /* try{
            // Open the file that is the first
            // command line parameter
            FileInputStream fstream = new FileInputStream("words.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
                // Print the content on the console
               // System.out.println (strLine);
                Toast.makeText(this, strLine, Toast.LENGTH_SHORT)
                        .show();
                *//*if(ss == strLine.toLowerCase()){
                    TextView tv = myTextViewList.get(counter);
                    tv.setText(strLine);
                }
                else
                    Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                            .show();*//*

            }
            //Close the input stream
            in.close();
        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }*/

       /* if (randomInt == 1) {


            if (!w.set1.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set1.contains(ss)) {

                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set1.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  19");
                if (counter == 19) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 2) {


            if (ss.length() >= 4 && !w.set2.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }


            if (w.set2.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set2.remove(ss);
                counter++;
                score.setText(String.valueOf(counter) + " /  20");
                if (counter == 20) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }
            }
        }
        if (randomInt == 3) {

            if (!w.set3.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }
            if (w.set3.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set3.remove(ss);
                counter++;
                score.setText(String.valueOf(counter) + " /  21");
                if (counter == 21) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }
            }
        }
        if (randomInt == 4) {
            if (!w.set4.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set4.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set4.remove(ss);
                counter++;
                score.setText(String.valueOf(counter) + " /  17");
                if (counter == 17) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }
            }
        }
        if (randomInt == 5) {
            if (!w.set5.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set5.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set5.remove(ss);
                counter++;
                score.setText(String.valueOf(counter) + " /  14");
                if (counter == 14) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }
            }
        }
        if (randomInt == 6) {

            if (!w.set6.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }
            if (w.set6.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set6.remove(ss);
                counter++;
                score.setText(String.valueOf(counter) + " /  10");
                if (counter == 10) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }
            }
        }
        if (randomInt == 7) {
            if (!w.set7.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set7.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set7.remove(ss);
                counter++;
                score.setText(String.valueOf(counter) + " /  5");
                if (counter == 5) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);

                }
            }
        }
        if (randomInt == 8) {
            if (!w.set8.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set8.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set8.remove(ss);
                counter++;
                score.setText(String.valueOf(counter) + " /  11");
                if (counter == 11) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }
            }
        }
        if (randomInt == 9) {

            if (!w.set9.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }
            if (w.set9.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set9.remove(ss);
                counter++;
                score.setText(String.valueOf(counter) + " /  4");
                if (counter == 4) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }
            }
        }
        if (randomInt == 10) {
            if (!w.set10.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set10.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set10.remove(ss);
                counter++;
                score.setText(String.valueOf(counter) + " /  27");
                if (counter == 27) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }
            }
        }
        if (randomInt == 11) {
            if (!w.set11.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }
            if (w.set11.contains(ss)) {

                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set11.remove(ss);
                counter++;
                score.setText(String.valueOf(counter) + " /  11");
                if (counter == 11) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }
            }

        }
        if (randomInt == 12) {

            if (!w.set12.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set12.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set12.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  20");
                if (counter == 20) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 13) {

            if (!w.set13.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set13.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set13.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  24");
                if (counter == 24) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 14) {

            if (!w.set14.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set14.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set14.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  24");
                if (counter == 24) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 15) {

            if (!w.set15.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set15.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set15.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  11");
                if (counter == 11) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 16) {

            if (!w.set16.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set16.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set16.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  3");
                if (counter == 3) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 17) {

            if (!w.set17.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set17.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set17.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  6");
                if (counter == 6) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 18) {

            if (!w.set18.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set18.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set18.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  12");
                if (counter == 12) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 19) {

            if (!w.set19.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set19.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set19.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  4");
                if (counter == 4) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 20) {

            if (!w.set20.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set20.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set20.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  4");
                if (counter == 4) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 21) {

            if (!w.set21.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set21.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set21.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  23");
                if (counter == 23) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 22) {

            if (!w.set22.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set22.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set22.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  12");
                if (counter == 12) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 23) {

            if (!w.set23.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set23.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set23.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  12");
                if (counter == 12) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 24) {

            if (!w.set24.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set24.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set24.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  8");
                if (counter == 8) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 25) {

            if (!w.set25.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set25.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set25.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  7");
                if (counter == 7) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }

        }
        if (randomInt == 26) {

            if (!w.set26.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set26.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set26.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  7");
                if (counter == 7) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 27) {

            if (!w.set27.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set27.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set27.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  11");
                if (counter == 11) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 28) {

            if (!w.set28.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set28.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set28.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  16");
                if (counter == 16) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 29) {

            if (!w.set29.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set29.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set29.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  26");
                if (counter == 26) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 30) {

            if (!w.set30.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set30.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set30.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  3");
                if (counter == 3) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 31) {

            if (!w.set31.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set31.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set31.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  6");
                if (counter == 6) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 32) {

            if (!w.set32.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set32.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set32.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  23");
                if (counter == 23) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 33) {

            if (!w.set33.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set33.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set33.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  7");
                if (counter == 7) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 34) {

            if (!w.set34.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set34.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set34.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  8");
                if (counter == 8) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 35) {

            if (!w.set35.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set35.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set35.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  26");
                if (counter == 26) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 36) {

            if (!w.set36.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set36.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set36.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  16");
                if (counter == 16) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 37) {

            if (!w.set37.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set37.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set37.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  4");
                if (counter == 4) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 38) {

            if (!w.set38.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set38.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set38.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  10");
                if (counter == 10) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 39) {

            if (!w.set39.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set39.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set39.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  17");
                if (counter == 17) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 40) {

            if (!w.set40.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set40.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set40.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  4");
                if (counter == 4) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 41) {

            if (!w.set41.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set41.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set41.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  11");
                if (counter == 11) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 42) {

            if (!w.set42.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set42.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set42.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  6");
                if (counter == 6) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 43) {

            if (!w.set43.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set43.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set43.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  4");
                if (counter == 4) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 44) {

            if (!w.set44.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set44.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set44.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  19");
                if (counter == 19) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 45) {

            if (!w.set45.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set45.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set45.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  12");
                if (counter == 12) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 46) {

            if (!w.set46.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set46.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set46.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  6");
                if (counter == 6) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 47) {

            if (!w.set47.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set47.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set47.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  24");
                if (counter == 24) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 48) {

            if (!w.set48.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set48.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set48.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  7");
                if (counter == 7) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 49) {

            if (!w.set49.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set49.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set49.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  8");
                if (counter == 8) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }
        if (randomInt == 0) {

            if (!w.set50.contains(ss)) {
                Toast.makeText(this, "Invalid word ! Try Again", Toast.LENGTH_SHORT)
                        .show();
            }

            if (w.set50.contains(ss)) {
                TextView tv = myTextViewList.get(counter);
                tv.setText(ss);
                w.set50.remove(ss);
                counter++;

                score.setText(String.valueOf(counter) + " /  14");
                if (counter == 14) {
                    String scr = " YOU WON !";
                    Intent ii = new Intent(MainActivity.this, GameOver_Screen.class);
                    ii.putExtra("score", scr);
                    startActivity(ii);
                }

            }
        }*/

        }

    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Exit")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                finish();
                            }
                        }).setNegativeButton("No", null).show();
    }


}