package arisyrifki.app.portalti16.Network;

import arisyrifki.app.portalti16.Entity.DaftarMahasiswa;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by rfkchrl on 11/26/2018.
 */

public interface Routes{
    @GET("list.php")
    Call<DaftarMahasiswa> getMahasiswa();
}
