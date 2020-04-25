package game.t.recycler_view_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adapter adapter;
        RecyclerView recyclerView=findViewById(R.id.recyclerView_1);
        String[] title={"Tommorrow I will be brave","Sleep My bunny","Astronaut Annie","THe Night Knights","Pillowland","Night Night, Jungle",
                    "Harold and The Purple Crayon","Bedtime For Frances","Another Story for Kids"};
        String[] story={"Tomorrow I'll Be Brave by Jessica Hische Journey through the beautifully hand-lettered messages by award-winning illustrator Jessica Hische. This uplifting and positive book encourages kids to promise that tomorrow, they will try new things, do their best, and be brave. \n\nTomorrow I'll be all the things I tried to be today: Adventurous, Strong, Smart, Curious, Creative, Confident, & Brave. And if I wasn't one of them, I know that it's OK. Journey through a world filled with positive and beautifully hand-lettered words of widsom, inspiration, and motivation.\n\nAs this book reminds readers, tomorrow is another day, full of endless opportunities--all you have to do is decide to make the day yours. \n\nJessica Hische, one of the great designers and typographers, now shows herself equally adept at creating gorgeous and immersive images for young readers.\n This is a joyous burst of color.\"--Dave Eggers, author of Her Right Foot"};

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new Adapter(this,title,story);//creating the object adapter from that class;
        recyclerView.setAdapter(adapter);//this sets the variable

    }
}
