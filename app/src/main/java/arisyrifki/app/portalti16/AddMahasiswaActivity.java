package arisyrifki.app.portalti16;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
                addNewMahasiswa();
            }
        });
    }

    private void addNewMahasiswa() {
    }
}
