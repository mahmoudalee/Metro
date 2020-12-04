package com.alee.metro;

import androidx.appcompat.app.AppCompatActivity;

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

    Spinner from,to;
    TextView tv;

    ArrayList<String> itemsfrom=new ArrayList<>();
    ArrayList<String> itemsto=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        from=findViewById(R.id.from);
        to=findViewById(R.id.to);
        tv=findViewById(R.id.tvd);

        //items.clear();
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


    }


    public void cal(View view) {
        int number=0;

        ArrayList<String> line11=new ArrayList<>();
        ArrayList<String> line22=new ArrayList<>();
        ArrayList<String> line33=new ArrayList<>();

        StringBuilder direction=new StringBuilder();
        StringBuilder stationes=new StringBuilder();








        String namefrist =from.getSelectedItem().toString();



        String namesecond =to.getSelectedItem().toString();

        Toast.makeText(this, namefrist +" "+namesecond, Toast.LENGTH_LONG).show();




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
        Toast.makeText(this, first +" "+last, Toast.LENGTH_LONG).show();
        Toast.makeText(this, k.size() +" "+c.size(), Toast.LENGTH_LONG).show();

        String[] hh={"العتبه","الشهداء","السادات"};
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

                // Collections.addAll(line11,k.subList(first, m + 1));
                for (String s1 : k.subList(first, m + 1)) {
                    line11.add(s1);
                }


                direction.append(k.get(k.size()-1));




            } else {
                //Collections.addAll(Arrays.asList(line11.toArray()),k.subList(m, first + 1));
                for (int i = first+1; i >=m ; i--) {
                    //line11.add(k.get(i));
                }
                for (String s1 : k.subList(m, first + 1)) {
                    line11.add(s1);
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
                    //Collections.addAll(Arrays.asList(line33.toArray()),goodline22.subList(mm, atba));
                    for (String s1 : goodline22.subList(mm, atba)) {
                        line33.add(s1);
                    }

                    direction.append(goodline22.get(goodline22.size()-1));

                } else {


                    //Collections.addAll(Arrays.asList(line33.toArray()),goodline22.subList(atba, mm+1));
                    for (int i = mm+1; i >= atba; i--) {
                        //line33.add(goodline22.get(i));
                    }
                    for (String s1 : goodline22.subList(atba, mm+1)) {
                        line33.add(s1);
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

            System.out.println(c.indexOf(namesecond));
            if (m2 > first) {

                //Collections.addAll(Arrays.asList(line22.toArray()),c.subList(last, m2 + 1));
                for (String s1 : c.subList(last, m2 + 1)) {
                    line22.add(s1);
                }

                direction.append(c.get(c.size()-1));


            } else {
                //Collections.addAll(Arrays.asList(line22.toArray()),c.subList(m2, last + 1));
                for (int i = last + 1; i >=m2 ; i--) {
                    line22.add(c.get(i));

                }
                for (String s1 : c.subList(m2, last + 1)) {
                    //line22.add(s1);
                }


                direction.append(c.get(0));

            }


            number+=line22.size()-1;


        }else {
            if (first==last) {
                System.out.println("entre another station");
            }
            else if (first>last) {

                direction.append("go to direction").append(c.get(0));
                for (int i = first+1; i >=last ; i--) {
                    goodline11.add(c.get(i));
                }
                number=c.subList(last,first+1).size();
            }else {
                direction.append("go to direction").append(c.get(c.size()-1));
                for (String s : c.subList(first, last+1)) {
                    line11.add(s);
                }
                number=c.subList(first,last+1).size();



            }

        }

        // String[] line11=line1.split(",");
        // String[] line22=line1.split(",");
        // String[] line33=line1.split(",");



        if (!line33.isEmpty()&&!line11.isEmpty()&&!line22.isEmpty()) {
            //System.out.println("go to line of"+k.get(0).toString()+"and"+k.get(k.size()-1).toString()+"and then go to line "+goodline22.get(0).toString()+"and"+goodline22.get(goodline22.size()-1)+"and then go to line"+c.get(0).toString()+"and"+c.get(c.size()-1).toString());
           // System.out.println(line1 +"and then"+line3+"then"+line2);
            // number=line11.size()+line22.size()+line33.size()-2;
        }else if (!line11.isEmpty()&&!line22.isEmpty()) {
            //System.out.println("go to line of"+k.get(0).toString()+"and"+k.get(k.size()-1).toString()+"and then go to line"+c.get(0).toString()+"and"+c.get(c.size()-1).toString());
           // System.out.println(line1 +"and then"+line2);
            // number=line11.size()+line22.size()-1;

        }
        else if (!line11.isEmpty()) {
            // number=line11.size();
            //System.out.println("go to line of"+k.get(0)+"and"+k.get(k.size()-1));
            //System.out.println(line1);

        }
        //System.out.println(stationes.toString()+">>>");
        tv.setText(direction.toString());
        tv.append("\n"+line11.toString());
        tv.append("\n"+line33.toString());
        tv.append("\n"+line22.toString());
        tv.append("\nthe time is"+number*2);


        if (number < 9)
            tv.append("\nThe ticket =5LE");
        else if (number > 9 && number < 15)
            tv.append("\nThe ticket =7LE");
        else
            tv.append("\nThe ticket =10LE");



    }
}