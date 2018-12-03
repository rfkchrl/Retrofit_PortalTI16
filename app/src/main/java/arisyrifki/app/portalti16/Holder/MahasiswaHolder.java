package arisyrifki.app.portalti16.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import arisyrifki.app.portalti16.R;

/**
 * Created by rfkchrl on 11/26/2018.
 */

public class MahasiswaHolder extends RecyclerView.ViewHolder {
    public TextView txtnama, txtnim;

    public MahasiswaHolder(View itemView){

        super(itemView);

        txtnama = (TextView) itemView.findViewById(R.id.txt_nama);
        txtnim = (TextView) itemView.findViewById(R.id.txt_nim);

    }
}
