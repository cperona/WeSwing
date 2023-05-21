package com.example.weswing.ui.mogudes;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.example.weswing.MainActivity;
import com.example.weswing.R;

import kotlinx.coroutines.internal.MainDispatcherFactory;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class MoguduesFragment extends Fragment implements View.OnClickListener {
    View view;
    TextView titol,tipus,data,descripcio;
    Button asistencia;
    CardView cardView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    public void initComponents(){
        cardView = view.findViewById(R.id.cardView);
        titol = view.findViewById(R.id.nomMoguda);
        tipus = view.findViewById(R.id.tipusMoguda);
        descripcio = view.findViewById(R.id.descriptionText);
        data = view.findViewById(R.id.dataMoguda);
        asistencia = view.findViewById(R.id.asistentsButton);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_mogudues, container, false);
        // Inflate the layout for this fragment
        initComponents();
        asistencia.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {

//        ((MainActivity) getActivity()).replaceFragment(new AssistentsFragment());
    }

    @NonNull
    @Override
    public CreationExtras getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }
}