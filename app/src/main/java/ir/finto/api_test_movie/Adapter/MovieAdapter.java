package ir.finto.api_test_movie.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import ir.finto.api_test_movie.Model.Result;
import ir.finto.api_test_movie.R;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    Context context;
    List<Result> data;

    public MovieAdapter(Context context, List<Result> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.txtMovieName.setText(data.get(position).getTitle());
        holder.txtDesc.setText(data.get(position).getOverview());
        Picasso.get().load(data.get(position).getBackdrop_path()).into(holder.imgLogo);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtDesc, txtMovieName;
        ImageView imgLogo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMovieName = itemView.findViewById(R.id.txt_MovieName);
            txtDesc = itemView.findViewById(R.id.txt_Description);
            imgLogo = itemView.findViewById(R.id.img_Logo);
        }
    }
}
