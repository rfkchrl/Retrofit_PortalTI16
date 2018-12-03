package arisyrifki.app.portalti16.Entity;

import java.util.List;

/**
 * Created by rfkchrl on 11/26/2018.
 */

public class DaftarMahasiswa {
    private String title;
    private List<Mahasiswa> data;

    public String getTitle() {
        return title;
    }

    public List<Mahasiswa> getData() {
        return data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", data = "+data+"]";
    }
}
