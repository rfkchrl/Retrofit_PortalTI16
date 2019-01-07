package arisyrifki.app.portalti16.Data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import arisyrifki.app.portalti16.Entity.Mahasiswa;

/**
 * Created by rfkchrl on 1/7/2019.
 */

@Database(entities = {Mahasiswa.class}, version = 1, exportSchema = false)
public abstract class MahasiswaDatabase extends RoomDatabase {
    public abstract MahasiswaDao mahasiswaDao();


}
