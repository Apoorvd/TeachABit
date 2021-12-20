package com.major.teachAbit.Fragments;

import com.major.teachAbit.Notifications.MyResponse;
import com.major.teachAbit.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAArg5Qf-8:APA91bEz9_eAUK2B8LqNRetfYiwQ045-3Tpj1hCceoood7LpQYSkHZXUdShOO0OvGiOupGJ1wZ6PKpt7P3Y0_mhuZBiAR5CaI2C4uevjMc-fKs7X02FuWtPUAJm9sEu5QBDr4q5r9Hqi"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
