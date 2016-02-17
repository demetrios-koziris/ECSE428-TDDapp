package ecse428.postalratecalculator;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mLength;
    private EditText mWidth;
    private EditText mThickness;
    private EditText mWeight;

    private int checkedDest;
    private int checkedItem;

    // Keep track of whether registering has been cancelled
    private boolean cancel = false;
    private View focusView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLength = (EditText)findViewById(R.id.textLength);
        mWidth = (EditText)findViewById(R.id.textWidth);
        mThickness = (EditText)findViewById(R.id.textThickness);
        mWeight = (EditText)findViewById(R.id.textWeight);

        RadioGroup destRadio = (RadioGroup)findViewById(R.id.radioDest);
        RadioGroup itemRadio = (RadioGroup)findViewById(R.id.radioItem);

        checkedDest = destRadio.getCheckedRadioButtonId();
        checkedItem = itemRadio.getCheckedRadioButtonId();

        Button calcButton = (Button) findViewById(R.id.calcpostage);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });
    }

    private void validate() {
        // Reset errors.
        mWeight.setError(null);
        mThickness.setError(null);
        mWidth.setError(null);
        mLength.setError(null);

        final String weight = mWeight.getText().toString();
        final String length = mLength.getText().toString();
        final String thickness = mThickness.getText().toString();
        final String width = mWidth.getText().toString();

        // Do validation here.
        // check if empty
        if (TextUtils.isEmpty(weight)) {
            mWeight.setError(getString(R.string.weight_req));
            focusView = mWeight;
            cancel = true;
        }
        if (TextUtils.isEmpty(thickness)) {
            mThickness.setError(getString(R.string.thickness_req));
            focusView = mThickness;
            cancel = true;
        }
        if (TextUtils.isEmpty(width)) {
            mWidth.setError(getString(R.string.width_req));
            focusView = mWidth;
            cancel = true;
        }
        if (TextUtils.isEmpty(length)) {
            mLength.setError(getString(R.string.length_req));
            focusView = mLength;
            cancel = true;
        }

        if (cancel) {
            cancel = false;
            focusView.requestFocus();
        } else {
            // do stuff
            // call other function to do actual stuff
        }


        // After validation done, populate Postal object.
    }
}
