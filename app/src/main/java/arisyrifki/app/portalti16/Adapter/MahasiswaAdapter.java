package arisyrifki.app.portalti16.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import arisyrifki.app.portalti16.Entity.Mahasiswa;
import arisyrifki.app.portalti16.Holder.MahasiswaHolder;
import arisyrifki.app.portalti16.R;

/**
 * Created by rfkchrl on 11/26/2018.
 */

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaHolder> {

    private List<Mahasiswa> mahasiswas = new ArrayList<>();

    public MahasiswaAdapter(List<Mahasiswa> mahasiswas) {

        this.mahasiswas = mahasiswas;
    }


    @Override
    public MahasiswaHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //source repo umair retrofit
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mahasiswa,parent, false);
         MahasiswaHolder mahasiswaHolder = new MahasiswaHolder(view);

        return mahasiswaHolder;
    }

    @Override
    public void onBindViewHolder(MahasiswaHolder holder, int position) {
        holder.txtnama.setText(mahasiswas.get(position).getName());
        holder.txtnim.setText(mahasiswas.get(position).getNim());

    }

    @Override
    public int getItemCount() {
        return mahasiswas.size();
    }
}