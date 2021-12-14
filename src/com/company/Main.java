package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Limb").print();
        createObject("Lust").print();
        createObject("Gluttony").print();
    }

    public static DanteHell createObject(String className){
        switch (className){
            case "Limb":
                return new Limb("лимб","томятся некрещенные младенцы и нехристиане","которые обречены на безбольную скорбь",
                        "ХАРОН");
            case "Lust":
                return new Lust("Похоть","обитают блюдники и страстные любовники," +
                        "которыхистязают бурей в кромешней тьме","Минос");
            case "Gluttony":
                return new Gluttony("Чревоугодие","проживаю обжоры и гурманы," +
                        "которые гниют под солнцем и ледяним дождем", "Цербер");

            default:
                return null;

        }
    }
}
