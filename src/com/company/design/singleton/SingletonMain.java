package com.company.design.singleton;

import com.company.design.singleton.AClass;
import com.company.design.singleton.BClass;
import com.company.design.singleton.SocketClient;

public class SingletonMain {

    public static void main(String[] args) {

        AClass aClass = new AClass();
        BClass bClass = new BClass();

        SocketClient aClient = aClass.getSocketClient();
        SocketClient bClient = bClass.getSocketClient();

        System.out.println(aClient.equals(bClient));

    }
}
