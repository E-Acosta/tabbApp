package co.uac.tabapp.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import co.uac.tabapp.R;


public class FragmentTwo extends Fragment {


    private List<String> supplierNames = Arrays.asList("Death note","Naruto","Dragon Ball","Pokemon","Digimon","Evangelion","Tate no Yuusha");
    public FragmentTwo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_two, container, false);
        ListView listView = view.findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(Objects.requireNonNull(getContext()),android.R.layout.simple_list_item_1,supplierNames);
        listView.setAdapter(adapter);
        return view;
    }
}
