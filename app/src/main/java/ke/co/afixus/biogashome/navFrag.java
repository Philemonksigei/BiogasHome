package ke.co.afixus.biogashome;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class navFrag extends Fragment {
Button button_whatisBio;
Button button_benefits;
Button button_requiredMaterials;
Button button_howtoSetup;
Button button_pictorials;
Button button_about_us;
Button button_safety;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =   inflater.inflate(R.layout.fragment_nav, container, false);

        button_whatisBio = view.findViewById(R.id.btn_whatis_bio);
        button_benefits = view.findViewById(R.id.btn_benefits);
        button_requiredMaterials = view.findViewById(R.id.btn_required_mat);
        button_howtoSetup = view.findViewById(R.id.btn_howto_setup);
        button_pictorials = view.findViewById(R.id.btn_pictorial_steps);
        button_about_us = view.findViewById(R.id.about_us);
        button_safety = view.findViewById(R.id.btn_safety);

        //try and apply a while loop or switch case
        button_whatisBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main, new what_isFrag());
                ft.commit();
            }
        });

        button_requiredMaterials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main, new materials_frag());
                ft.commit();
            }
        });

        button_safety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main, new safety_frag());
                ft.commit();
            }
        });

        button_howtoSetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main, new seting_up_frag());
                ft.commit();
            }
        });

        button_benefits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main, new benefits_frag());
                ft.commit();
            }
        });

        button_pictorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main, new pictorials_frag());
                ft.commit();
            }
        });

        button_about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main, new about_us_frag());
                ft.commit();
            }
        });

     return view;
    }
}
