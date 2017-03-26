package program.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button plusAnswer;
    Button minusAnswer;
    Button startTest;

    TextView question;
    TextView title;
    TextView description;

    CardView cardView;

    int idd = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = (CardView) findViewById(R.id.cardView);

        description = (TextView) findViewById(R.id.Description);
        question = (TextView) findViewById(R.id.Question);
        title = (TextView) findViewById(R.id.Title);

        plusAnswer = (Button) findViewById(R.id.PlusAnswer);
        plusAnswer.setOnClickListener(this);
        minusAnswer = (Button) findViewById(R.id.MinusAnswer);
        minusAnswer.setOnClickListener(this);
        startTest = (Button) findViewById(R.id.StartTest);
        startTest.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AsyncHttpClient client = new AsyncHttpClient();
        RequestParams params = new RequestParams();
        params.put("question", Question.setText().toString());

        switch (v.getId()) {

            case R.id.StartTest:
                cardView.setVisibility(View.VISIBLE);
                startTest.setVisibility(View.GONE);
                break;
           while (idd<=idd.length){
                switch (v.getId()) {
                    case R.id.PlusAnswer:
                        client.get("http://...", params, new JsonHttpResponseHandler() {


                            @Override
                            public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, JSONObject response) {
                                // super.onSuccess(statusCode, headers, response);

                            }


                            @Override
                            public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, Throwable throwable, JSONArray errorResponse) {
                                // super.onFailure(statusCode, headers, throwable, errorResponse);
                            }
                        });
                        idd=idd+1;
                        break;
                    case R.id.MinusAnswer:
                        client.get("http://...", params, new JsonHttpResponseHandler() {


                            @Override
                            public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, JSONObject response) {
                                // super.onSuccess(statusCode, headers, response);

                            }


                            @Override
                            public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, Throwable throwable, JSONArray errorResponse) {
                                // super.onFailure(statusCode, headers, throwable, errorResponse);
                            }
                        });
                        idd=idd+2;
                        break;
                }
            }
        }
    }
}
