package com.company.design.adapter;

/**
 * @author 이승환
 * @since 2021-05-19
 */
public class AdapterMain {

    public static void main(String[] args) {

        // 110v 헤어드라이기
        HairDryer hairDryer = new HairDryer();
        // 110v 콘센트에 전원연결.
        connect(hairDryer);

        // 220v 청소기
        Cleaner cleaner = new Cleaner();
        // cleaner를 110v 어댑터에 연결한다.
        Electronic110V adapter = new SocketAdapter(cleaner);
        // 110v 어댑터를 110v 콘센트에 연결한다.
        connect(adapter);

    }

    /**
     * 110v 콘센트
     * @param electronic110V
     */
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }

}
