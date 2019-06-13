package com.example.pap_desta_vai;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PratoAdapter extends RecyclerView.Adapter<PratoAdapter.PratoViewHolder> {


    private Context mCtx;
    private List<Prato> pratoList;

    public PratoAdapter(Context mCtx, List<Prato> pratoList) {
        this.mCtx = mCtx;
        this.pratoList = pratoList;
    }

    @NonNull
    @Override
    public PratoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = LayoutInflater.from(mCtx).inflate(R.layout.lista, parent, false);
        return new PratoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PratoViewHolder holder, int position) {

        Prato prato = pratoList.get(position);

        holder.textViewName.setText(prato.prato_nome);
        holder.textViewDis.setText(prato.prato_dis);

    }

    @Override
    public int getItemCount() {
        return pratoList.size();
    }

    class PratoViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName, textViewDis;

        public PratoViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.text_view_name);
            textViewDis = itemView.findViewById(R.id.text_view_distrito);

        }
    }
}
