package main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Prodget {
	   public static void main(String[] args) throws IOException {
	        ArrayList<Integer> numeric = new ArrayList<>();//создать список обьектов типа число
	        int s = 0;
	        String str;
	        FileReader fin = new FileReader("/home/vasy/imput"); // Получение чисел из файла получить путь
	        Scanner sc = new Scanner(fin);//запись в буфер
	        str = sc.nextLine();//дастаём из буфера 
	        StringTokenizer st = new StringTokenizer(str, " ");//в качестве разделителя пробел класс разделе­ние текста на ряд отдельных частей,разбиение строки
	        while(st.hasMoreTokens()){//проверка если.доступность хотя бы еще одного токена после текущей позиции, в противном случае — false.
	            int a = Integer.valueOf(st.nextToken());//втавляем в обьект число 
	            numeric.add(a);//обьект в лист 
	        }
	        //result = (time.get(1) > time.get(0)) ? time.get(1) - time.get(0) : 12 + time.get(1) - time.get(0);
	        
	        FileWriter fileOut = new FileWriter("/home/vasy/ouput");
	        fileOut.write(s);
	        fileOut.close();
	    }
}
