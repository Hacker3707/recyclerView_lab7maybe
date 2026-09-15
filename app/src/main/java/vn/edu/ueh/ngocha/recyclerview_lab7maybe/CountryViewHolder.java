package vn.edu.ueh.ngocha.recyclerview_lab7maybe;

import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder
        extends RecyclerView.ViewHolder
        implements View.OnClickListener {

    public TextView tid;
    public TextView tcountry;
    public MyAdapter adapter;

    public CountryViewHolder(MyAdapter adpter, View itemView) {
        super(itemView);
        this.adapter = adpter;
        this.tid = itemView.findViewById(R.id.tid);
        this.tcountry = itemView.findViewById(R.id.tcountry);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String msg = tid.getText() + "|" + tcountry.getText();
        Toast.makeText(view.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
