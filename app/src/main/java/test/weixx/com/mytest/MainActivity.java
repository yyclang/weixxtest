package test.weixx.com.mytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener
{

    private Button btn_show_windows;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn_show_windows=findViewById(R.id.btn_show_windows);
        btn_show_windows.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {

            case R.id.btn_show_windows:
                Intent intent = new Intent(this, TestWindowsActivity.class);
                startActivity(intent);
                break;
        }
    }
}
