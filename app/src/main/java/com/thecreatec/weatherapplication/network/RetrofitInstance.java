package com.thecreatec.weatherapplication.network;

import com.thecreatec.weatherapplication.service.WeatherDataService;
import com.thecreatec.weatherapplication.util.Utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit;

   /** public static WeatherDataService getService() {
        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(Utils.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }**/
   public static  WeatherDataService  getService(){
       if(retrofit==null){
           retrofit = new Retrofit.Builder()
                   .baseUrl(Utils.BASE_URL)
                   .addConverterFactory(GsonConverterFactory.create())
                   .build();
       }
       return retrofit.create(WeatherDataService.class);
   }
}
