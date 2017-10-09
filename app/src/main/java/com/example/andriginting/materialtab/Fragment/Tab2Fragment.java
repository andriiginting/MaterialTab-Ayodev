package com.example.andriginting.materialtab.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.andriginting.materialtab.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2Fragment extends Fragment {

    private Button tombol;
    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_tab2,container,false);
        tombol=(Button)view.findViewById(R.id.tmbl_fragment);
        tombol.setVisibility(View.GONE);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //untuk pindah fragment
//                getFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.frag2, new Tab3Fragment())
//                        .commit();
//                getFragmentManager().popBackStackImmediate();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frag2, new Tab3Fragment())
                        .commit();

                Toast.makeText(getActivity(),"Hallo Andri",Toast.LENGTH_LONG).show();
            }
        });
    }
}
