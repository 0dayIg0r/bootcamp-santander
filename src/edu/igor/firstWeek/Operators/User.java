package edu.igor.firstWeek.Operators;


public class User {
    public static void main(String[] args) throws Exception {


        SmartTv smartTv = new SmartTv();
        System.out.println(smartTv.chanel);
        System.out.println(smartTv.isOn);

        smartTv.turnUpVolume();
        smartTv.turnUpVolume();
        smartTv.turnUpVolume();
        smartTv.turnUpVolume();
        smartTv.reduceVolume();

        System.out.println("VOLUME ATUAL " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("TV LIGADA");

        smartTv.turnOff();
        System.out.println("TV DESLIGADA");

        smartTv.turnDownChannel();

        smartTv.turnUpChannel();

        smartTv.changeChannel(12);
    }
}
