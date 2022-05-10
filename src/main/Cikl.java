package main;
import java.io.*;
import java.text.MessageFormat;
import java.util.*;
//Записываемая или считываемая информация может быть разной: кэш, изображения, текст, числа, двоичный формат и др.
// два вида Поток последовательности символов.Поток последовательности байтов.

public class Cikl{//класс инструкции 
private static String resultOut;//Вывод строки;
public static void main(String[] args) throws IOException {//главный статический метод
ArrayList<String> number = new ArrayList<>(); // Для данных из файла память в виде обьектов списка 
ArrayList<String> result = new ArrayList<>(); // Для данных, полученных в результате вычислений
int resultInt; //результат 
String str;//выводимая строка 
FileReader file = new FileReader("input.txt"); // Считывание данных из файла путь 
Scanner sc = new Scanner(file);//считываем с файла 
//Сканер выполняет поиск токенов во входной строке
//Токен (или маркер) представляет собой серию цифровых или буквенно-цифровых символов, которая заканчивается разделителем
while (sc.hasNextLine()){//пока  проверяет, является ли следующая порция данных строкой.
str = sc.nextLine();//true, если у этого сканера есть другой токен на входе.считывает число  строку за строкой
StringTokenizer st = new StringTokenizer(str, " ");//класс, вся работа которого — разделять строку на подстроки для подсчёта отдельно взятой цыфры 
while (st.hasMoreTokens()){//пока проверяет, есть ли еще токены
number.add(st.nextToken()); // Записать все элементы в коллекцию
	            }
	        }

//если строками манипулируешь то переводишь их в цыфры если просто хранишь в строках
	        int j = 1;
	        for(int i = 0; i < number.size(); i++){//цикл пока размер больше крутим 
	            if(i != 0 && j < number.size()){// если  и не равна нулю то выполняем второе если j меньше 
	  //вывести как  конкретную цыфру  первого индекса и далее по стетчику а у строки есть буквы есть конкретный результат 
	                int n = Integer.valueOf(number.get(j));//то втавлям возвращает Integer значением которого является j;
	                int m = Integer.valueOf(number.get(j + 1));//букву в цыфру при работе с классам- обертками мы работаем с объектами.делая его сылочным
	                j = j + 2;
	                resultInt = 19* m + (n + 239)*(n + 366) / 2; // Формула из задачи d = 19m + (n + 239)*(n + 366) / 2 
	                result.add(String.valueOf(resultInt));//и вставить результат в новый  кусок память список 
	            }
	        }//развилка берется очередной элемент этого списка и присваивается переменной line типа String (эта переменная живет только внутри цикла). 
	        for(String line : result) // пробигаем по всему цыклу и записываем очередной элемент line 
	            if (resultOut != null) { //если результат выхода  не ноль то 
	                resultOut = String.format("%s%s", resultOut, MessageFormat.format("{0}\n", line)); // Записываем результат со второй строки
	            } else {//иначе 
	                resultOut = line + "\n"; // Записываем результат в 1 строку
	            }
	        FileWriter fileOut = new FileWriter("output.txt");
	        fileOut.write(resultOut);
	        fileOut.close();
	    }
	}

