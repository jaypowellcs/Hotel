package edu.wgu.d387_sample_code.controller;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessage implements Runnable {

   Locale locale;

   public WelcomeMessage(Locale locale) {
       this.locale = locale;
   }

   public String getWelcomeMessage() {
       ResourceBundle bundle = ResourceBundle.getBundle("translation", locale);
       return bundle.getString("welcome");
   }

    @Override
    public void run() {
       //test if message is running
        System.out.println(getWelcomeMessage());
    }
}
