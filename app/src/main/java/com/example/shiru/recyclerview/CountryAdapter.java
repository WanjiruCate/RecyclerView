package com.example.shiru.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public CountryAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }


    @NonNull
    @Override
    public CountryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item,viewGroup,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {

        ListItem listItem = listItems.get(i);



       holder.txtCountry.setText(listItem.getCapitalCity());
        holder.txtCountry.setText(listItem.getCountry());



    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

      private TextView txtCountry;
      private TextView txtCapital;

      private ViewHolder(@NonNull View itemView) {
            super(itemView);


            txtCountry = itemView.findViewById(R.id.country);
            txtCapital = itemView.findViewById(R.id.capitalCity);
        }
    }
}
