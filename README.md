# Sketch_Programmer_Recitation
## 1. 需求
公司年会要求每个部门出一个节目，我们的界面是小品《三句半》，4个人，每人说一句，奈何台词太长了，故写了个背台词的demo.最终年会10个节目中，获得第二名，很开心。

#### 1.1 apk 下载路径

#### 1.2 源码下载路径

#### 1.3 简单的UI图
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200119205159496.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3N1NzQ5NTIw,size_16,color_FFFFFF,t_70)

## 2. 台词
arrays.xml
```handlebars
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string-array name="actor_name">
        <item>当前角色：甲</item>
        <item>当前角色：乙</item>
        <item>当前角色：丙</item>
        <item>当前角色：丁</item>
    </string-array>

    <string-array name="index_1">
        <item>1.江湖人称</item>
        <item>2.初次来演三句半</item>
        <item>3.今日主题有亮点</item>
        <item>4.读书求学在外地</item>
        <item>5.码农就业压力大</item>
        <item>6.深圳户口忒紧张</item>
        <item>7.程序员，脑洞大</item>
        <item>8.你若借钱程序员</item>
        <item>9.程序写得好</item>
        <item>10.程序写的秒</item>
        <item>11.代码写下千万行</item>
        <item>12.简单易用界面好</item>
        <item>13.半夜还为需求忙</item>
        <item>14.开水泡面管三餐</item>
        <item>15.十年生死两茫茫</item>
        <item>16.常年累月公司住</item>
        <item>17.新知旧识脑里装</item>
        <item>18.终身大事无心管</item>
        <item>19.好不容易有对象</item>
        <item>20.工资一点泪成行</item>
        <item>21.代码一点都不差</item>
        <item>22.年复一年特别忙</item>
        <item>23.每个职业都伟大</item>
        <item>24.今年新春联欢会</item>
        <item>25.心情开朗事事好</item>
        <item>26.精彩节目排着队</item>
    </string-array>

    <string-array name="index_2">
        <item>1.通讯四帅</item>
        <item>2.腿打哆嗦手发颤</item>
        <item>3.诸位关注尝尝鲜</item>
        <item>4.it 民工真不易</item>
        <item>5.海投过后等电话</item>
        <item>6.抓紧时间寄三方</item>
        <item>7.字符代码会说话</item>
        <item>8.超过1000一点点</item>e
        <item>16.代码程序写到吐</item>
        <item>17.编程技术日日强</item>
        <item>18.至今还是单身汉</item>
        <item>19.恋人分别各一方</item>
        <item>20.怎能买起商品房</item>
        <item>21.工资涨得不够花</item>
        <item>22.奔波劳累在他乡</item>
        <item>23.自黑调侃逗大家</item>
        <item>24.喝酒千杯不怕醉</item>
        <item>25.阳光普照财神到</item>
        <item>26.哥几个也很累</item>
    </string-array>

    <string-array name="index_3">
        <item>1.今日高兴</item>
        <item>2.如有雷同你别喊</item>
        <item>3.哥们几个谈什么</item>
        <item>4.面黄饥廋眼呆滞</item>
        <item>5.千呼万唤来offer</item>
        <item>6.所有手续都办妥</item>
        <item>7.埋头苦干不吹嘘</item>
        <item>8.必须凑个好数字</item>
        <item>9.升值加薪快</item>
        <item>10.底薪二万五</item>
        <item>11.管他何时被触发</item>
        <item>12.老板还有新需求</item>
        <item>13.嘴上笑嘻嘻</item>
        <item>14.熬夜熬成大熊猫</item>
        <item>15.程序何时能写完</item>
        <item>16.30还是单身狗</item>
        <item>17.弹出窗口想自杀</item>
        <item>18.相亲网站全注册</item>
        <item>19.奈何真情守不住</item>
        <item>20.一夜涨价20W</item>
        <item>21.人生先定小目标</item>
        <item>22.何时何事最欣慰</item>
        <item>23.改变世界在指尖</item>
        <item>24.管他明年累不累</item>
        <item>25.中了大奖开礼包</item>
        <item>26.下场还要加班去</item>
    </string-array>

    <string-array name="index_4">
        <item>1.开整</item>
        <item>2.谁敢</item>
        <item>3.程序员</item>
        <item>4.还油腻</item>
        <item>5.拿下</item>
        <item>6.棒棒</item>
        <item>7.但脱发</item>
        <item>8.(1024元）</item>
        <item>9.挺好</item>
        <item>10.呵呵笑</item>
        <item>11.不慌</item>
        <item>12.马上要</item>
        <item>13.心理 NMB</item>
        <item>14.黑眼圈</item>
        <item>15.到天亮</item>
        <item>16.麻木</item>
        <item>17.找不到对象</item>
        <item>18.难办</item>
        <item>19.凉凉</item>
        <item>20.又迷茫</item>
        <item>21.做植发</item>
        <item>22.年终奖</item>
        <item>23.牛逼啊</item>
        <item>24.吐完再睡</item>
        <item>25.我靠，香皂</item>
        <item>26.撤退</item>
    </string-array>
</resources>

```
## 3. 调用方法

```handlebars
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

```

