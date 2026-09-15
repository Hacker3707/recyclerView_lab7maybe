package vn.edu.ueh.ngocha.recyclerview_lab7maybe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    private List countryList;
    LayoutInflater mInflater;

    public MyAdapter(Context context, List list) {
        // lấy layout từ rclv tương ứng
        mInflater = LayoutInflater.from(context);
        this.countryList = list;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = mInflater.inflate(R.layout.country_layout, parent,false);
        CountryViewHolder holder =  new CountryViewHolder(this, v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        // chưa khai báo tường minh list nên trả về tự động là object.
        // dùng (String) để đổi dữ liệu
        String country = (String) countryList.get(position);
        holder.tid.setText((position + 1) + "");
        holder.tcountry.setText(country);
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}
