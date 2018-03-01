package bernhardt.flooringcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class calcResult extends AppCompatActivity {

    TextView tvResult;
    Double length, width, area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_result);

        tvResult = (TextView) findViewById(R.id.tvResult);

        //Get data from parent activity and calculate area
        Bundle extras = getIntent().getExtras();
        width = Double.parseDouble(extras.getString("width"));
        length = Double.parseDouble(extras.getString("length"));
        area = width * length;

        //Display result
        tvResult.setText("The width is " + width + " and the length is " + length +
                " and the flooring needed is " + area);
    }
}
