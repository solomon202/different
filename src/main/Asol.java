package main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Asol {
	 public static void main(String[] args) throws IOException {//работа с потоками не безопасно 
            String str;//обьявить переменную которую получим 
	        FileReader fin = new FileReader("/home/vasy/imput"); ////устройство для чтения файлов
	        Scanner sc = new Scanner(fin);//сканер считывает данные //связываем scanner c файлом.буфер////считывающее устройство
	        str = sc.nextLine();//присваевываем  число с помощью метода новой переменной с помощью методов буфера /читает до конца текущей строки и возвращает всё, что было в этой строке
	        FileWriter countStepFinish = new FileWriter("/home/vasy/ouput");// Запись числа в файл в конструктор пишем путь 
	        countStepFinish.write(str);// запись по пути 
	        countStepFinish.close();//закрыть поток 
	    }

}
// обьект путь откуда считать .связываем обьект буфер и с помощью его метода присваевываем переменной.обьект путь записи и с помошью его 
//метода присваивая новую переменную передаем в файл и методом тогоже обьекта закрываем.
//у нас есть обьекты и их методы с помощью их мы движимся.на бумаге .

  //обьект откуда скачать  у енго есть методы с помощью которых это делается
  //обьект хранения  у енго есть методы с помощью которых это делается
  //обьект записи у енго есть методы с помощью которых это делается 