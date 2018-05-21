package com.example.theweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.theweather.db.Province;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        if(prefs.getString("weather",null)!=null){
            Intent intent=new Intent(this,Weatheracitivity.class);
            startActivity(intent);
            finish();
        }
        /*button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Province province=new Province();
                                          province.setProvinceCode(1);
                                          province.setProvinceName("北京");
                                          province.setId(1);
                                          province.save();
        Province province1=new Province();
        province1.setProvinceCode(2);
        province1.setProvinceName("上海");
        province1.setId(2);
        province1.save();
                                          Province province2=new Province();
        province2.setProvinceCode(3);
        province2.setProvinceName("天津");
        province2.setId(3);
        province2.save();
                                          Province province3=new Province();
        province3.setProvinceCode(4);
        province3.setProvinceName("重庆");
        province3.setId(4);
        province3.save();
                                          Province province4=new Province();
        province4.setProvinceCode(5);
        province4.setProvinceName("香港");
        province4.setId(5);
        province4.save();Province province5=new Province();
        province5.setProvinceCode(6);
        province5.setProvinceName("澳门");
        province5.setId(6);
        province5.save();Province province6=new Province();
        province6.setProvinceCode(7);
        province6.setProvinceName("台湾");
        province6.setId(7);
        province6.save();Province province7=new Province();
        province7.setProvinceCode(8);
        province7.setProvinceName("黑龙江");
        province7.setId(8);
        province7.save();Province province8=new Province();
        province8.setProvinceCode(9);
        province8.setProvinceName("吉林");
        province8.setId(9);
        province8.save();Province province9=new Province();
        province9.setProvinceCode(10);
        province9.setProvinceName("辽宁");
        province9.setId(10);
        province9.save();Province province10=new Province();
        province10.setProvinceCode(11);
        province10.setProvinceName("内蒙古");
        province10.setId(11);
        province10.save();Province province11=new Province();
        province11.setProvinceCode(12);
        province11.setProvinceName("河北");
        province11.setId(12);
        province11.save();Province province12=new Province();
        province12.setProvinceCode(13);
        province12.setProvinceName("河南");
        province12.setId(13);
        province12.save();Province province13=new Province();
        province13.setProvinceCode(14);
        province13.setProvinceName("山西");
        province13.setId(14);
        province13.save();Province province14=new Province();
        province14.setProvinceCode(15);
        province14.setProvinceName("山东");
        province14.setId(15);
        province14.save();Province province15=new Province();
        province15.setProvinceCode(15);
        province15.setProvinceName("江苏");
        province15.setId(16);
        province15.save();Province province16=new Province();
        province16.setProvinceCode(17);
        province16.setProvinceName("浙江");
        province16.setId(17);
        province16.save();Province province17=new Province();
        province17.setProvinceCode(18);
        province17.setProvinceName("福建");
        province17.setId(18);
        province17.save();Province province18=new Province();
        province18.setProvinceCode(19);
        province18.setProvinceName("江西");
        province18.setId(19);
        province18.save();Province province19=new Province();
        province19.setProvinceCode(20);
        province19.setProvinceName("安徽");
        province19.setId(20);
        province19.save();Province province20=new Province();
        province20.setProvinceCode(21);
        province20.setProvinceName("湖北");
        province20.setId(21);
        province20.save();Province province21=new Province();
        province21.setProvinceCode(22);
        province21.setProvinceName("湖南");
        province21.setId(22);
        province21.save();Province province22=new Province();
        province22.setProvinceCode(23);
        province22.setProvinceName("广东");
        province22.setId(23);
        province22.save();Province province23=new Province();
        province23.setProvinceCode(24);
        province23.setProvinceName("广西");
        province23.setId(24);
        province23.save();Province province24=new Province();
        province24.setProvinceCode(25);
        province24.setProvinceName("海南");
        province24.setId(25);
        province24.save();Province province25=new Province();
        province25.setProvinceCode(26);
        province25.setProvinceName("贵州");
        province25.setId(26);
        province25.save();Province province26=new Province();
        province26.setProvinceCode(27);
        province26.setProvinceName("云南");
        province26.setId(27);
        province26.save();Province province27=new Province();
        province27.setProvinceCode(28);
        province27.setProvinceName("四川");
        province27.setId(28);
        province27.save();Province province28=new Province();
        province28.setProvinceCode(29);
        province28.setProvinceName("西藏");
        province28.setId(29);
        province28.save();Province province29=new Province();
        province29.setProvinceCode(30);
        province29.setProvinceName("陕西");
        province29.setId(30);
        province29.save();Province province30=new Province();
        province30.setProvinceCode(31);
        province30.setProvinceName("宁夏");
        province30.setId(31);
        province30.save();Province province31=new Province();
        province31.setProvinceCode(32);
        province31.setProvinceName("甘肃");
        province31.setId(32);
        province31.save();Province province32=new Province();
        province32.setProvinceCode(33);
        province32.setProvinceName("青海");
        province32.setId(33);
        province32.save();Province province33=new Province();
        province33.setProvinceCode(34);
        province33.setProvinceName("新疆");
        province33.setId(34);
                                      }
                                  }
        );*/
    }
}
