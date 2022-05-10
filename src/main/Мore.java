package main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Мore {
	public static void main(String[] args) throws IOException {

    String symbol;//символ больше меньше
    ArrayList<Integer> number = new ArrayList<>();//запись в список цифр
    String str;//получение строк 
    FileReader file = new FileReader("/home/vasy/Загрузки/imput");
    Scanner sc = new Scanner(file);//считываем символы
    while (sc.hasNextLine()){// цикл если есть символ за символом  то доставать достаем 
    	
    	/*while(числоЯблокВТазике>0) {
        яблоко = тазик.взятьОчередноеЯблоко();
        положитьВПирог(яблоко.чистить().нарезать());
        числоЯблокВТазике--;//-- это декремент, уменьшает количество яблок на единицу
    }
    System.out.println('Яблоки для пирога обработаны.');
    
    while(числоЯблокВТазике>0) {
    яблоко = тазик.взятьОчередноеЯблоко();
    числоЯблокВТазике--;//-- это декремент, уменьшает количество яблок на единицу
    if (яблоко.плохое()) {  // метод вернет true для гнилого и т.п. яблока
        яблоко.выкинутьВМусор();
        continue; // продолжим цикл, перейдем к условию числоЯблокВТазике>0
    }
    положитьВПирог(яблоко.чистить().нарезать());
}
    */
    str = sc.nextLine();//запись строки
    number.add(Integer.valueOf(str));//строку преоброзовать в число и вставит 
    }
     symbol = (number.get(0) > number.get(1)) ? ">" : // Проверка условия задачи
        (number.get(0) < number.get(1)) ? "<" : "=";
     FileWriter fileOut = new FileWriter("/home/vasy/Загрузки/ouput");
     fileOut.write(symbol);
     fileOut.close();
}
}
