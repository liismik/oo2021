package Homework;

public class Main {
    public static void main(String[] args){
        weapons();
    }

    public static void weapons(){
        GameWeapons weapon1 = new GameWeapons();
        weapon1.RPM = 400;
        weapon1.countryOrigin = "Austria";
        weapon1.damagePerSecond = 187;
        weapon1.magSize = 20;
        weapon1.name = "Glock 18";
        System.out.println(weapon1.name + ", Country of origin: " + 
        weapon1.countryOrigin + ", rounds per minute: " +
        weapon1.RPM + ", magazine size: " + 
        weapon1.magSize + ", Damage per second: "+ weapon1.damagePerSecond);

        GameWeapons weapon2 = new GameWeapons();
        weapon2.RPM = 41;
        weapon2.countryOrigin = "United Kingdom";
        weapon2.damagePerSecond = 79;
        weapon2.magSize = 10;
        weapon2.name = "AWP";
        System.out.println(weapon2.name + ", Country of origin: " + 
        weapon2.countryOrigin + ", rounds per minute: " +
        weapon2.RPM + ", magazine size: " + 
        weapon2.magSize + ", Damage per second: "+ weapon2.damagePerSecond);
    }
}