package arisyrifki.app.portalti16.Data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import arisyrifki.app.portalti16.Entity.Mahasiswa;

/**
 * Created by rfkchrl on 1/7/2019.
 */

@Dao
public interface MahasiswaDao {

    @Insert
    Long insert(Mahasiswa mahasiswa);

    @Query("SELECT * FROM mahasiswa")
    List<Mahasiswa> getMahasiswa();

    @Update
    void update(Mahasiswa mahasiswa);

    @Delete
    void delete(Mahasiswa mahasiswa);
}
