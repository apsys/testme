package com.amit.testme;

public class DefaultValue {
	  static boolean bool;
	  static byte by;
	  static char ch;
	  static double d;
	  static float f;
	  static int i;
	  static long l;
	  static short sh;
	  static String str;

	  public static void main(String[] args) {
	    System.out.println("Bool :" + bool);
	    System.out.println("Byte :" + by);
	    System.out.println("Character:" + ch);
	    System.out.println("Double :" + d);
	    System.out.println("Float :" + f);
	    System.out.println("Integer :" + i);
	    System.out.println("Long :" + l);
	    System.out.println("Short :" + sh);
	    System.out.println("String :" + str);
	    
	    
	    char c1 = 064770;	
	    //char c2 = 'face'; //doesn't allow
	    char c3 = 0xbeef;	
	    char c4 = '\uface';
	    System.out.println("c1: "+c1);
	    //System.out.println("c2: "+c2);
	    System.out.println("c3: "+c3);
	    System.out.println("c4: "+c4);
	    

	  }
	}