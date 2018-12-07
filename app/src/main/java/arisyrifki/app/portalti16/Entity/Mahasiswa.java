package arisyrifki.app.portalti16.Entity;

import java.io.Serializable;

/**
 * Created by rfkchrl on 11/26/2018.
 */

public class Mahasiswa implements Serializable{
    private String name;
    private String nim;

    public Mahasiswa(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public String getName() {
                return name;
    }

    public String getNim() {

        return nim;
    }


}
