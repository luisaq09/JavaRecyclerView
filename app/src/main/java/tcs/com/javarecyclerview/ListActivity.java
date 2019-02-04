package tcs.com.javarecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ListActivity extends AppCompatActivity {
    RecyclerView rcvView;
    RecyclerView.Adapter adapterList;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rcvView = findViewById(R.id.rcvList);
        layoutManager = new LinearLayoutManager(this);
        rcvView.setLayoutManager(layoutManager);

        String[] listNames = {"Luisa", "Fiorella", "Romert", "Diego"};

        adapterList = new ListNamesAdpter(listNames);
        rcvView.setAdapter(adapterList);
    }
}
