package game.t.recycler_view_11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private LayoutInflater inflater;
    private String[] sTitle;
    private String[] sContent;

    Adapter(Context context,String[] title,String[] contents){///kind of getter which get the value from other class
        this.inflater=LayoutInflater.from(context);
        this.sTitle=title;//from here we giver the value of above variable
        this.sContent=contents;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.activity_adapter,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) { /// holder is the object of View Holderniche walla
        holder.storyTitle.setText(sTitle[position]);//this gives this value to the holder class which sets the variable in textfiedl from the position.
                                                    //and here position is like a count which tells the variable name;
        holder.storyContent.setText(sContent[0]);
    }

    @Override
    public int getItemCount() {
        return sTitle.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView storyTitle,storyContent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            storyTitle=itemView.findViewById(R.id.heading);
            storyContent=itemView.findViewById(R.id.content);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(view.getContext(), Details.class);
                    i.putExtra("titleOfStory",sTitle[getAdapterPosition()]);
                    i.putExtra("contentOfStory",sContent[0]);
                    view.getContext().startActivity(i);

                }
            });
        }
    }
}
