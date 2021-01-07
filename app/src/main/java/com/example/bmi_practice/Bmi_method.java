package com.example.bmi_practice;

import android.content.SharedPreferences;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Bmi_method {

    public String compute(String gw, String gh) {
        double return_bmi;
        double value_w = Double.parseDouble( gw );/**型別轉換String>>Double*/
        double value_h = Double.parseDouble( gh );/**型別轉換String>>Double*/

        value_h = value_h / 100;/**身高單位換算公尺*/
        value_h = value_h * value_h;  /**身高的平方*/
        return_bmi = value_w / value_h;/**BMI公式*/
        String string_bmi = Double.toString( return_bmi );

        return string_bmi; /**回傳BMI*/
    }

    public int zero(String gw, String gh) {/** 判斷空值*/

        if (gh.equals( "" ) || gw.equals( "" )) {
            return 1;
        } else {
            return 2;
        }
    }

    public String result(String bmi) {/**BMI診斷結果*/

        double result_a = Double.parseDouble( bmi );

        String x = "default";
        if (result_a < 18.5) {
            x = ("體重過輕");
        } else if (18.5 <= result_a && result_a < 24) {
            x = ("正常範圍");
        } else if (24 <= result_a && result_a < 27) {
            x = ("過    重");
        } else if (27 <= result_a && result_a < 30) {
            x = ("輕度肥胖");
        } else if (30 <= result_a && result_a < 35) {
            x = ("中度肥胖");
        } else if (result_a >= 35) {
            x = ("重度肥胖");
        }
        return x;
    }

}

