package com.example.wertjr.memorygame;


import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class memorygame extends AppCompatActivity {

    public Button button, button2, button3, button4, button5, button6, button7, button8,
            button9, button10, button11, button12, button13, button14, button15,
            button16, button17, button18, button19, button20, button21, button22,
            button23, button24, button25, button26, button27, button28, button29,
            button30, buttonstart, buttonback, buttoneasy, buttonmedium, buttonhard;

    public TextView textview1, textview2, textview3;
    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorygame);

        invisible();
        option();
        option2();
    }

    public int count;
    public int easy_flag = 0;
    public int medium_flag = 0;
    public int hard_flag = 0;

    public void timer() {
        count = 5;
        mp = MediaPlayer.create(memorygame.this, R.raw.song);
        new CountDownTimer(6000, 1000) {
            public void onTick(long mills) {
                buttonstart.setEnabled(false);
                enable_false();
                mp.start();
                count--;
            }

            public void onFinish() {
                btn_default();
                buttonstart.setEnabled(true);
                enable_true();
                mp.stop();
                count = 0;
            }
        }.start();
    }

    public void enable_true(){
        button.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button10.setEnabled(true);
        button11.setEnabled(true);
        button12.setEnabled(true);
        button13.setEnabled(true);
        button14.setEnabled(true);
        button15.setEnabled(true);
        button16.setEnabled(true);
        button17.setEnabled(true);
        button18.setEnabled(true);
        button19.setEnabled(true);
        button20.setEnabled(true);
        button21.setEnabled(true);
        button22.setEnabled(true);
        button23.setEnabled(true);
        button24.setEnabled(true);
        button25.setEnabled(true);
        button26.setEnabled(true);
        button27.setEnabled(true);
        button28.setEnabled(true);
        button29.setEnabled(true);
        button30.setEnabled(true);
    }

    public void enable_false(){
        button.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        button10.setEnabled(false);
        button11.setEnabled(false);
        button12.setEnabled(false);
        button13.setEnabled(false);
        button14.setEnabled(false);
        button15.setEnabled(false);
        button16.setEnabled(false);
        button17.setEnabled(false);
        button18.setEnabled(false);
        button19.setEnabled(false);
        button20.setEnabled(false);
        button21.setEnabled(false);
        button22.setEnabled(false);
        button23.setEnabled(false);
        button24.setEnabled(false);
        button25.setEnabled(false);
        button26.setEnabled(false);
        button27.setEnabled(false);
        button28.setEnabled(false);
        button29.setEnabled(false);
        button30.setEnabled(false);
    }

    public void find_id() {
        textview1 = (TextView) findViewById(R.id.textView);
        textview2 = (TextView) findViewById(R.id.textView2);
        textview3 = (TextView) findViewById(R.id.textView3);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);
        button26 = (Button) findViewById(R.id.button26);
        button27 = (Button) findViewById(R.id.button27);
        button28 = (Button) findViewById(R.id.button28);
        button29 = (Button) findViewById(R.id.button29);
        button30 = (Button) findViewById(R.id.button30);
        buttonstart = (Button) findViewById(R.id.buttonstart);
        buttonback = (Button) findViewById(R.id.buttonback);
    }

    public void invisible() {
        find_id();
        button.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
        button5.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);
        button7.setVisibility(View.INVISIBLE);
        button8.setVisibility(View.INVISIBLE);
        button9.setVisibility(View.INVISIBLE);
        button10.setVisibility(View.INVISIBLE);
        button11.setVisibility(View.INVISIBLE);
        button12.setVisibility(View.INVISIBLE);
        button13.setVisibility(View.INVISIBLE);
        button14.setVisibility(View.INVISIBLE);
        button15.setVisibility(View.INVISIBLE);
        button16.setVisibility(View.INVISIBLE);
        button17.setVisibility(View.INVISIBLE);
        button18.setVisibility(View.INVISIBLE);
        button19.setVisibility(View.INVISIBLE);
        button20.setVisibility(View.INVISIBLE);
        button21.setVisibility(View.INVISIBLE);
        button22.setVisibility(View.INVISIBLE);
        button23.setVisibility(View.INVISIBLE);
        button24.setVisibility(View.INVISIBLE);
        button25.setVisibility(View.INVISIBLE);
        button26.setVisibility(View.INVISIBLE);
        button27.setVisibility(View.INVISIBLE);
        button28.setVisibility(View.INVISIBLE);
        button29.setVisibility(View.INVISIBLE);
        button30.setVisibility(View.INVISIBLE);
        buttonstart.setVisibility(View.INVISIBLE);
        buttonback.setVisibility(View.INVISIBLE);
        textview1.setVisibility(View.INVISIBLE);
        textview2.setVisibility(View.INVISIBLE);
        textview3.setVisibility(View.INVISIBLE);
    }

    public void visible() {
        find_id();
        button.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);
        button5.setVisibility(View.VISIBLE);
        button6.setVisibility(View.VISIBLE);
        button7.setVisibility(View.VISIBLE);
        button8.setVisibility(View.VISIBLE);
        button9.setVisibility(View.VISIBLE);
        button10.setVisibility(View.VISIBLE);
        button11.setVisibility(View.VISIBLE);
        button12.setVisibility(View.VISIBLE);
        button13.setVisibility(View.VISIBLE);
        button14.setVisibility(View.VISIBLE);
        button15.setVisibility(View.VISIBLE);
        button16.setVisibility(View.VISIBLE);
        button17.setVisibility(View.VISIBLE);
        button18.setVisibility(View.VISIBLE);
        button19.setVisibility(View.VISIBLE);
        button20.setVisibility(View.VISIBLE);
        button21.setVisibility(View.VISIBLE);
        button22.setVisibility(View.VISIBLE);
        button23.setVisibility(View.VISIBLE);
        button24.setVisibility(View.VISIBLE);
        button25.setVisibility(View.VISIBLE);
        button26.setVisibility(View.VISIBLE);
        button27.setVisibility(View.VISIBLE);
        button28.setVisibility(View.VISIBLE);
        button29.setVisibility(View.VISIBLE);
        button30.setVisibility(View.VISIBLE);
        buttonstart.setVisibility(View.VISIBLE);
        buttonback.setVisibility(View.VISIBLE);
        textview1.setVisibility(View.VISIBLE);
        textview2.setVisibility(View.VISIBLE);
        textview3.setVisibility(View.VISIBLE);
    }

    public void option() {
        buttoneasy = (Button) findViewById(R.id.buttoneasy);
        buttonmedium = (Button) findViewById(R.id.buttonmedium);
        buttonhard = (Button) findViewById(R.id.buttonhard);

        buttoneasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                visible();
                scor = 0;
                easyc = 0;
                mediumc = 0;
                hardc = 0;
                textview2.setText(String.valueOf(scor));

                easy_flag = 1;
                medium_flag = 0;
                hard_flag = 0;
                buttoneasy.setVisibility(View.INVISIBLE);
                buttonmedium.setVisibility(View.INVISIBLE);
                buttonhard.setVisibility(View.INVISIBLE);
            }
        });
        buttonmedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                visible();
                scor = 0;
                easyc = 0;
                mediumc = 0;
                hardc = 0;
                textview2.setText(String.valueOf(scor));

                easy_flag = 0;
                medium_flag = 1;
                hard_flag = 0;
                buttoneasy.setVisibility(View.INVISIBLE);
                buttonmedium.setVisibility(View.INVISIBLE);
                buttonhard.setVisibility(View.INVISIBLE);
            }
        });
        buttonhard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                visible();
                scor = 0;
                easyc = 0;
                mediumc = 0;
                hardc = 0;
                textview2.setText(String.valueOf(scor));

                easy_flag = 0;
                medium_flag = 0;
                hard_flag = 1;
                buttoneasy.setVisibility(View.INVISIBLE);
                buttonmedium.setVisibility(View.INVISIBLE);
                buttonhard.setVisibility(View.INVISIBLE);
            }
        });
    }

    public void btn_default() {
        button.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button10.setText("");
        button11.setText("");
        button12.setText("");
        button13.setText("");
        button14.setText("");
        button15.setText("");
        button16.setText("");
        button17.setText("");
        button18.setText("");
        button19.setText("");
        button20.setText("");
        button21.setText("");
        button22.setText("");
        button23.setText("");
        button24.setText("");
        button25.setText("");
        button26.setText("");
        button27.setText("");
        button28.setText("");
        button29.setText("");
        button30.setText("");
    }

    public int easy1, easy2, easy3, easy4, easy5, easy6, medium7, hard8;

    public void option2() {
        buttonback = (Button) findViewById(R.id.buttonback);
        buttonstart = (Button) findViewById(R.id.buttonstart);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                invisible();
                btn_default();
                textview3.setText("");
                buttoneasy.setVisibility(View.VISIBLE);
                buttonmedium.setVisibility(View.VISIBLE);
                buttonhard.setVisibility(View.VISIBLE);
            }
        });
        buttonstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                visible();
                btn_default();
                timer();
                textview3.setText("");

                if(stop >= 3)
                    textview2.setText("0");
                stop = 0;
                easyc = 0;  mediumc = 0; hardc = 0;

                boolean unu=false, doi=false, trei=false, patru=false, cinci=false, sase=false,
                        sapte=false, opt=false, noua=false, zece=false, unu1=false, doi1=false,
                        trei1=false, patru1=false, cinci1=false, sase1=false, sapte1=false, opt1=false,
                        noua1=false, zece1=false, unu2=false, doi2=false, trei2=false, patru2 = false,
                        cinci2=false, sase2=false, sapte2=false, opt2=false, noua2=false, zece2=false;
                if (easy_flag == 1) {

                    Random r1 = new Random();
                    easy1 = r1.nextInt(31 - 1) + 1;

                    Random r2 = new Random();
                    easy2 = r2.nextInt(31 - 1) + 1;
                    while (easy2 == easy1) {
                        easy2 = r2.nextInt(31 - 1) + 1;
                    }

                    Random r3 = new Random();
                    easy3 = r3.nextInt(31 - 1) + 1;
                    while (easy3 == easy1 || easy3 == easy2) {
                        easy3 = r3.nextInt(31 - 1) + 1;
                    }

                    Random r4 = new Random();
                    easy4 = r4.nextInt(31 - 1) + 1;
                    while (easy4 == easy1 || easy4 == easy2 || easy4 == easy3) {
                        easy4 = r4.nextInt(31 - 1) + 1;
                    }

                    Random r5 = new Random();
                    easy5 = r5.nextInt(31 - 1) + 1;
                    while (easy5 == easy1 || easy5 == easy2 || easy5 == easy3 || easy5 == easy4) {
                        easy5 = r5.nextInt(31 - 1) + 1;
                    }

                    Random r6 = new Random();
                    easy6 = r6.nextInt(31 - 1) + 1;
                    while (easy6 == easy1 || easy6 == easy2 || easy6 == easy3 || easy6 == easy4 || easy6 == easy5) {
                        easy6 = r6.nextInt(31 - 1) + 1;
                    }

                    int da = 6;

                    if (count > 0) {
                        while(da > 0) {
                            if ((easy1 == 1 || easy2 == 1 || easy3 == 1 || easy4 == 1 || easy5 == 1 || easy6 == 1) && unu == false) {
                                button.setText("o");
                                da--;
                                unu = true;
                            }
                            else if ((easy1 == 2 || easy2 == 2 || easy3 == 2 || easy4 == 2 || easy5 == 2 || easy6 == 2) && doi == false) {
                                button2.setText("o");
                                da--;
                                doi = true;
                            }
                            else if ((easy1 == 3 || easy2 == 3 || easy3 == 3 || easy4 == 3 || easy5 == 3 || easy6 == 3) && trei == false) {
                                button3.setText("o");
                                da--;
                                trei = true;
                            }
                            else if ((easy1 == 4 || easy2 == 4 || easy3 == 4 || easy4 == 4 || easy5 == 4 || easy6 == 4) && patru == false){
                                button4.setText("o");
                                da--;
                                patru = true;
                            }
                            else if ((easy1 == 5 || easy2 == 5 || easy3 == 5 || easy4 == 5 || easy5 == 5 || easy6 == 5) && cinci == false) {
                                button5.setText("o");
                                da--;
                                cinci = true;
                            }
                            else if ((easy1 == 6 || easy2 == 6 || easy3 == 6 || easy4 == 6 || easy5 == 6 || easy6 == 6) && sase == false) {
                                button6.setText("o");
                                da--;
                                sase = true;
                            }
                            else if ((easy1 == 7 || easy2 == 7 || easy3 == 7 || easy4 == 7 || easy5 == 7 || easy6 == 7) && sapte == false) {
                                button7.setText("o");
                                da--;
                                sapte = true;
                            }
                            else if ((easy1 == 8 || easy2 == 8 || easy3 == 8 || easy4 == 8 || easy5 == 8 || easy6 == 8) && opt == false) {
                                button8.setText("o");
                                da--;
                                opt = true;
                            }
                            else if ((easy1 == 9 || easy2 == 9 || easy3 == 9 || easy4 == 9 || easy5 == 9 || easy6 == 9) && noua == false) {
                                button9.setText("o");
                                da--;
                                noua = true;
                            }
                            else if ((easy1 == 10 || easy2 == 10 || easy3 == 10 || easy4 == 10 || easy5 == 10 || easy6 == 10) && zece == false) {
                                button10.setText("o");
                                da--;
                                zece = true;
                            }
                            else if ((easy1 == 11 || easy2 == 11 || easy3 == 11 || easy4 == 11 || easy5 == 11 || easy6 == 11) && unu1 == false) {
                                button11.setText("o");
                                da--;
                                unu1 = true;
                            }
                            else if ((easy1 == 12 || easy2 == 12 || easy3 == 12 || easy4 == 12 || easy5 == 12 || easy6 == 12) && doi1 == false) {
                                button12.setText("o");
                                da--;
                                doi1 = true;
                            }
                            else if ((easy1 == 13 || easy2 == 13 || easy3 == 13 || easy4 == 13 || easy5 == 13 || easy6 == 13) && trei1 == false) {
                                button13.setText("o");
                                da--;
                                trei1 = true;
                            }
                            else if ((easy1 == 14 || easy2 == 14 || easy3 == 14 || easy4 == 14 || easy5 == 14 || easy6 == 14) && patru1 == false) {
                                button14.setText("o");
                                da--;
                                patru1 = true;
                            }
                            else if ((easy1 == 15 || easy2 == 15 || easy3 == 15 || easy4 == 15 || easy5 == 15 || easy6 == 15) && cinci1 == false) {
                                button15.setText("o");
                                da--;
                                cinci1 = true;
                            }
                            else if ((easy1 == 16 || easy2 == 16 || easy3 == 16 || easy4 == 16 || easy5 == 16 || easy6 == 16) && sase1 == false) {
                                button16.setText("o");
                                da--;
                                sase1 = true;
                            }
                            else if ((easy1 == 17 || easy2 == 17 || easy3 == 17 || easy4 == 17 || easy5 == 17 || easy6 == 17) && sapte1 == false) {
                                button17.setText("o");
                                da--;
                                sapte1 = true;
                            }
                            else if ((easy1 == 18 || easy2 == 18 || easy3 == 18 || easy4 == 18 || easy5 == 18 || easy6 == 18) && opt1 == false) {
                                button18.setText("o");
                                da--;
                                opt1 = true;
                            }
                            else if ((easy1 == 19 || easy2 == 19 || easy3 == 19 || easy4 == 19 || easy5 == 19 || easy6 == 19) && noua1 == false) {
                                button19.setText("o");
                                da--;
                                noua1 = true;
                            }
                            else if ((easy1 == 20 || easy2 == 20 || easy3 == 20 || easy4 == 20 || easy5 == 20 || easy6 == 20) && zece1 == false) {
                                button20.setText("o");
                                da--;
                                zece1 = true;
                            }
                            else if ((easy1 == 21 || easy2 == 21 || easy3 == 21 || easy4 == 21 || easy5 == 21 || easy6 == 21) && unu2 == false) {
                                button21.setText("o");
                                da--;
                                unu2 = true;
                            }
                            else if ((easy1 == 22 || easy2 == 22 || easy3 == 22 || easy4 == 22 || easy5 == 22 || easy6 == 22) && doi2 == false) {
                                button22.setText("o");
                                da--;
                                doi2 = true;
                            }
                            else if ((easy1 == 23 || easy2 == 23 || easy3 == 23 || easy4 == 23 || easy5 == 23 || easy6 == 23) && trei2 == false) {
                                button23.setText("o");
                                da--;
                                trei2 = true;
                            }
                            else if ((easy1 == 24 || easy2 == 24 || easy3 == 24 || easy4 == 24 || easy5 == 24 || easy6 == 24) && patru2 == false) {
                                button24.setText("o");
                                da--;
                                patru2 = true;
                            }
                            else if ((easy1 == 25 || easy2 == 25 || easy3 == 25 || easy4 == 25 || easy5 == 25 || easy6 == 25) && cinci2 == false) {
                                button25.setText("o");
                                da--;
                                cinci2 = true;
                            }
                            else if ((easy1 == 26 || easy2 == 26 || easy3 == 26 || easy4 == 26 || easy5 == 26 || easy6 == 26) && sase2 == false) {
                                button26.setText("o");
                                da--;
                                sase2 = true;
                            }
                            else if ((easy1 == 27 || easy2 == 27 || easy3 == 27 || easy4 == 27 || easy5 == 27 || easy6 == 27) && sapte2 == false) {
                                button27.setText("o");
                                da--;
                                sapte2 = true;
                            }
                            else if ((easy1 == 28 || easy2 == 28 || easy3 == 28 || easy4 == 28 || easy5 == 28 || easy6 == 28) && opt2 == false) {
                                button28.setText("o");
                                da--;
                                opt2 = true;
                            }
                            else if ((easy1 == 29 || easy2 == 29 || easy3 == 29 || easy4 == 29 || easy5 == 29 || easy6 == 29) && noua2 == false) {
                                button29.setText("o");
                                da--;
                                noua2 = true;
                            }
                            else if ((easy1 == 30 || easy2 == 30 || easy3 == 30 || easy4 == 30 || easy5 == 30 || easy6 == 30) && zece2 == false) {
                                button30.setText("o");
                                da--;
                                zece2 = true;
                            }
                        }
                    }

                } else if (medium_flag == 1) {

                    Random m1 = new Random();
                    easy1 = m1.nextInt(31 - 1) + 1;

                    Random m2 = new Random();
                    easy2 = m2.nextInt(31 - 1) + 1;
                    while (easy2 == easy1) {
                        easy2 = m2.nextInt(31 - 1) + 1;
                    }

                    Random m3 = new Random();
                    easy3 = m3.nextInt(31 - 1) + 1;
                    while (easy3 == easy1 || easy3 == easy2) {
                        easy3 = m3.nextInt(31 - 1) + 1;
                    }

                    Random m4 = new Random();
                    easy4 = m4.nextInt(31 - 1) + 1;
                    while (easy4 == easy1 || easy4 == easy2 || easy4 == easy3) {
                        easy4 = m4.nextInt(31 - 1) + 1;
                    }

                    Random m5 = new Random();
                    easy5 = m5.nextInt(31 - 1) + 1;
                    while (easy5 == easy1 || easy5 == easy2 || easy5 == easy3 || easy5 == easy4) {
                        easy5 = m5.nextInt(31 - 1) + 1;
                    }

                    Random m6 = new Random();
                    easy6 = m6.nextInt(31 - 1) + 1;
                    while (easy6 == easy1 || easy6 == easy2 || easy6 == easy3 || easy6 == easy4 || easy6 == easy5) {
                        easy6 = m6.nextInt(31 - 1) + 1;
                    }

                    Random r7 = new Random();
                    medium7 = r7.nextInt(31 - 1) + 1;
                    while (medium7 == easy1 || medium7 == easy2 || medium7 == easy3 || medium7 == easy4 || medium7 == easy5 || medium7 == easy6) {
                        medium7 = r7.nextInt(31 - 1) + 1;
                    }

                    int da = 7;

                    if (count > 0) {
                        while(da > 0) {
                            if ((easy1 == 1 || easy2 == 1 || easy3 == 1 || easy4 == 1 || easy5 == 1 || easy6 == 1 || medium7 == 1) && unu == false) {
                                button.setText("o");
                                da--;
                                unu = true;
                            }
                            else if ((easy1 == 2 || easy2 == 2 || easy3 == 2 || easy4 == 2 || easy5 == 2 || easy6 == 2 || medium7 == 2) && doi == false) {
                                button2.setText("o");
                                da--;
                                doi = true;
                            }
                            else if ((easy1 == 3 || easy2 == 3 || easy3 == 3 || easy4 == 3 || easy5 == 3 || easy6 == 3 || medium7 == 3) && trei == false) {
                                button3.setText("o");
                                da--;
                                trei = true;
                            }
                            else if ((easy1 == 4 || easy2 == 4 || easy3 == 4 || easy4 == 4 || easy5 == 4 || easy6 == 4 || medium7 == 4) && patru == false){
                                button4.setText("o");
                                da--;
                                patru = true;
                            }
                            else if ((easy1 == 5 || easy2 == 5 || easy3 == 5 || easy4 == 5 || easy5 == 5 || easy6 == 5 || medium7 == 5) && cinci == false) {
                                button5.setText("o");
                                da--;
                                cinci = true;
                            }
                            else if ((easy1 == 6 || easy2 == 6 || easy3 == 6 || easy4 == 6 || easy5 == 6 || easy6 == 6 || medium7 == 6) && sase == false) {
                                button6.setText("o");
                                da--;
                                sase = true;
                            }
                            else if ((easy1 == 7 || easy2 == 7 || easy3 == 7 || easy4 == 7 || easy5 == 7 || easy6 == 7 || medium7 == 7) && sapte == false) {
                                button7.setText("o");
                                da--;
                                sapte = true;
                            }
                            else if ((easy1 == 8 || easy2 == 8 || easy3 == 8 || easy4 == 8 || easy5 == 8 || easy6 == 8 || medium7 == 8) && opt == false) {
                                button8.setText("o");
                                da--;
                                opt = true;
                            }
                            else if ((easy1 == 9 || easy2 == 9 || easy3 == 9 || easy4 == 9 || easy5 == 9 || easy6 == 9 || medium7 == 9) && noua == false) {
                                button9.setText("o");
                                da--;
                                noua = true;
                            }
                            else if ((easy1 == 10 || easy2 == 10 || easy3 == 10 || easy4 == 10 || easy5 == 10 || easy6 == 10 || medium7 == 10) && zece == false) {
                                button10.setText("o");
                                da--;
                                zece = true;
                            }
                            else if ((easy1 == 11 || easy2 == 11 || easy3 == 11 || easy4 == 11 || easy5 == 11 || easy6 == 11 || medium7 == 11) && unu1 == false) {
                                button11.setText("o");
                                da--;
                                unu1 = true;
                            }
                            else if ((easy1 == 12 || easy2 == 12 || easy3 == 12 || easy4 == 12 || easy5 == 12 || easy6 == 12 || medium7 == 12) && doi1 == false) {
                                button12.setText("o");
                                da--;
                                doi1 = true;
                            }
                            else if ((easy1 == 13 || easy2 == 13 || easy3 == 13 || easy4 == 13 || easy5 == 13 || easy6 == 13 || medium7 == 13) && trei1 == false) {
                                button13.setText("o");
                                da--;
                                trei1 = true;
                            }
                            else if ((easy1 == 14 || easy2 == 14 || easy3 == 14 || easy4 == 14 || easy5 == 14 || easy6 == 14 || medium7 == 14) && patru1 == false) {
                                button14.setText("o");
                                da--;
                                patru1 = true;
                            }
                            else if ((easy1 == 15 || easy2 == 15 || easy3 == 15 || easy4 == 15 || easy5 == 15 || easy6 == 15 || medium7 == 15) && cinci1 == false) {
                                button15.setText("o");
                                da--;
                                cinci1 = true;
                            }
                            else if ((easy1 == 16 || easy2 == 16 || easy3 == 16 || easy4 == 16 || easy5 == 16 || easy6 == 16 || medium7 == 16) && sase1 == false) {
                                button16.setText("o");
                                da--;
                                sase1 = true;
                            }
                            else if ((easy1 == 17 || easy2 == 17 || easy3 == 17 || easy4 == 17 || easy5 == 17 || easy6 == 17 || medium7 == 17) && sapte1 == false) {
                                button17.setText("o");
                                da--;
                                sapte1 = true;
                            }
                            else if ((easy1 == 18 || easy2 == 18 || easy3 == 18 || easy4 == 18 || easy5 == 18 || easy6 == 18 || medium7 == 18) && opt1 == false) {
                                button18.setText("o");
                                da--;
                                opt1 = true;
                            }
                            else if ((easy1 == 19 || easy2 == 19 || easy3 == 19 || easy4 == 19 || easy5 == 19 || easy6 == 19 || medium7 == 19) && noua1 == false) {
                                button19.setText("o");
                                da--;
                                noua1 = true;
                            }
                            else if ((easy1 == 20 || easy2 == 20 || easy3 == 20 || easy4 == 20 || easy5 == 20 || easy6 == 20 || medium7 == 20) && zece1 == false) {
                                button20.setText("o");
                                da--;
                                zece1 = true;
                            }
                            else if ((easy1 == 21 || easy2 == 21 || easy3 == 21 || easy4 == 21 || easy5 == 21 || easy6 == 21 || medium7 == 21) && unu2 == false) {
                                button21.setText("o");
                                da--;
                                unu2 = true;
                            }
                            else if ((easy1 == 22 || easy2 == 22 || easy3 == 22 || easy4 == 22 || easy5 == 22 || easy6 == 22 || medium7 == 22) && doi2 == false) {
                                button22.setText("o");
                                da--;
                                doi2 = true;
                            }
                            else if ((easy1 == 23 || easy2 == 23 || easy3 == 23 || easy4 == 23 || easy5 == 23 || easy6 == 23 || medium7 == 23) && trei2 == false) {
                                button23.setText("o");
                                da--;
                                trei2 = true;
                            }
                            else if ((easy1 == 24 || easy2 == 24 || easy3 == 24 || easy4 == 24 || easy5 == 24 || easy6 == 24 || medium7 == 24) && patru2 == false) {
                                button24.setText("o");
                                da--;
                                patru2 = true;
                            }
                            else if ((easy1 == 25 || easy2 == 25 || easy3 == 25 || easy4 == 25 || easy5 == 25 || easy6 == 25 || medium7 == 25) && cinci2 == false) {
                                button25.setText("o");
                                da--;
                                cinci2 = true;
                            }
                            else if ((easy1 == 26 || easy2 == 26 || easy3 == 26 || easy4 == 26 || easy5 == 26 || easy6 == 26 || medium7 == 26) && sase2 == false) {
                                button26.setText("o");
                                da--;
                                sase2 = true;
                            }
                            else if ((easy1 == 27 || easy2 == 27 || easy3 == 27 || easy4 == 27 || easy5 == 27 || easy6 == 27 || medium7 == 27) && sapte2 == false) {
                                button27.setText("o");
                                da--;
                                sapte2 = true;
                            }
                            else if ((easy1 == 28 || easy2 == 28 || easy3 == 28 || easy4 == 28 || easy5 == 28 || easy6 == 28 || medium7 == 28) && opt2 == false) {
                                button28.setText("o");
                                da--;
                                opt2 = true;
                            }
                            else if ((easy1 == 29 || easy2 == 29 || easy3 == 29 || easy4 == 29 || easy5 == 29 || easy6 == 29 || medium7 == 29) && noua2 == false) {
                                button29.setText("o");
                                da--;
                                noua2 = true;
                            }
                            else if ((easy1 == 30 || easy2 == 30 || easy3 == 30 || easy4 == 30 || easy5 == 30 || easy6 == 30 || medium7 == 30) && zece2 == false) {
                                button30.setText("o");
                                da--;
                                zece2 = true;
                            }
                        }
                    }

                } else if (hard_flag == 1) {

                    Random h1 = new Random();
                    easy1 = h1.nextInt(31 - 1) + 1;

                    Random h2 = new Random();
                    easy2 = h2.nextInt(31 - 1) + 1;
                    while (easy2 == easy1) {
                        easy2 = h2.nextInt(31 - 1) + 1;
                    }

                    Random h3 = new Random();
                    easy3 = h3.nextInt(31 - 1) + 1;
                    while (easy3 == easy1 || easy3 == easy2) {
                        easy3 = h3.nextInt(31 - 1) + 1;
                    }

                    Random h4 = new Random();
                    easy4 = h4.nextInt(31 - 1) + 1;
                    while (easy4 == easy1 || easy4 == easy2 || easy4 == easy3) {
                        easy4 = h4.nextInt(31 - 1) + 1;
                    }

                    Random h5 = new Random();
                    easy5 = h5.nextInt(31 - 1) + 1;
                    while (easy5 == easy1 || easy5 == easy2 || easy5 == easy3 || easy5 == easy4) {
                        easy5 = h5.nextInt(31 - 1) + 1;
                    }

                    Random h6 = new Random();
                    easy6 = h6.nextInt(31 - 1) + 1;
                    while (easy6 == easy1 || easy6 == easy2 || easy6 == easy3 || easy6 == easy4 || easy6 == easy5) {
                        easy6 = h6.nextInt(31 - 1) + 1;
                    }

                    Random h7 = new Random();
                    medium7 = h7.nextInt(31 - 1) + 1;
                    while (medium7 == easy1 || medium7 == easy2 || medium7 == easy3 || medium7 == easy4 || medium7 == easy5 || medium7 == easy6) {
                        medium7 = h7.nextInt(31 - 1) + 1;
                    }

                    Random r8 = new Random();
                    hard8 = r8.nextInt(31 - 1) + 1;
                    while (hard8 == easy1 || hard8 == easy2 || hard8 == easy3 || hard8 == easy4 || hard8 == easy5 || hard8 == easy6 || hard8 == medium7) {
                        hard8 = r8.nextInt(31 - 1) + 1;
                    }

                    int da = 8;

                    if (count > 0) {
                        while(da > 0) {
                            if ((easy1 == 1 || easy2 == 1 || easy3 == 1 || easy4 == 1 || easy5 == 1 || easy6 == 1 || medium7 == 1 || hard8 == 1) && unu == false) {
                                button.setText("o");
                                da--;
                                unu = true;
                            }
                            else if ((easy1 == 2 || easy2 == 2 || easy3 == 2 || easy4 == 2 || easy5 == 2 || easy6 == 2 || medium7 == 2 || hard8 == 2) && doi == false) {
                                button2.setText("o");
                                da--;
                                doi = true;
                            }
                            else if ((easy1 == 3 || easy2 == 3 || easy3 == 3 || easy4 == 3 || easy5 == 3 || easy6 == 3 || medium7 == 3 || hard8 == 3) && trei == false) {
                                button3.setText("o");
                                da--;
                                trei = true;
                            }
                            else if ((easy1 == 4 || easy2 == 4 || easy3 == 4 || easy4 == 4 || easy5 == 4 || easy6 == 4 || medium7 == 4 || hard8 == 4) && patru == false){
                                button4.setText("o");
                                da--;
                                patru = true;
                            }
                            else if ((easy1 == 5 || easy2 == 5 || easy3 == 5 || easy4 == 5 || easy5 == 5 || easy6 == 5 || medium7 == 5 || hard8 == 5) && cinci == false) {
                                button5.setText("o");
                                da--;
                                cinci = true;
                            }
                            else if ((easy1 == 6 || easy2 == 6 || easy3 == 6 || easy4 == 6 || easy5 == 6 || easy6 == 6 || medium7 == 6 || hard8 == 6) && sase == false) {
                                button6.setText("o");
                                da--;
                                sase = true;
                            }
                            else if ((easy1 == 7 || easy2 == 7 || easy3 == 7 || easy4 == 7 || easy5 == 7 || easy6 == 7 || medium7 == 7 || hard8 == 7) && sapte == false) {
                                button7.setText("o");
                                da--;
                                sapte = true;
                            }
                            else if ((easy1 == 8 || easy2 == 8 || easy3 == 8 || easy4 == 8 || easy5 == 8 || easy6 == 8 || medium7 == 8 || hard8 == 8) && opt == false) {
                                button8.setText("o");
                                da--;
                                opt = true;
                            }
                            else if ((easy1 == 9 || easy2 == 9 || easy3 == 9 || easy4 == 9 || easy5 == 9 || easy6 == 9 || medium7 == 9 || hard8 == 9) && noua == false) {
                                button9.setText("o");
                                da--;
                                noua = true;
                            }
                            else if ((easy1 == 10 || easy2 == 10 || easy3 == 10 || easy4 == 10 || easy5 == 10 || easy6 == 10 || medium7 == 10 || hard8 == 10) && zece == false) {
                                button10.setText("o");
                                da--;
                                zece = true;
                            }
                            else if ((easy1 == 11 || easy2 == 11 || easy3 == 11 || easy4 == 11 || easy5 == 11 || easy6 == 11 || medium7 == 11 || hard8 == 11) && unu1 == false) {
                                button11.setText("o");
                                da--;
                                unu1 = true;
                            }
                            else if ((easy1 == 12 || easy2 == 12 || easy3 == 12 || easy4 == 12 || easy5 == 12 || easy6 == 12 || medium7 == 12 || hard8 == 12) && doi1 == false) {
                                button12.setText("o");
                                da--;
                                doi1 = true;
                            }
                            else if ((easy1 == 13 || easy2 == 13 || easy3 == 13 || easy4 == 13 || easy5 == 13 || easy6 == 13 || medium7 == 13 || hard8 == 13) && trei1 == false) {
                                button13.setText("o");
                                da--;
                                trei1 = true;
                            }
                            else if ((easy1 == 14 || easy2 == 14 || easy3 == 14 || easy4 == 14 || easy5 == 14 || easy6 == 14 || medium7 == 14 || hard8 == 14) && patru1 == false) {
                                button14.setText("o");
                                da--;
                                patru1 = true;
                            }
                            else if ((easy1 == 15 || easy2 == 15 || easy3 == 15 || easy4 == 15 || easy5 == 15 || easy6 == 15 || medium7 == 15 || hard8 == 15) && cinci1 == false) {
                                button15.setText("o");
                                da--;
                                cinci1 = true;
                            }
                            else if ((easy1 == 16 || easy2 == 16 || easy3 == 16 || easy4 == 16 || easy5 == 16 || easy6 == 16 || medium7 == 16 || hard8 == 16) && sase1 == false) {
                                button16.setText("o");
                                da--;
                                sase1 = true;
                            }
                            else if ((easy1 == 17 || easy2 == 17 || easy3 == 17 || easy4 == 17 || easy5 == 17 || easy6 == 17 || medium7 == 17 || hard8 == 17) && sapte1 == false) {
                                button17.setText("o");
                                da--;
                                sapte1 = true;
                            }
                            else if ((easy1 == 18 || easy2 == 18 || easy3 == 18 || easy4 == 18 || easy5 == 18 || easy6 == 18 || medium7 == 18 || hard8 == 18) && opt1 == false) {
                                button18.setText("o");
                                da--;
                                opt1 = true;
                            }
                            else if ((easy1 == 19 || easy2 == 19 || easy3 == 19 || easy4 == 19 || easy5 == 19 || easy6 == 19 || medium7 == 19 || hard8 == 19) && noua1 == false) {
                                button19.setText("o");
                                da--;
                                noua1 = true;
                            }
                            else if ((easy1 == 20 || easy2 == 20 || easy3 == 20 || easy4 == 20 || easy5 == 20 || easy6 == 20 || medium7 == 20 || hard8 == 20) && zece1 == false) {
                                button20.setText("o");
                                da--;
                                zece1 = true;
                            }
                            else if ((easy1 == 21 || easy2 == 21 || easy3 == 21 || easy4 == 21 || easy5 == 21 || easy6 == 21 || medium7 == 21 || hard8 == 21) && unu2 == false) {
                                button21.setText("o");
                                da--;
                                unu2 = true;
                            }
                            else if ((easy1 == 22 || easy2 == 22 || easy3 == 22 || easy4 == 22 || easy5 == 22 || easy6 == 22 || medium7 == 22 || hard8 == 22) && doi2 == false) {
                                button22.setText("o");
                                da--;
                                doi2 = true;
                            }
                            else if ((easy1 == 23 || easy2 == 23 || easy3 == 23 || easy4 == 23 || easy5 == 23 || easy6 == 23 || medium7 == 23 || hard8 == 23) && trei2 == false) {
                                button23.setText("o");
                                da--;
                                trei2 = true;
                            }
                            else if ((easy1 == 24 || easy2 == 24 || easy3 == 24 || easy4 == 24 || easy5 == 24 || easy6 == 24 || medium7 == 24 || hard8 == 24) && patru2 == false) {
                                button24.setText("o");
                                da--;
                                patru2 = true;
                            }
                            else if ((easy1 == 25 || easy2 == 25 || easy3 == 25 || easy4 == 25 || easy5 == 25 || easy6 == 25 || medium7 == 25 || hard8 == 25) && cinci2 == false) {
                                button25.setText("o");
                                da--;
                                cinci2 = true;
                            }
                            else if ((easy1 == 26 || easy2 == 26 || easy3 == 26 || easy4 == 26 || easy5 == 26 || easy6 == 26 || medium7 == 26 || hard8 == 26) && sase2 == false) {
                                button26.setText("o");
                                da--;
                                sase2 = true;
                            }
                            else if ((easy1 == 27 || easy2 == 27 || easy3 == 27 || easy4 == 27 || easy5 == 27 || easy6 == 27 || medium7 == 27 || hard8 == 27) && sapte2 == false) {
                                button27.setText("o");
                                da--;
                                sapte2 = true;
                            }
                            else if ((easy1 == 28 || easy2 == 28 || easy3 == 28 || easy4 == 28 || easy5 == 28 || easy6 == 28 || medium7 == 28 || hard8 == 28) && opt2 == false) {
                                button28.setText("o");
                                da--;
                                opt2 = true;
                            }
                            else if ((easy1 == 29 || easy2 == 29 || easy3 == 29 || easy4 == 29 || easy5 == 29 || easy6 == 29 || medium7 == 29 || hard8 == 29) && noua2 == false) {
                                button29.setText("o");
                                da--;
                                noua2 = true;
                            }
                            else if ((easy1 == 30 || easy2 == 30 || easy3 == 30 || easy4 == 30 || easy5 == 30 || easy6 == 30 || medium7 == 30 || hard8 == 30) && zece2 == false) {
                                button30.setText("o");
                                da--;
                                zece2 = true;
                            }
                        }
                    }


                }

                buttoneasy.setVisibility(View.INVISIBLE);
                buttonmedium.setVisibility(View.INVISIBLE);
                buttonhard.setVisibility(View.INVISIBLE);
            }
        });
        play();
    }

    public int scor = 0, easyc = 0, mediumc = 0, hardc = 0, stop = 0;

    public void play(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 1 || easy2 == 1 || easy3 == 1 || easy4 == 1 || easy5 == 1 || easy6 == 1) {
                        button.setText("o");
                        button.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 1 || easy2 == 1 || easy3 == 1 || easy4 == 1 || easy5 == 1 || easy6 == 1 || medium7 == 1) {
                        button.setText("o");
                        button.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 1 || easy2 == 1 || easy3 == 1 || easy4 == 1 || easy5 == 1 || easy6 == 1 || medium7 == 1 || hard8 == 1) {
                        button.setText("o");
                        button.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 2 || easy2 == 2 || easy3 == 2 || easy4 == 2 || easy5 == 2 || easy6 == 2) {
                        button2.setText("o");
                        button2.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 2 || easy2 == 2 || easy3 == 2 || easy4 == 2 || easy5 == 2 || easy6 == 2 || medium7 == 2) {
                        button2.setText("o");
                        button2.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 2 || easy2 == 2 || easy3 == 2 || easy4 == 2 || easy5 == 2 || easy6 == 2 || medium7 == 2 || hard8 == 2) {
                        button2.setText("o");
                        button2.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 3 || easy2 == 3 || easy3 == 3 || easy4 == 3 || easy5 == 3 || easy6 == 3) {
                        button3.setText("o");
                        button3.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 3 || easy2 == 3 || easy3 == 3 || easy4 == 3 || easy5 == 3 || easy6 == 3 || medium7 == 3) {
                        button3.setText("o");
                        button3.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 3 || easy2 == 3 || easy3 == 3 || easy4 == 3 || easy5 == 3 || easy6 == 3 || medium7 == 3 || hard8 == 3) {
                        button3.setText("o");
                        button3.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 4 || easy2 == 4 || easy3 == 4 || easy4 == 4 || easy5 == 4 || easy6 == 4) {
                        button4.setText("o");
                        button4.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 4 || easy2 == 4 || easy3 == 4 || easy4 == 4 || easy5 == 4 || easy6 == 4 || medium7 == 4) {
                        button4.setText("o");
                        button4.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 4 || easy2 == 4 || easy3 == 4 || easy4 == 4 || easy5 == 4 || easy6 == 4 || medium7 == 4 || hard8 == 4) {
                        button4.setText("o");
                        button4.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 5 || easy2 == 5 || easy3 == 5 || easy4 == 5 || easy5 == 5 || easy6 == 5) {
                        button5.setText("o");
                        button5.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 5 || easy2 == 5 || easy3 == 5 || easy4 == 5 || easy5 == 5 || easy6 == 5 || medium7 == 5) {
                        button5.setText("o");
                        button5.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 5 || easy2 == 5 || easy3 == 5 || easy4 == 5 || easy5 == 5 || easy6 == 5 || medium7 == 5 || hard8 == 5) {
                        button5.setText("o");
                        button5.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 6 || easy2 == 6 || easy3 == 6 || easy4 == 6 || easy5 == 6 || easy6 == 6) {
                        button6.setText("o");
                        button6.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 6 || easy2 == 6 || easy3 == 6 || easy4 == 6 || easy5 == 6 || easy6 == 6 || medium7 == 6) {
                        button6.setText("o");
                        button6.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 6 || easy2 == 6 || easy3 == 6 || easy4 == 6 || easy5 == 6 || easy6 == 6 || medium7 == 6 || hard8 == 6) {
                        button6.setText("o");
                        button6.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 7 || easy2 == 7 || easy3 == 7 || easy4 == 7 || easy5 == 7 || easy6 == 7) {
                        button7.setText("o");
                        button7.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 7 || easy2 == 7 || easy3 == 7 || easy4 == 7 || easy5 == 7 || easy6 == 7 || medium7 == 7) {
                        button7.setText("o");
                        button7.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 7 || easy2 == 7 || easy3 == 7 || easy4 == 7 || easy5 == 7 || easy6 == 7 || medium7 == 7 || hard8 == 7) {
                        button7.setText("o");
                        button7.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 8 || easy2 == 8 || easy3 == 8 || easy4 == 8 || easy5 == 8 || easy6 == 8) {
                        button8.setText("o");
                        button8.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 8 || easy2 == 8 || easy3 == 8 || easy4 == 8 || easy5 == 8 || easy6 == 8 || medium7 == 8) {
                        button8.setText("o");
                        button8.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 8 || easy2 == 8 || easy3 == 8 || easy4 == 8 || easy5 == 8 || easy6 == 8 || medium7 == 8 || hard8 == 8) {
                        button8.setText("o");
                        button8.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 9 || easy2 == 9 || easy3 == 9 || easy4 == 9 || easy5 == 9 || easy6 == 9) {
                        button9.setText("o");
                        button9.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 9 || easy2 == 9 || easy3 == 9 || easy4 == 9 || easy5 == 9 || easy6 == 9 || medium7 == 9) {
                        button9.setText("o");
                        button9.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 9 || easy2 == 9 || easy3 == 9 || easy4 == 9 || easy5 == 9 || easy6 == 9 || medium7 == 9 || hard8 == 9) {
                        button9.setText("o");
                        button9.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 10 || easy2 == 10 || easy3 == 10 || easy4 == 10 || easy5 == 10 || easy6 == 10) {
                        button10.setText("o");
                        button10.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 10 || easy2 == 10 || easy3 == 10 || easy4 == 10 || easy5 == 10 || easy6 == 10 || medium7 == 10) {
                        button10.setText("o");
                        button10.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 10 || easy2 == 10 || easy3 == 10 || easy4 == 10 || easy5 == 10 || easy6 == 10 || medium7 == 10 || hard8 == 10) {
                        button10.setText("o");
                        button10.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 11 || easy2 == 11 || easy3 == 11 || easy4 == 11 || easy5 == 11 || easy6 == 11) {
                        button11.setText("o");
                        button11.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 11 || easy2 == 11 || easy3 == 11 || easy4 == 11 || easy5 == 11 || easy6 == 11 || medium7 == 11) {
                        button11.setText("o");
                        button11.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 11 || easy2 == 11 || easy3 == 11 || easy4 == 11 || easy5 == 11 || easy6 == 11 || medium7 == 11 || hard8 == 11) {
                        button11.setText("o");
                        button11.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 12 || easy2 == 12 || easy3 == 12 || easy4 == 12 || easy5 == 12 || easy6 == 12) {
                        button12.setText("o");
                        button12.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 12 || easy2 == 12 || easy3 == 12 || easy4 == 12 || easy5 == 12 || easy6 == 12 || medium7 == 12) {
                        button12.setText("o");
                        button12.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 12 || easy2 == 12 || easy3 == 12 || easy4 == 12 || easy5 == 12 || easy6 == 12 || medium7 == 12 || hard8 == 12) {
                        button12.setText("o");
                        button12.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 13 || easy2 == 13 || easy3 == 13 || easy4 == 13 || easy5 == 13 || easy6 == 13) {
                        button13.setText("o");
                        button13.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 13 || easy2 == 13 || easy3 == 13 || easy4 == 13 || easy5 == 13 || easy6 == 13 || medium7 == 13) {
                        button13.setText("o");
                        button13.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 13 || easy2 == 13 || easy3 == 13 || easy4 == 13 || easy5 == 13 || easy6 == 13 || medium7 == 13 || hard8 == 13) {
                        button13.setText("o");
                        button13.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 14 || easy2 == 14 || easy3 == 14 || easy4 == 14 || easy5 == 14 || easy6 == 14) {
                        button14.setText("o");
                        button14.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 14 || easy2 == 14 || easy3 == 14 || easy4 == 14 || easy5 == 14 || easy6 == 14 || medium7 == 14) {
                        button14.setText("o");
                        button14.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 14 || easy2 == 14 || easy3 == 14 || easy4 == 14 || easy5 == 14 || easy6 == 14 || medium7 == 14 || hard8 == 14) {
                        button14.setText("o");
                        button14.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 15 || easy2 == 15 || easy3 == 15 || easy4 == 15 || easy5 == 15 || easy6 == 15) {
                        button15.setText("o");
                        button15.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 15 || easy2 == 15 || easy3 == 15 || easy4 == 15 || easy5 == 15 || easy6 == 15 || medium7 == 15) {
                        button15.setText("o");
                        button15.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 15 || easy2 == 15 || easy3 == 15 || easy4 == 15 || easy5 == 15 || easy6 == 15 || medium7 == 15 || hard8 == 15) {
                        button15.setText("o");
                        button15.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 16 || easy2 == 16 || easy3 == 16 || easy4 == 16 || easy5 == 16 || easy6 == 16) {
                        button16.setText("o");
                        button16.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 16 || easy2 == 16 || easy3 == 16 || easy4 == 16 || easy5 == 16 || easy6 == 16 || medium7 == 16) {
                        button16.setText("o");
                        button16.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 16 || easy2 == 16 || easy3 == 16 || easy4 == 16 || easy5 == 16 || easy6 == 16 || medium7 == 16 || hard8 == 16) {
                        button16.setText("o");
                        button16.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 17 || easy2 == 17 || easy3 == 17 || easy4 == 17 || easy5 == 17 || easy6 == 17) {
                        button17.setText("o");
                        button17.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 17 || easy2 == 17 || easy3 == 17 || easy4 == 17 || easy5 == 17 || easy6 == 17 || medium7 == 17) {
                        button17.setText("o");
                        button17.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 17 || easy2 == 17 || easy3 == 17 || easy4 == 17 || easy5 == 17 || easy6 == 17 || medium7 == 17 || hard8 == 17) {
                        button17.setText("o");
                        button17.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 18 || easy2 == 18 || easy3 == 18 || easy4 == 18 || easy5 == 18 || easy6 == 18) {
                        button18.setText("o");
                        button18.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 18 || easy2 == 18 || easy3 == 18 || easy4 == 18 || easy5 == 18 || easy6 == 18 || medium7 == 18) {
                        button18.setText("o");
                        button18.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 18 || easy2 == 18 || easy3 == 18 || easy4 == 18 || easy5 == 18 || easy6 == 18 || medium7 == 18 || hard8 == 18) {
                        button18.setText("o");
                        button18.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 19 || easy2 == 19 || easy3 == 19 || easy4 == 19 || easy5 == 19 || easy6 == 19) {
                        button19.setText("o");
                        button19.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 19 || easy2 == 19 || easy3 == 19 || easy4 == 19 || easy5 == 19 || easy6 == 19 || medium7 == 19) {
                        button19.setText("o");
                        button19.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 19 || easy2 == 19 || easy3 == 19 || easy4 == 19 || easy5 == 19 || easy6 == 19 || medium7 == 19 || hard8 == 19) {
                        button19.setText("o");
                        button19.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 20 || easy2 == 20 || easy3 == 20 || easy4 == 20 || easy5 == 20 || easy6 == 20) {
                        button20.setText("o");
                        button20.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 20 || easy2 == 20 || easy3 == 20 || easy4 == 20 || easy5 == 20 || easy6 == 20 || medium7 == 20) {
                        button20.setText("o");
                        button20.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 20 || easy2 == 20 || easy3 == 20 || easy4 == 20 || easy5 == 20 || easy6 == 20 || medium7 == 20 || hard8 == 20) {
                        button20.setText("o");
                        button20.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 21 || easy2 == 21 || easy3 == 21 || easy4 == 21 || easy5 == 21 || easy6 == 21) {
                        button21.setText("o");
                        button21.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 21 || easy2 == 21 || easy3 == 21 || easy4 == 21 || easy5 == 21 || easy6 == 21 || medium7 == 21) {
                        button21.setText("o");
                        button21.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 21 || easy2 == 21 || easy3 == 21 || easy4 == 21 || easy5 == 21 || easy6 == 21 || medium7 == 21 || hard8 == 21) {
                        button21.setText("o");
                        button21.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 22 || easy2 == 22 || easy3 == 22 || easy4 == 22 || easy5 == 22 || easy6 == 22) {
                        button22.setText("o");
                        button22.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 22 || easy2 == 22 || easy3 == 22 || easy4 == 22 || easy5 == 22 || easy6 == 22 || medium7 == 22) {
                        button22.setText("o");
                        button22.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 22 || easy2 == 22 || easy3 == 22 || easy4 == 22 || easy5 == 22 || easy6 == 22 || medium7 == 22 || hard8 == 22) {
                        button22.setText("o");
                        button22.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 23 || easy2 == 23 || easy3 == 23 || easy4 == 23 || easy5 == 23 || easy6 == 23) {
                        button23.setText("o");
                        button23.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 23 || easy2 == 23 || easy3 == 23 || easy4 == 23 || easy5 == 23 || easy6 == 23 || medium7 == 23) {
                        button23.setText("o");
                        button23.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 23 || easy2 == 23 || easy3 == 23 || easy4 == 23 || easy5 == 23 || easy6 == 23 || medium7 == 23 || hard8 == 23) {
                        button23.setText("o");
                        button23.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 24 || easy2 == 24 || easy3 == 24 || easy4 == 24 || easy5 == 24 || easy6 == 24) {
                        button24.setText("o");
                        button24.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 24 || easy2 == 24 || easy3 == 24 || easy4 == 24 || easy5 == 24 || easy6 == 24 || medium7 == 24) {
                        button24.setText("o");
                        button24.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 24 || easy2 == 24 || easy3 == 24 || easy4 == 24 || easy5 == 24 || easy6 == 24 || medium7 == 24 || hard8 == 24) {
                        button24.setText("o");
                        button24.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 25 || easy2 == 25 || easy3 == 25 || easy4 == 25 || easy5 == 25 || easy6 == 25) {
                        button25.setText("o");
                        button25.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 25 || easy2 == 25 || easy3 == 25 || easy4 == 25 || easy5 == 25 || easy6 == 25 || medium7 == 25) {
                        button25.setText("o");
                        button25.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 25 || easy2 == 25 || easy3 == 25 || easy4 == 25 || easy5 == 25 || easy6 == 25 || medium7 == 25 || hard8 == 25) {
                        button25.setText("o");
                        button25.setEnabled(false);
                        mediumc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 26 || easy2 == 26 || easy3 == 26 || easy4 == 26 || easy5 == 26 || easy6 == 26) {
                        button26.setText("o");
                        button26.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 26 || easy2 == 26 || easy3 == 26 || easy4 == 26 || easy5 == 26 || easy6 == 26 || medium7 == 26) {
                        button26.setText("o");
                        button26.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 26 || easy2 == 26 || easy3 == 26 || easy4 == 26 || easy5 == 26 || easy6 == 26 || medium7 == 26 || hard8 == 26) {
                        button26.setText("o");
                        button26.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 27 || easy2 == 27 || easy3 == 27 || easy4 == 27 || easy5 == 27 || easy6 == 27) {
                        button27.setText("o");
                        button27.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 27 || easy2 == 27 || easy3 == 27 || easy4 == 27 || easy5 == 27 || easy6 == 27 || medium7 == 27) {
                        button27.setText("o");
                        button27.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 27 || easy2 == 27 || easy3 == 27 || easy4 == 27 || easy5 == 27 || easy6 == 27 || medium7 == 27 || hard8 == 27) {
                        button27.setText("o");
                        button27.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 28 || easy2 == 28 || easy3 == 28 || easy4 == 28 || easy5 == 28 || easy6 == 28) {
                        button28.setText("o");
                        button28.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 28 || easy2 == 28 || easy3 == 28 || easy4 == 28 || easy5 == 28 || easy6 == 28 || medium7 == 28) {
                        button28.setText("o");
                        button28.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 28 || easy2 == 28 || easy3 == 28 || easy4 == 28 || easy5 == 28 || easy6 == 28 || medium7 == 28 || hard8 == 28) {
                        button28.setText("o");
                        button28.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 29 || easy2 == 29 || easy3 == 29 || easy4 == 29 || easy5 == 29 || easy6 == 29) {
                        button29.setText("o");
                        button29.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 29 || easy2 == 29 || easy3 == 29 || easy4 == 29 || easy5 == 29 || easy6 == 29 || medium7 == 29) {
                        button29.setText("o");
                        button29.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 29 || easy2 == 29 || easy3 == 29 || easy4 == 29 || easy5 == 29 || easy6 == 29 || medium7 == 29 || hard8 == 29) {
                        button29.setText("o");
                        button29.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1) {
                if(easy_flag == 1){
                    if (easy1 == 30 || easy2 == 30 || easy3 == 30 || easy4 == 30 || easy5 == 30 || easy6 == 30) {
                        button30.setText("o");
                        button30.setEnabled(false);
                        easyc++;
                        if(easyc == 6){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(medium_flag == 1){
                    if (easy1 == 30 || easy2 == 30 || easy3 == 30 || easy4 == 30 || easy5 == 30 || easy6 == 30 || medium7 == 30) {
                        button30.setText("o");
                        button30.setEnabled(false);
                        mediumc++;
                        if(mediumc == 7) {
                            scor += 10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
                else if(hard_flag == 1){
                    if (easy1 == 30 || easy2 == 30 || easy3 == 30 || easy4 == 30 || easy5 == 30 || easy6 == 30 || medium7 == 30 || hard8 == 30) {
                        button30.setText("o");
                        button30.setEnabled(false);
                        hardc++;
                        if(hardc == 8){
                            scor +=10;
                            enable_false();
                        }
                        textview2.setText(String.valueOf(scor));
                    }
                    else {
                        stop++;
                        if(stop==3){
                            textview3.setText("Sorry, try again!");
                            scor = 0;
                        }
                    }
                }
            }
        });

        textview2.setText(String.valueOf(easyc));
    }
}




