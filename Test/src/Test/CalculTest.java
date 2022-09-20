package Test;

import com.company.Calcul;
import org.junit.Test;

public class CalculTest extends Calcul {
    @Test
    public void sumTest(){
        int a = sum(3,4);
        if(a == 7){
            System.out.println("ok");
        }
        else {
            System.out.println("error");
        }
    }
    @Test
    public void raznTest(){
        int a = razn(10,4);
        if(a == 6){
            System.out.println("ok");
        }
        else{
            System.out.println("error");
        }
    }
    @Test
    public void proizTest(){
        int a = proiz(3,4);
        if(a == 12){
            System.out.println("ok");
        }
        else{
            System.out.println("error");
        }
    }
    @Test
    public void chastnTest(){
        int a = chastn(12,4);
        if(a == 3){
            System.out.println("ok");
        }
        else{
            System.out.println("error");
        }
    }
    @Test
    public void stepTest(){
        int a = step(2,3);
        if(a == 8){
            System.out.println("ok");
        }
        else{
            System.out.println("error");
        }
    }
    @Test
    public void plParallelepipedTest(){
        int a = plParallelepiped(2,3, 4);
        if(a == 52){
            System.out.println("ok");
        }
        else{
            System.out.println("error");
        }
    }
}
