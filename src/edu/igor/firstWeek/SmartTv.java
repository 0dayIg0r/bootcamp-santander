package edu.igor.firstWeek;

public class SmartTv {
      boolean isOn = false;
      int chanel = 1;
      int volume= 10;

      public void turnOn(){
            isOn = true;
      }
      public void turnOff(){
            isOn = false;
      }

      public void turnUpVolume(){
            volume ++;
      }
      public void reduceVolume(){
            volume --;
      }

      public void changeChannel(int newChannel){
            chanel ++;
      }
      public void turnUpChannel(){
            chanel ++;
      }
      public void turnDownChannel(){
            chanel --;
      }

      
}
