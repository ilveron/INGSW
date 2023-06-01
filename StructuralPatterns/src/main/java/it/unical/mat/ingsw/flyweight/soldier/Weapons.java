package it.unical.mat.ingsw.flyweight.soldier;

import java.util.Random;

public class Weapons {
    private static Weapons instance = null;

    private static final String[] allyWeapons = {   "M1A1_Carbine", "M1907_SF", "Turner_SMLE", "Ribeyrolles_1918", "MAS_44",
            "Karabin_1938M", "M1_Garand", "STEN", "M1928A1", "Commando_Carbine", "Jungle_Carbine",
            "Automatic_12g", "Bren_Gun", "Lewis_Gun", "VGO", "M1897", "M1922_MG", "Browning_M1919A6",
            "No4_MkI", "Model_8", "Krag_Jorgensen", "RSC", "RossRifle_MkIII", "BoysAT_Rifle"
    };

    private static final String[] axisWeapons = {   "StG_1_5", "Gewehr_43", "StG_44", "Selbstlader_M1916", "Gewehr_1_5", "Breda_M1935M",
            "Suomi_KP31", "MP_40", "MP_28", "EMP", "MP_34", "ZK_383", "M28_Con_Tromboncino", "MAB_38",
            "Type_100", "MG_34", "M30_Drilling", "FG_42", "MG_42", "S2_200", "Gewehr_M95_30", "Kar_98k",
            "Selbstlader_1906", "P08_Carbine", "Panzerbusche_39", "Trench_Carbine", "Arisaka_Type_99"
    };

    private static Random r = new Random();

    private Weapons(){}

    public static Weapons getInstance() {
        if(instance == null)
            instance = new Weapons();
        return instance;
    }

    public String getAllyWeapon(){
        return allyWeapons[r.nextInt(allyWeapons.length)];
    }

    public String getAxisWeapon(){
        return axisWeapons[r.nextInt(axisWeapons.length)];
    }
}
