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

import ir.finto.api_test_movie.Model.News;
import ir.finto.api_test_movie.R;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {

    Context context;
    List<News> data;

    public NewsAdapter(Context context, List<News> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_news, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtNewsTitle.setText(data.get(position).getTitle());
        holder.txtNewsSummery.setText(data.get(position).getSummary());
        Picasso.get().load(data.get(position).getMedia()).into(holder.imgNewsLogo);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtNewsTitle, txtNewsSummery;
        ImageView imgNewsLogo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNewsTitle = itemView.findViewById(R.id.txt_NewsTitle);
            txtNewsSummery = itemView.findViewById(R.id.txt_NewsSummery);
            imgNewsLogo = itemView.findViewById(R.id.img_NewsLogo);
        }
    }
}
