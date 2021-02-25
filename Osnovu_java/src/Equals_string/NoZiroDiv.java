package Equals_string;

public class NoZiroDiv {
    public static void main(String args[]) {
            int result;
            for (int i = -5; i < 6; i++) {

//Деление на нуль предотвращается
                result = (i != 0) ? 100/i : 0;
                if (i != 0) {
                    System.out.println("l00/" + i + " равно " + result);
                }}
        System.out.println();
//анадлг
for (int i = -5; i < 6; i++) {
        if (i != 0 ? true : false) {
        System.out.println("100/" + i + " равно " + 100/i);
        }}
    }}