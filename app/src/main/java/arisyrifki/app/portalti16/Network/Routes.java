package arisyrifki.app.portalti16.Network;

import arisyrifki.app.portalti16.Entity.DaftarMahasiswa;
import arisyrifki.app.portalti16.Entity.Mahasiswa;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by rfkchrl on 11/26/2018.
 */

public interface Routes{
    //didapat dari https://ti16-api.herokuapp.com/ (Network)
    @GET("dev/list_mahasiswa")
    Call<DaftarMahasiswa> getMahasiswa();

    //didapat dari https://ti16-api.herokuapp.com/ (Network)
    @FormUrlEncoded
    @POST("dev/insert_mahasiswa")
    Call<Mahasiswa> postMahasiswa(
        @Field("name") String name,
        @Field("nim") String nim
    );
}
