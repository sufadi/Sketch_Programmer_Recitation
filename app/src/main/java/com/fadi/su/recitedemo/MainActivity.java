package com.fadi.su.recitedemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static int ACTOR_0 = 0;
    private final static int ACTOR_1 = 1;
    private final static int ACTOR_2 = 2;
    private final static int ACTOR_3 = 3;

    private final static int DEFAULT_ACTOR = ACTOR_1;

    private static int curIndex = 0;
    private static int curActorIndex = 0;
    private String[] list1, list2, list3, list4, actors;

    private TextView tv_show, tv_tip;
    private AppCompatSpinner sp_actor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initValues();
        initListeners();
    }

    private void initViews() {
        tv_show = findViewById(R.id.tv_show);
        tv_tip = findViewById(R.id.tv_tip);
        sp_actor = findViewById(R.id.sp_actor);
    }

    private void initValues() {
        list1 = getResources().getStringArray(R.array.index_1);
        list2 = getResources().getStringArray(R.array.index_2);
        list3 = getResources().getStringArray(R.array.index_3);
        list4 = getResources().getStringArray(R.array.index_4);
        actors = getResources().getStringArray(R.array.actor_name);

        curActorIndex = DEFAULT_ACTOR;
        sp_actor.setSelection(DEFAULT_ACTOR);
    }

    private void initListeners() {
        tv_show.setText(list1[curIndex]);
        tv_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curActorIndex != ACTOR_0) {
                    if(curIndex == list1.length -1) {
                        curIndex = 0;
                    } else {
                        curIndex++;
                    }

                    updateTopText();
                } else {
                    tv_show.setText(list1[curIndex]);
                }
            }
        });

        tv_tip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curActorIndex != ACTOR_0) {
                    updateBottomText();
                } else {
                    if(curIndex == list1.length -1) {
                        curIndex = 0;
                    } else {
                        curIndex++;
                    }

                    tv_show.setText("本句 ???");
                    updateBottomText();
                }
            }
        });

        sp_actor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                curActorIndex = position;
                updateTopText();
                if (curActorIndex != ACTOR_0) {
                    tv_tip.setText("下一句");
                } else {
                    updateBottomText();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        updateUI();
    }

    private void updateUI() {
        updateTopText();
        updateBottomText();
    }

    private void updateTopText() {
        StringBuilder sb = new StringBuilder();

        switch (curActorIndex) {
            case ACTOR_0:
                tv_show.setText("本句 ???");
                break;
            case ACTOR_1:
                tv_show.setText(list1[curIndex]);
                tv_tip.setText("下一句");
                break;
            case ACTOR_2:
                sb.append(list1[curIndex]);
                sb.append("\n");
                sb.append(list2[curIndex]);

                tv_show.setText(sb.toString());
                tv_tip.setText("下一句");
                break;
            case ACTOR_3:
                sb.append(list1[curIndex]);
                sb.append("\n");
                sb.append(list2[curIndex]);
                sb.append("\n");
                sb.append(list3[curIndex]);

                tv_show.setText(sb.toString());
                tv_tip.setText("下一句");
                break;
        }

    }

    private void updateBottomText() {
        StringBuilder sb = new StringBuilder();

        switch (curActorIndex) {
            case ACTOR_0:
                sb.append(list2[curIndex]);
                sb.append("\n");
                sb.append(list3[curIndex]);
                sb.append("\n");
                sb.append(list4[curIndex]);

                tv_tip.setText(sb.toString());
                break;
            case ACTOR_1:
                sb.append(list2[curIndex]);
                sb.append("\n");
                sb.append(list3[curIndex]);
                sb.append("\n");
                sb.append(list4[curIndex]);

                tv_tip.setText(sb.toString());
                break;
            case ACTOR_2:
                sb.append(list3[curIndex]);
                sb.append("\n");
                sb.append(list4[curIndex]);

                tv_tip.setText(sb.toString());
                break;
            case ACTOR_3:
                sb.append(list4[curIndex]);

                tv_tip.setText(sb.toString());
                break;
        }
    }
}
