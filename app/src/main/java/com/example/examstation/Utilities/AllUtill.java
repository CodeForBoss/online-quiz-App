package com.example.examstation.Utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllUtill {
      public static boolean isNumber(String str){
          if(str.length() > 0){
              for(int i = 0 ; i<str.length(); i++){
                  if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                      return true;
                  }
              }
          }
          return false;
      }

      public static boolean isName(String name){
          if(name.isEmpty()){
              return false;
          }
          if(isNumber(name)){
              return false;
          }
          return true;
      }
      public static boolean isEmail(String email){
          if(email.isEmpty()){
              return false;
          }
          String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(email);
          if(!matcher.matches()){
              return false;
          }
          return true;
      }
      public static boolean isPhone(String phone){
          if(phone.isEmpty()){
              return false;
          }
          if(phone.length()!=6){
              return false;
          }
          return true;
      }
      public static boolean isAge(String age){
          if(age.isEmpty() || age.length() > 2){
              return false;
          }
          return true;
      }
      public static boolean isPassword(String password){
          if(password.isEmpty() || password.length() < 4){
              return false;
          }
          return true;
      }
      public static boolean isAddress(String address){
          if(address.isEmpty()){
              return false;
          }
          return true;
      }
}
