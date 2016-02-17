package ecse428.postalratecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements EditText.OnEditorActionListener {

    private EditText mLength;
    private EditText mWidth;
    private EditText mThickness;
    private EditText mWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mLength = (EditText)findViewById(R.id.paramL);
//        mWidth = (EditText)findViewById(R.id.paramWidth);
//        mThickness = (EditText)findViewById(R.id.paramT);
//        mWeight = (EditText)findViewById(R.id.paramWeight);

//        mLength.setOnEditorActionListener(this);
//        mWidth.setOnEditorActionListener(this);
//        mThickness.setOnEditorActionListener(this);
//        mWeight.setOnEditorActionListener(this);

    }

    /**
     * Attempt to register when clicking on Send in the pop up keyboard for email and password and name
     * @param v
     * @param actionId
     * @param event
     * @return
     */
    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        v.setHint("");
        boolean handled = false;
//        if (actionId == R.id.register || actionId == EditorInfo.IME_ACTION_SEND) {
//            attemptRegister();
//            handled = true;
//        }
        return handled;
    }
}
