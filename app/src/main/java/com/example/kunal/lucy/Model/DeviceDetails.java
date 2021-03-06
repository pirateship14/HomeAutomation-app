package com.example.kunal.lucy.Model;

import android.bluetooth.BluetoothDevice;

/**
 * Created by Kunal on 8/20/2015.
 */
public class DeviceDetails implements Devices{

    private BluetoothDevice mBluetoothDevice;
    private String mName;
    private String mAddress;
    private byte switchedOnLights;
    public long lastUpdated[];
    public boolean lightStates[];

    public boolean isAvailable;
    public boolean isConnected;

    public DeviceDetails(String address, String name){
        mAddress = address;
        mName = name;
        isAvailable = false;
        isConnected = false;
        lastUpdated = new long[Devices.switchName.length];
        lightStates = new boolean[Devices.switchName.length];
    }

    public String getAddress(){
        return mAddress;
    }

    public String getName() {
        return mName;
    }

    public int getSwitchedOnLights() {
        switchedOnLights = 0;
        for(int i =0; i<lightStates.length; i++)
            if(lightStates[i])
                switchedOnLights++;
        return switchedOnLights;
    }

}
