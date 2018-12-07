package arisyrifki.app.portalti16;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import arisyrifki.app.portalti16.Entity.Mahasiswa;
import arisyrifki.app.portalti16.Network.Network;
import arisyrifki.app.portalti16.Network.Routes;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddMahasiswaActivity extends AppCompatActivity {

    private EditText edtName,edtNim ;
    private Button btnAdd;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_mahasiswa);
        
        edtName = (EditText)findViewById(R.id.edt_name);
        edtNim = (EditText)findViewById(R.id.edt_nim);
        btnAdd = (Button) findViewById(R.id.btn_add);
        
        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString();
                String nim = edtNim.getText().toString();
                addNewMahasiswa(name,nim);
            }
        });
    }

    private void addNewMahasiswa(String name, String nim) {
        Routes services = Network.request().create(Routes.class);

        //menambahkan post terhadap data mahasiswa aru dari api add.php

        services.postMahasiswa(name, nim).enqueue(new Callback<Mahasiswa>() {
            @Override
            public void onResponse(Call<Mahasiswa> call, Response<Mahasiswa> response) {
                if (response.isSuccessful()){
                    //ketika posnya berhasil, maka akan kembali ke main
                    finish();//ini akan destroy this activity
                }else{
                    Toast.makeText(AddMahasiswaActivity.this, "Maaf",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<Mahasiswa> call, Throwable tgit ) {
                Toast.makeText(AddMahasiswaActivity.this, "Maaf",Toast.LENGTH_LONG).show();

            }
        });
    }
}
