package com.skplanet.plalab.sinbihae;

/**
 * Created by 1001021 on 14. 12. 8..
 */
public class StudyLoop {
    /**
     *
     */
    public static void main(String[] args){

        for(int i = 5; i > 0 ; i--){

            for(int j=0; j<i; j++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
