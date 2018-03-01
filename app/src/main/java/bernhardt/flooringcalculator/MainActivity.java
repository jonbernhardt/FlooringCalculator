package bernhardt.flooringcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etWidth, etLength;
    Button btnResult;
    String width, length;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWidth = (EditText) findViewById(R.id.etWidth);
        etLength = (EditText) findViewById(R.id.etLength);
        btnResult = (Button) findViewById(R.id.btnResult);


    }

    /**
     * onClick event to send input from user to sub-activity
     * @param view
     */
    public void onButtonClick(View view) {
        width = etWidth.getText().toString();
        length = etLength.getText().toString();
        Intent resultIntent = new Intent(this, calcResult.class);
        resultIntent.putExtra("width", width);
        resultIntent.putExtra("length", length);
        startActivity(resultIntent);
    }
}
