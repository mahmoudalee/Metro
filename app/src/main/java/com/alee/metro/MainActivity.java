package com.alee.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    List<String> goodline11 = Arrays.asList("حلوان", "عين حلوان", "جامعة حلوان", "وادي حوف", "حدائق حلوان", "المعصرة", "طرة الأسمنت", "كوتسيكا", "طرة البلد", " ثكنات المعادي", "المعادي", "حدائق المعادي", "دار السلام", "الزهراء", "مار جرجس", "الملك الصالح", "السيدة زينب", "سعد زغلول", "السادات", "جمال عبد الناصر", "أحمد عرابي", "الشهداء", "غمرة", "الدمرداش", "منشية الصدر", "كوبري القبة", "حمامات القبة", "سراي القبة", "حدائق الزيتون", "حلمية الزيتون", "المطرية", "عين شمس", "عزبة النخل", "المرج", "المرج الجديدة");
    List<String> goodline22 = Arrays.asList("المنيب", "ساقية مكي", "ام المصريين(ضواحى الجيزةسابقا)", "فيصل", "البحوث", "الدقي", "الأوبرا", "السادات", "محمدنجيب", "العتبه", "الشهداء", "مسرة", "روض الفرج", "سانت تريزا", "الخلفاوي", "المظلات", "كليةالزراعة", "شبراالخيمة");
    List<String> goodline33 = Arrays.asList("العتبه", "باب الشعرية", "الجيش", "عبدة باشا", "العباسية", "أرض المعارض", "استادالقاهرة", "كليةالبنات", "الأهرام", "هارون", "ميدان هليوبوليس", "الألف مسكن", "نادي الشمس");
    SharedPreferences pref;
    Spinner from,to;
    TextView tv;

    ArrayList<String> itemsfrom=new ArrayList<>();
    ArrayList<String> itemsto=new ArrayList<>();

    String[] hh={"العتبه","الشهداء","السادات"};


    int number=0;

    ArrayList<String> line11=new ArrayList<>();
    ArrayList<String> line22=new ArrayList<>();
    ArrayList<String> line33=new ArrayList<>();

    StringBuilder direction=new StringBuilder();
    StringBuilder stationes=new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        from=findViewById(R.id.from);
        to=findViewById(R.id.to);
        tv=findViewById(R.id.tvd);


        Collections.addAll(itemsfrom,"please select",
                "حلوان", "عين حلوان", "جامعة حلوان", "وادي حوف", "حدائق حلوان", "المعصرة", "طرة الأسمنت", "كوتسيكا", "طرة البلد", " ثكنات المعادي", "المعادي", "حدائق المعادي", "دار السلام", "الزهراء", "مار جرجس", "الملك الصالح", "السيدة زينب", "سعد زغلول", "السادات", "جمال عبد الناصر", "أحمد عرابي", "الشهداء", "غمرة", "الدمرداش", "منشية الصدر", "كوبري القبة", "حمامات القبة", "سراي القبة", "حدائق الزيتون", "حلمية الزيتون", "المطرية", "عين شمس", "عزبة النخل", "المرج",
                "المرج الجديدة","المنيب", "ساقية مكي", "ام المصريين(ضواحى الجيزةسابقا)", "فيصل", "البحوث", "الدقي", "الأوبرا", "السادات", "محمدنجيب", "العتبه", "الشهداء", "مسرة", "روض الفرج", "سانت تريزا", "الخلفاوي", "المظلات", "كليةالزراعة",
                "شبراالخيمة","العتبه", "باب الشعرية", "الجيش", "عبدة باشا", "العباسية", "أرض المعارض", "استادالقاهرة", "كليةالبنات", "الأهرام", "هارون", "ميدان هليوبوليس", "الألف مسكن", "نادي الشمس");

        Collections.addAll(itemsto,"please select",
                "حلوان", "عين حلوان", "جامعة حلوان", "وادي حوف", "حدائق حلوان", "المعصرة", "طرة الأسمنت", "كوتسيكا", "طرة البلد", " ثكنات المعادي", "المعادي", "حدائق المعادي", "دار السلام", "الزهراء", "مار جرجس", "الملك الصالح", "السيدة زينب", "سعد زغلول", "السادات", "جمال عبد الناصر", "أحمد عرابي", "الشهداء", "غمرة", "الدمرداش", "منشية الصدر", "كوبري القبة", "حمامات القبة", "سراي القبة", "حدائق الزيتون", "حلمية الزيتون", "المطرية", "عين شمس", "عزبة النخل", "المرج",
                "المرج الجديدة","المنيب", "ساقية مكي", "ام المصريين(ضواحى الجيزةسابقا)", "فيصل", "البحوث", "الدقي", "الأوبرا", "السادات", "محمدنجيب", "العتبه", "الشهداء", "مسرة", "روض الفرج", "سانت تريزا", "الخلفاوي", "المظلات", "كليةالزراعة",
                "شبراالخيمة","العتبه", "باب الشعرية", "الجيش", "عبدة باشا", "العباسية", "أرض المعارض", "استادالقاهرة", "كليةالبنات", "الأهرام", "هارون", "ميدان هليوبوليس", "الألف مسكن", "نادي الشمس");



        //step 2 bind items on spinner
        //spinner->adapter->items
        //fill items, pass items to adapter,pass adapter to spinner
        ArrayAdapter adapterfrom=new ArrayAdapter(this, android.R.layout.simple_list_item_1,itemsfrom);
        ArrayAdapter adapterto=new ArrayAdapter(this, android.R.layout.simple_list_item_1,itemsto);
        from.setAdapter(adapterfrom);
        to.setAdapter(adapterto);
        from.setSelection(0);
        from.setSelection(0);


        pref=getPreferences(MODE_PRIVATE);
        String dir=pref.getString("direction","");
        tv.setText(dir);


    }

    @Override
    public void onBackPressed() {
        SharedPreferences.Editor editor=pref.edit();
        editor.putString("direction",tv.getText().toString());
        editor.apply();
        super.onBackPressed();
    }

    public void cal(View view) {









        String namefrist =from.getSelectedItem().toString();



        String namesecond =to.getSelectedItem().toString();






        List<String> k;
        List<String> c;
        if (goodline11.contains(namefrist)) {
            k = goodline11;
        } else if (goodline22.contains(namefrist)) {
            k = goodline22;
        } else {
            k = goodline33;
        }

        if (goodline11.contains(namesecond)) {
            c = goodline11;
        } else if (goodline22.contains(namesecond)) {
            c = goodline22;
        } else {
            c = goodline33;
        }
        int first = k.indexOf(namefrist);

        int last = c.indexOf(namesecond);




        if (k.size() != c.size() ) {


            direction.append("go to line ");
            direction.append(k.get(0)+" and "+k.get(k.size()-1));
            direction.append("direction ");
            int m=-1;
            String mnae="";
            for (int i = 0; i < hh.length; i++) {
                if (k.contains(hh[i])) {
                    if (m==-1){
                        m=k.indexOf(hh[i]);
                        mnae=hh[i];

                    }else if (Math.abs(m-first)>Math.abs(k.indexOf(hh[i])-first)){
                        m=k.indexOf(hh[i]);
                        mnae=hh[i];
                    }


                    if (i == 0) {

                        break;
                    }
                }
            }

            if (m > first) {


                for (String s1 : k.subList(first, m + 1)) {
                    line11.add(s1);
                }


                direction.append(k.get(k.size()-1));




            } else {

                for (int i = first; i >=m ; i--) {
                    line11.add(k.get(i));
                }


                direction.append(k.get(0));

            }
            number+=line11.size();



            String station_name=mnae;
            if (k.contains(hh[0])&&c.contains(hh[1])||k.contains(hh[1])&&c.contains(hh[0])){
                direction.append("then go to line ");
                direction.append(goodline22.get(0)+" and "+goodline22.get(goodline22.size()-1));
                direction.append("direction ");
                int mm = goodline22.indexOf(mnae);

                int atba ;

                if (mnae != hh[0]) {
                    atba = goodline22.indexOf(hh[0]);
                    station_name=hh[0];
                }else {
                    if (Math.abs(k.indexOf(hh[1])-first)<Math.abs(k.indexOf(hh[2])-first)){
                        atba=goodline22.indexOf(hh[1]);
                        station_name=hh[1];


                    }else {
                        atba=goodline22.indexOf(hh[2]);
                        station_name=hh[2];
                    }

                }

                if (atba > mm) {
                    for (String s1 : goodline22.subList(mm, atba+1)) {
                        line33.add(s1);
                    }

                    direction.append(goodline22.get(goodline22.size()-1));

                } else {


                    for (int i = mm; i >= atba; i--) {
                        line33.add(goodline22.get(i));
                    }


                    direction.append(goodline22.get(0));
                }

                number+=line33.size()-1;
                stationes.append(line22.toString());
            }




            direction.append("then go to line ");
            direction.append(c.get(0)).append(" and ").append(c.get(c.size()-1));
            direction.append("direction ");

            int m2 = c.indexOf(station_name);


            if (m2 > last) {
                for (int i = last ; i >=m2 ; i--) {
                    line22.add(c.get(i));

                }


                direction.append(c.get(c.size()-1));


            } else {


                for (String s1 : c.subList(m2, last + 1)) {
                    line22.add(s1);
                }


                direction.append(c.get(0));

            }


            number+=line22.size()-1;


        }else {
            if (first==last) {
                tv.setText("entre another station");
            }
            else if (first>last) {

                direction.append("go to direction ").append(c.get(0));
                for (int i = first; i >=last ; i--) {
                    line11.add(c.get(i));
                }
                number=c.subList(last,first+1).size();
            }else {
                direction.append("go to direction ").append(c.get(c.size()-1));
                for (String s : c.subList(first, last+1)) {
                    line11.add(s);
                }
                number=c.subList(first,last+1).size();



            }

        }





        
        tv.setText(direction.toString());
        tv.append("\n"+line11.toString());
        tv.append("\n"+line33.toString());
        tv.append("\n"+line22.toString());
        tv.append("\nthe time is "+number*2);


        if (number < 9)
            tv.append("\nThe ticket = 5 LE");
        else if (number > 9 && number < 15)
            tv.append("\nThe ticket = 7 LE");
        else
            tv.append("\nThe ticket = 10 LE");


        line11.clear();
        line22.clear();
        line33.clear();
        number=0;
        stationes.delete(0,stationes.length()+1);
        direction.delete(0,direction.length()+1);




    }
}