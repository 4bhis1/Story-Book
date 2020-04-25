package game.t.recycler_view_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        this.getSupportActionBar().hide();

        TextView tt=findViewById(R.id.textView2);
        TextView cc=findViewById(R.id.textView3);

        Intent i=getIntent();
        String dtitle=i.getStringExtra("titleOfStory");
        String dcontent=i.getStringExtra("contentOfStory");

        tt.setText(dtitle);
        cc.setText(dcontent);
        cc.setMovementMethod(new ScrollingMovementMethod());

    }
}
