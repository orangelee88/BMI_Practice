package com.example.bmi_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText he;
    EditText we;

    public static Context context;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        he = findViewById( R.id.edit1 );/** 把使用者身高資料放到he*/
        we = findViewById( R.id.edit2 );/** 把使用者體重資料放到we*/
        Button button = findViewById( R.id.btn1 );
        button.setOnClickListener( this );

    }

    public void onClick(View V) {  /**按完按鈕後觸發點擊事件*/

        String height = he.getText().toString();/**型別轉換(he)EditText>>String*/
        String weight = we.getText().toString();/**型別轉換(we)EditText>>String*/
        Bmi_method bmi_method = new Bmi_method();/**新增一個物件*/

        int judge = bmi_method.zero( weight, height );/**呼叫bmi_method.zero方法*/

        if (judge == 1) {
            Toast.makeText( MainActivity.this, "欄位空白，請重新輸入", Toast.LENGTH_SHORT ).show();
        } else if (judge == 2) {
            String a = bmi_method.compute( weight, height );/**呼叫bmi_method.compute方法*/
            TextView text_bmi = findViewById( R.id.text_bmi );
            text_bmi.setText( a );
            String b = bmi_method.result( a );/**呼叫**BMI診斷結果方法*/
            TextView text_result = findViewById( R.id.text_result );
            text_result.setText( b );

        }
    }
}