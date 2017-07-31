package searchgoogle.android.acadgild.com.googlesearchintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_google);
    }

    public void searchGoogle(View v) {
        EditText searchText = (EditText) findViewById(R.id.txtSearchGoogle);
        String stext = searchText.getText().toString().trim();
        //Toast.makeText(MainActivity.this, (CharSequence) searchText, Toast.LENGTH_LONG).show();
        Uri uri = Uri.parse("http://www.google.com/#q="+stext);
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(googleIntent);
    }
}
