package com.Day3Assignment;

public class inheritance {
    public static void main( String[] args) {
        BMW bmw = new BMW();
        bmw.colour();
        bmw.drive();

    }
}
class car{
    void drive(){
        System.out.println(" am driving");
    }

        }
        class BMW extends car {
    void colour (){
        System.out.println(" black");
    }
        }