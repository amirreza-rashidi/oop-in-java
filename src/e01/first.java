package src.e01;
import java.util.*;
public class first {
    public static void main(String[] args) {
Scanner cin = new Scanner(System.in);

for (int i=0; i<3; i++) {
 Animal animal = new Animal();
  System.out.println("Enter the name of the animal: ");
  animal.name = cin.nextLine();
  System.out.println("Enter the age of the animal: ");
  animal.age = cin.nextInt();
  System.out.println("Enter the weight of the animal: ");
  animal.weight = cin.nextInt();
 System.out.println("is this  domesticated animal ? ");
  animal.type = cin.nextLine();
  animal.Show();
  cin.nextLine();
}
    }
}
// cause we dont save our objects    after for loop runing we dont have an object   we should use arrays to save our objects