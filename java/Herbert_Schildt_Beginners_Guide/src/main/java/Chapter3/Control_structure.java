/*
В этой главе: 
Ввод символов с клавиатуры 
Полная форма условной инструкции if 
Инструкция switch 
Полная форма цикла for 
Цикл while 
Цикл do-while 
Использование и нструкции break для выхода из цикла 
Использование инструкции break в качестве оператора goto 
Инструкция continue 
Вложенные циклы 
 */
package Chapter3;
import java.io.IOException;
/**
 *
 * @author zicrys
 */
public class Control_structure {
    //цикл do while
    //выполняется do хотя бы 1 раз
    //если условие while(true): выполняется снова do
    //если условие while(false): условие; конец цикла
    public void dowhile()
    throws java.io.IOException {
    char ch;
        do { System.out.println("Нажмите любую клавишу, а затем клавишу Enter: "); 
        ch = (char)System.in.read();} //получить символ(ввод символа с клавиатуры)
        while(ch != 'Z');
        System.out.println("Вы нажали клавишу: " + ch);
    }
    //особенность считывания данных с клавиатуры
    //при нажатии кнопки и 'Enter' в буфер попадает 2 символа
    //char + '\n'
    //существует фишка с отловом спец.символа дополнительным do-while
    public void feature_dowhile()
    throws java.io.IOException{
        char ch, ignore, answer = 'L';
        do{
            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.println("Попытайтесь её угадать: ");
        //получение символа с клавиатуры
        ch = (char) System.in.read();
            //отбрасывание всех остальных символов во входном буфере ->
            do{
                ignore = (char)System.in.read();
            }
            while(ignore != '\n');
        if(ch == answer){
            System.out.println("**ПРАВИЛЬНО!**");
        }
        else {
            System.out.print("Извините, нужная буква находится: ");
            if (ch > answer){
                System.out.println("ближе к началу алфавита");
            }
            else{
                System.out.println("ближе к концу алфавита");
            }
        }
        }
        while(answer != ch);
    }
}
