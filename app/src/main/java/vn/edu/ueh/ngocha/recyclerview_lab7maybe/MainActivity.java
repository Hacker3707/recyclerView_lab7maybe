package vn.edu.ueh.ngocha.recyclerview_lab7maybe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button btnLoad;

    List countryList = new ArrayList();

    View.OnClickListener onclickLoad = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);
        btnLoad = findViewById(R.id.btnLoad);

        countryList.add("Vietnam");
        countryList.add("Japan");
        countryList.add("China");
        countryList.add("USA");
        countryList.add("UK");
        countryList.add("Napal");
        countryList.add("Thailand");
        countryList.add("India");

        btnLoad.setOnClickListener( view -> {
             MyAdapter myadpt = new MyAdapter(view.getContext(), countryList);
             recyclerView.setLayoutManager(
                     new LinearLayoutManager(this)
             );
             recyclerView.setAdapter(myadpt);
        });
    }
}