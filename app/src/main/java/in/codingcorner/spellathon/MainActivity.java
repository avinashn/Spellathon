package in.codingcorner.spellathon;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;


public class MainActivity extends Activity implements OnClickListener {

    Button b1, b2, b3, b4, b5, b6, b7, submit, back, howtoPlay, giveUp;
    TextView score, gm3, gm4, gm5, gm6, gm7;
    EditText res;
    int randomInt, gameMode;
    LinearLayout myLayout;
    // ArrayList<TextView> myTextViewList;
    TextView resTv;
    WordsList w = new WordsList();
    int counter = 0;
    String filename;
    BufferedReader reader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Initialize();
        gameLogic();
        String str = "abietin";
        permutation(" ", str);


    }


    private void permutation(String prefix, String str) {

        int n = str.length();
        if (n == 0) {
            //Log.e(prefix, "df");
            //List<String> permutation = new ArrayList<>(Arrays.asList(""));
            // permutation.add(prefix);
           /* for (int fi=0;fi < permutation.size();fi++)
            {
                Log.i("Value of element "+fi,permutation.get(fi));
            }*/
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(getAssets().open("length7file.txt")));

                String line;
                while ((line = br.readLine()) != null) {
                    Log.e(line, "sad");
                    if (line.contains(prefix)) {
                        br.close();
                        Log.e(line, "dsd");
                    }
                }
                br.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }

        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
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


    private void Initialize() {

        res = (EditText) findViewById(R.id.editText1);
        submit = (Button) findViewById(R.id.submit);
        back = (Button) findViewById(R.id.back);

        resTv = (TextView) findViewById(R.id.restextView);
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

        gm3 = (TextView) findViewById(R.id.gameMode3);
        gm4 = (TextView) findViewById(R.id.gameMode4);
        gm5 = (TextView) findViewById(R.id.gameMode5);
        gm6 = (TextView) findViewById(R.id.gameMode6);
        gm7 = (TextView) findViewById(R.id.gameMode7);

        gm3.setOnClickListener(this);
        gm4.setOnClickListener(this);
        gm5.setOnClickListener(this);
        gm6.setOnClickListener(this);
        gm7.setOnClickListener(this);
        gm4.setTextColor(this.getResources().getColor(R.color.material_deep_teal_500));

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

        gameMode = 4;
        filename = "length4file.txt";
        //gm4.setTextColor(this.getResources().getColor(R.color.material_deep_teal_500));

        /*myLayout = (LinearLayout) findViewById(R.id.tvLayout);
        myTextViewList = new ArrayList<>();

        for (int i = 0; i < myLayout.getChildCount(); i++)
            if (myLayout.getChildAt(i) instanceof TextView)
                myTextViewList.add((TextView) myLayout.getChildAt(i));*/

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
            case R.id.gameMode3:
                if (gameMode != 3) {
                    gameMode = 3;
                    filename = "length3file.txt";
                    resTv.setText("");
                    gm3.setTextColor(this.getResources().getColor(R.color.material_deep_teal_500));
                    gm4.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm5.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm6.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm7.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                }
                break;
            case R.id.gameMode4:
                if (gameMode != 4) {
                    gameMode = 4;
                    filename = "length4file.txt";
                    resTv.setText("");
                    gm4.setTextColor(this.getResources().getColor(R.color.material_deep_teal_500));
                    gm3.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm5.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm6.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm7.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                }
                break;
            case R.id.gameMode5:
                if (gameMode != 5) {
                    gameMode = 5;
                    filename = "length5file.txt";
                    resTv.setText("");
                    gm5.setTextColor(this.getResources().getColor(R.color.material_deep_teal_500));
                    gm4.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm3.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm6.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm7.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                }
                break;
            case R.id.gameMode6:
                if (gameMode != 6) {
                    gameMode = 6;
                    filename = "length6file.txt";
                    resTv.setText("");
                    gm6.setTextColor(this.getResources().getColor(R.color.material_deep_teal_500));
                    gm4.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm5.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm3.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm7.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                }
                break;
            case R.id.gameMode7:
                if (gameMode != 7) {
                    gameMode = 7;
                    filename = "length7file.txt";
                    resTv.setText("");
                    gm7.setTextColor(this.getResources().getColor(R.color.material_deep_teal_500));
                    gm4.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm5.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm6.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                    gm3.setTextColor(this.getResources().getColor(R.color.button_material_dark));
                }
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
        if (ss.length() < gameMode) {
            Toast.makeText(this, "Word Should me minumim of " + gameMode + " letters !", Toast.LENGTH_SHORT)
                    .show();
        } else if (ss.length() == 0) {
            Toast.makeText(this, "Please enter a word !", Toast.LENGTH_SHORT)
                    .show();
        } else if (!ss.contains(middle)) {
            Toast.makeText(this, "Word must contain middle letter !", Toast.LENGTH_SHORT)
                    .show();
        } else {
            try {
                final InputStream file = getAssets().open(filename);
                Log.e(filename, "filename");
                BufferedReader reader = new BufferedReader(new InputStreamReader(file));
                String line;
                StringBuilder text = new StringBuilder();
//            while ((line=reader.readLine()) != null) {
//
//                if (ss.equals(line)) {
//                    Log.e("found",line);
//                    Toast.makeText(this, "Working!", Toast.LENGTH_SHORT)
//                            .show();
//                    TextView tv = myTextViewList.get(counter);
//                    tv.setText(line);
//                    break;
//                } else {
//                    Log.e("not found","not found");
//                    Toast.makeText(this, "Not found !", Toast.LENGTH_SHORT)
//                            .show();
//
//
//                }
//
//            }

                while ((line = reader.readLine()) != null) {
                    if (ss.equals(line)) {
                        text.append(line);
                        text.append('\n');
                        resTv.append(text.toString());
                        break;
                    }

                }
                if (text.toString().equals("") || text.toString().equals(null)) {
                    Toast.makeText(this, "Not found !", Toast.LENGTH_SHORT)
                            .show();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
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