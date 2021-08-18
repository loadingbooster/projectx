package com.px.track.projectx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class searchadapter extends RecyclerView.Adapter<searchadapter.Viewholdersearch>{

    private ArrayList<String> url;
    private ArrayList<String> namelist;
    private ArrayList<String> dislist;
    private ArrayList<String> pricelist;
    private Context searchcontext;

    public searchadapter(ArrayList<String> namelist, ArrayList<String> pricelist, ArrayList<String> dislist, ArrayList<String> url, Context searchContext) {
        this.namelist = namelist;
        this.pricelist = pricelist;
        this.dislist = dislist;
        this.url = url;
        searchcontext = searchContext;
    }
    @NonNull
    @Override
    public Viewholdersearch onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitemproduct,parent,false);
       Viewholdersearch holder = new Viewholdersearch(view);
       return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholdersearch holder, int position) {
        holder.name.setText(namelist.get(position));
        holder.price.setText(pricelist.get(position));
        holder.dis.setText(dislist.get(position));
    }

    @Override
    public int getItemCount() {
        return namelist.size();
    }

    public class Viewholdersearch extends RecyclerView.ViewHolder {
        ImageView prodimage;
        TextView name;
        TextView price;
        TextView dis;
        RelativeLayout searchresult;
        public Viewholdersearch(@NonNull View itemView) {
            super(itemView);

            prodimage = itemView.findViewById(R.id.prodimage);
            name = itemView.findViewById(R.id.prodname);
            price = itemView.findViewById(R.id.prodprice);
            dis = itemView.findViewById(R.id.proddiscip);
            searchresult = itemView.findViewById(R.id.searccard);
        }
    }
}
