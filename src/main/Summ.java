package main;


	import java.io.*;
	import java.util.*;
	public class Summ {
	    public static void main(String[] args) throws IOException {
	        ArrayList<Integer> numeric = new ArrayList<>();//создать список обьектов типа число
	        int s = 0;
	        String str;
	        FileReader fin = new FileReader("input.txt"); // Получение чисел из файла получить путь
	        Scanner sc = new Scanner(fin);//запись в буфер
	        str = sc.nextLine();//дастаём из буфера 
	        StringTokenizer st = new StringTokenizer(str, " ");//в качестве разделителя пробел класс разделе­ние текста на ряд отдельных частей,разбиение строки
	        while(st.hasMoreTokens()){//проверка если.доступность хотя бы еще одного токена после текущей позиции, в противном случае — false.
	            int a = Integer.valueOf(st.nextToken());//втавляем в обьект число 
	            numeric.add(a);//обьект в лист 
	        }
	        for (Integer aNumeric : numeric) {  //пробигаем  по обьектам челочисленых цикл 
	            s += aNumeric;//прибавляем их между собой 
	        }
	        FileWriter countStepFinish = new FileWriter("output.txt");// Запись числа в файл путь 
	        countStepFinish.write(String.valueOf(s));//записываем 
	        countStepFinish.close();//закрыть поток 
	    }
	}
     //обьект я 
	//обьект овтобус 
	//загрузить меня в автобус 
	//доехать
	//выгрузить в обьект остановка .
