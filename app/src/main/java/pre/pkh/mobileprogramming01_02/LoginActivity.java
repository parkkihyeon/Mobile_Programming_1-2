package pre.pkh.mobileprogramming01_02;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login);
    }
    public void onNewBtnBack(View v) {
        Log.d("TEST", "BACK!!!");
        finish();
    }
    public void onLoging(View v) {
        EditText id = (EditText)findViewById(R.id.editTextID);
        Toast.makeText(getApplicationContext(), id.getText(), Toast.LENGTH_LONG).show();
    }

}
