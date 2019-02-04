package tcs.com.javarecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListNamesAdpter extends RecyclerView.Adapter<ListNamesAdpter.UserItemView> {
    private String[] listDataSet;
    public ListNamesAdpter(String[] data){
        listDataSet = data;
    }
    @NonNull
    @Override
    public UserItemView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.user_item_view, null, false);
        return new UserItemView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserItemView userItemView, int index) {
        userItemView.txtTitleName.setText(listDataSet[index]);
    }

    @Override
    public int getItemCount() {
        return listDataSet.length;
    }

    public class UserItemView extends RecyclerView.ViewHolder{
        TextView txtTitleName;
        public UserItemView(@NonNull View itemView) {
            super(itemView);
            txtTitleName = itemView.findViewById(R.id.txtTitleName);
        }
    }
}
