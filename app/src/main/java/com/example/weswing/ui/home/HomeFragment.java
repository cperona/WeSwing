package com.example.weswing.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.weswing.MainActivity;
import com.example.weswing.R;
import com.example.weswing.ui.home.AdapterNovetats;
import com.example.weswing.ui.home.SelectListenerNovetats;
import com.example.weswing.ui.home.Novetats;
import com.example.weswing.ui.mogudes.MoguduesFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements SelectListenerNovetats {
    List<Novetats> novetats;
    RecyclerView novetatsRecycler;
    AdapterNovetats novetatsAdapter;
    Novetats selectedNovetat;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FeedFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        novetatsRecycler = view.findViewById(R.id.recyclerNovetats);
        initRecyclerReview();
        return view;
    }

    public void initRecyclerReview(){
        novetats = new ArrayList<>();
        novetats.add(new Novetats(R.drawable.profile_picture,"Lorem ipsum as asdnd ajnd asdadn asndas","Fa 1h"));
        novetats.add(new Novetats(R.drawable.profile_picture,"Lorem ipsum as asdnd ajnd asdadn asndas ","Fa 3h"));
        novetats.add(new Novetats(R.drawable.profile_picture,"Lorem ipsum as asdnd ajnd asdadn asndas","Fa 7h"));
        novetats.add(new Novetats(R.drawable.profile_picture,"Lorem ipsum as asdnd ajnd asdadn asndas","Fa 7h"));
        novetats.add(new Novetats(R.drawable.profile_picture,"Lorem ipsum as asdnd ajnd asdadn asndas","Fa 9h"));
        novetats.add(new Novetats(R.drawable.profile_picture,"Lorem ipsum as asdnd ajnd asdadn asndas","Fa 21h"));
        novetats.add(new Novetats(R.drawable.profile_picture,"Lorem ipsum as asdnd ajnd asdadn asndas","Fa 22h"));
        novetats.add(new Novetats(R.drawable.profile_picture,"Lorem ipsum as asdnd ajnd asdadn asndas","Fa 23h"));
        novetats.add(new Novetats(R.drawable.profile_picture,"Lorem ipsum as asdnd ajnd asdadn asndas","Fa 23h"));

        novetatsAdapter = new AdapterNovetats(novetats,this);
        novetatsRecycler.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        novetatsRecycler.setHasFixedSize(true);
        novetatsRecycler.setAdapter(novetatsAdapter);
    }

    @Override
    public void onItemClicked(Novetats novetats) {
        selectedNovetat = novetats;
        //que te lleve al otro fragment
        ((MainActivity)getActivity()).replaceFragment(new MoguduesFragment());
    }
}