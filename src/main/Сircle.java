package main;

import java.io.*;
import java.util.*;


public class Сircle {      
        public static void main(String[] args) throws IOException {
        	 //манипуляции в примерах как с цыфрами выводишь как строку 
        	        ArrayList<Integer> number = new ArrayList<>();
        	        String summ;
        	        String str;
        	        FileReader file = new FileReader("/home/vasy/imput"); // Считывание данных из файла
        	        Scanner sc = new Scanner(file);
        	        str = sc.nextLine();
        	        StringTokenizer st = new StringTokenizer(str, " ");
        	        while (st.hasMoreTokens()){
        	            number.add(Integer.valueOf(st.nextToken()));
        	        }
        	        summ = (number.get(0) + number.get(1) == number.get(2) + number.get(3))? "YES" : "NO";
        	        FileWriter fileOut = new FileWriter("/home/vasy/ouput");
        	        fileOut.write(summ);
        	        fileOut.close();
        	    }
        }

