package arisyrifki.app.portalti16.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import arisyrifki.app.portalti16.Entity.Mahasiswa;
import arisyrifki.app.portalti16.Holder.MahasiswaHolder;

/**
 * Created by rfkchrl on 11/26/2018.
 */

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaHolder> {

    private List<Mahasiswa> mahasiswas;

    public MahasiswaAdapter(List<Mahasiswa> mahasiswas) {
        this.mahasiswas = mahasiswas;
    }

    @Override
    public MahasiswaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MahasiswaHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}