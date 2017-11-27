package com.example.vishvendu.headlyapp.Network;

import static com.example.vishvendu.headlyapp.Network.RetroClient.Base_URL;


/**
 * Created by vishvendu on 11/8/17.
 */

public class ApiUtils {



    public static RetroInterface getSOService() {
        return RetroClient.getClient(Base_URL).create(RetroInterface.class);
    }

}
