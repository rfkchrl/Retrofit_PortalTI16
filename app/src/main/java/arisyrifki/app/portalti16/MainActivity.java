package arisyrifki.app.portalti16;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

    //public List<Mahasiswa> mahasiswas = new ArrayList<>();
    private RecyclerView recyclerView ;
    public Button buttonAdd;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting recycler source repo umair
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        //LinearLayoutManager linear = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //casting Button
        buttonAdd = (Button)findViewById(R.id.btn_input);
        requestDaftarMahasiswa();
    }

    @Override
    protected void onStart() {
        super.onStart();
        requestDaftarMahasiswa();
        btnMove();
    }

    private void requestDaftarMahasiswa(){
        //pertama, memanggil request dari retrofit yang sudah dibuat
        Routes services = Network.request().create(Routes.class);

        //kite melakukan request terhadap getMahasiswa()
        services.getMahasiswa().enqueue(new Callback<DaftarMahasiswa>() {
            @Override
            public void onResponse(Call<DaftarMahasiswa> call, Response<DaftarMahasiswa> response) {
                //cek request yang dilakukan, berhasil atau tidak
                if(response.isSuccessful()){
                    //casting data yang didapatkan menjadi DaftarMahasiswa
                    DaftarMahasiswa mahasiswas = response.body();

                    //get title
                    Log.d("TI16", mahasiswas.getTitle());

                    //tampilkan daftar mahasiswa di recycler view
                    MahasiswaAdapter adapter = new MahasiswaAdapter(mahasiswas.getData());
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<DaftarMahasiswa> call, Throwable t) {
                onMahasiswaError();
            }
        });
    }

    private void onMahasiswaError() {
        Toast.makeText(
                MainActivity.this,
                "gagal",
                Toast.LENGTH_LONG).show();

    }

    //digunakan untuk pindah antar layer
    private void btnMove() {
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddMahasiswaActivity.class);
                startActivity(intent);
            }
        });
    }
}