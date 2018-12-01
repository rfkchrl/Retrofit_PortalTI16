package arisyrifki.app.portalti16;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import arisyrifki.app.portalti16.Adapter.MahasiswaAdapter;
import arisyrifki.app.portalti16.Entity.DaftarMahasiswa;
import arisyrifki.app.portalti16.Network.Network;
import arisyrifki.app.portalti16.Network.Routes;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by rfkchrl on 11/26/2018.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestDaftarMahasiswa();
    }

    private void requestDaftarMahasiswa(){
        //memanggil request dari retrofit yang sudah dibuat
        Routes services = Network.request().create(Routes.class);

        //kita melakukan request terhadap getMahasiswa()
        services.getMahasiswa().enqueue(new Callback<DaftarMahasiswa>() {
            @Override
            public void onResponse(Call<DaftarMahasiswa> call, Response<DaftarMahasiswa> response) {
                //mengecek request yang dilakukan berhasil atau tidak
                if (response.isSuccessful()){
                    //casting data yang didapat menjadi daftarmahasiswa
                    DaftarMahasiswa  mahasiswas = response.body();

                    //get title
                    Log.d("TI16", mahasiswas.getTitle());

                    //tampilkan daftar mahasiswa di recyclerview
                    MahasiswaAdapter adapter = new MahasiswaAdapter(mahasiswas.getData());
                }
            }

            @Override
            public void onFailure(Call<DaftarMahasiswa> call, Throwable t) {

            }
        });

    }

}