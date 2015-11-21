package pre.pkh.mobileprogramming01_02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TEST", "oncreate1");
        setContentView(R.layout.activity_main);
        Button bt = (Button)this.findViewById(R.id.btnNew);
        Button bt2 = (Button)this.findViewById(R.id.btnNew2) ;
        Button bt3 = (Button)this.findViewById(R.id.btnNew3) ;

        bt.setOnClickListener(new View.OnClickListener(){
                                   public void onClick(View v) {
                                       Toast.makeText(MainActivity.this.getApplicationContext(), "Click Button1", Toast.LENGTH_LONG).show();
                                   }
                              }
        );

        bt2.setOnClickListener(btnlistener2); //2

            //3 리스너 구현
            ButtonClickListener btnlistener = new ButtonClickListener();
                bt3.setOnClickListener(btnlistener);
    }
    //2 익명 클래스
    View.OnClickListener btnlistener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this.getApplicationContext(), "Click Button2", Toast.LENGTH_LONG).show();
        }
    };

    class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class) ;
            startActivity(intent);
        }
    }

}


