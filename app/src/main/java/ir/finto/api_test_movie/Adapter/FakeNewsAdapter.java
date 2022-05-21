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

import ir.finto.api_test_movie.Model.FakeNews;
import ir.finto.api_test_movie.Model.News;
import ir.finto.api_test_movie.R;

public class FakeNewsAdapter extends RecyclerView.Adapter<FakeNewsAdapter.MyViewHolder> {

    Context context;
    List<FakeNews> data;

    public FakeNewsAdapter(Context context, List<FakeNews> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_fake_news, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtFakeNewsTitle.setText(data.get(position).getTitle());
        holder.txtFakeNewsDescription.setText(data.get(position).getDescription());
        holder.txtAuthor.setText(data.get(position).getAuthor());
        holder.txtPublishDate.setText(data.get(position).getPublishedAt());
        Picasso.get().load(data.get(position).getUrlToImage()).into(holder.imgFakeNewsUrlToImage);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtFakeNewsTitle, txtFakeNewsDescription,txtAuthor,txtPublishDate;
        ImageView imgFakeNewsUrlToImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtFakeNewsTitle = itemView.findViewById(R.id.txt_FakeNewsTitle);
            txtFakeNewsDescription = itemView.findViewById(R.id.txt_FakeNewsDescription);
            txtAuthor = itemView.findViewById(R.id.txt_Author);
            txtPublishDate = itemView.findViewById(R.id.txt_PublishDate);
            imgFakeNewsUrlToImage = itemView.findViewById(R.id.img_FakeNewsUrlToImage);
        }
    }
}
