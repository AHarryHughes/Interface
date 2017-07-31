package com.aharryhughes;

/**
 * Created by ahhughes8 on 7/25/17.
 */
public class StriiiiiiiitSolduer extends Soldier implements Fighter{

    public StriiiiiiiitSolduer(String rank, String name, int serialNumber) {
        this.rank = rank;
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public void hadoukenPlatter(){
        System.out.println(sleep());
        System.out.println(eat());
        System.out.println(walk());
        System.out.println(speak());
        System.out.println(hadouken());
        System.out.println(punch());
        System.out.println(kick());
        System.out.println(soupurHadouken());
    }

    public String sleep(){
        return "zzzzZZZZ "+haDouken+"!!!! .....ZZZZZZZzzzzzz....";
    };

    public String eat(){
        return "chew "+hAdouken[0]+" chew "+hAdouken[1]+" chew "+hAdouken[2];
    };

    public String walk(){
        return "moves: "+hadoUken+" paces";
    };

    public String speak(){
        return hadouken();
    };

    public String hadouken(){
        if(hadouKen){
            return haDouken;
        }
        else{
            return hadoukenLow();
        }
    }

    public String punch(){
        return "punch inuhffective use "+haDouken;
    }

    public String kick(){
        return "kick inAhffective use "+haDouken;
    }

    public String soupurHadouken(){
        Bomb bomb = new Bomb();
        return souperHadouken+bomb.toString();
    }
}
