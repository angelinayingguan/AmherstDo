package com.example.angelina.amherstdo;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class EventFragment extends Fragment {
    Button clearBtn;
    ArrayList<User> items;
    ListView listview;
    Button searchBtn;
    TextView searchText;

    /* renamed from: edu.amherst.cs.amhersttodo.TodoFragment.1 */
    class C01821 implements OnClickListener {
        C01821() {
        }

        public void onClick(View v) {
            String filterTxt = EventFragment.this.searchText.getText().toString();
            ArrayList<User> filterList = new ArrayList();
            EventFragment.this.items = EventFragment.this.loadItems();
            for (int i = 0; i < EventFragment.this.items.size(); i++) {
                String title = ((User) EventFragment.this.items.get(i)).getTitle();
                String desc = ((User) EventFragment.this.items.get(i)).getDesc();
                if (title.toLowerCase().indexOf(filterTxt) != -1 || desc.toLowerCase().indexOf(filterTxt) != -1) {
                    filterList.add(EventFragment.this.items.get(i));
                }
            }
            EventFragment.this.listview.setAdapter(new CustomUsersAdapter(EventFragment.this.getActivity(), filterList));
        }
    }

    /* renamed from: edu.amherst.cs.amhersttodo.TodoFragment.2 */
    class C01832 implements OnClickListener {
        C01832() {
        }

        public void onClick(View v) {
            EventFragment.this.searchText.setText(BuildConfig.FLAVOR);
            EventFragment.this.items = EventFragment.this.loadItems();
            EventFragment.this.listview.setAdapter(new CustomUsersAdapter(EventFragment.this.getActivity(), EventFragment.this.items));
        }
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_event, container, false);
        this.listview = (ListView) v.findViewById(R.id.lv);
        this.searchBtn = (Button) v.findViewById(R.id.searchBtn);
        this.clearBtn = (Button) v.findViewById(R.id.clearBtn);
        this.searchText = (TextView) v.findViewById(R.id.searchText);
        this.items = loadItems();
        this.listview.setAdapter(new CustomUsersAdapter(getActivity(), this.items));
        this.searchBtn.setOnClickListener(new C01821());
        this.clearBtn.setOnClickListener(new C01832());
        return v;
    }

    public ArrayList<User> loadItems() {
        this.items = new ArrayList();
        this.items.add(new User("440 econ journal", "due 4.21 night", "Urgent"));
        this.items.add(new User("201 meeting", "meet tonight", "Urgent"));
        this.items.add(new User("310 aper", "write it tonight", "Important"));
        this.items.add(new User("405 cardio", "cardio at 4:05", "Beneficial"));
        return this.items;
    }
}
