package arisyrifki.app.portalti16.Network;

import arisyrifki.app.portalti16.Entity.DaftarMahasiswa;
import arisyrifki.app.portalti16.Entity.Mahasiswa;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by rfkchrl on 11/26/2018.
 */

public interface Routes{
    @GET("list.php")
    Call<DaftarMahasiswa> getMahasiswa();

    @POST("add.php")
    Call<Mahasiswa> postMahasiswa(
        @Field("name") String name,
        @Field("nim") String nim
    );
}
