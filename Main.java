import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    while(true){
      int opcja=0;
      opcja=menu();

      switch(opcja)
      {
        case 1:{
          System.out.println();
          OP1();
          break;
        }
        case 2:{
          System.out.println();
          OP2();
          break;
        }
        case 0:{
          return;
        }
      }      
    }

  }

  public static int menu(){
    Scanner skaner = new Scanner(System.in);
    int numer=0;

    System.out.println();
    System.out.println();
    System.out.println("Menu: ");
    System.out.println("1. Dodaj studenta");
    System.out.println("2. Wypisz listę studentów");
    System.out.println("0. Wyjście z programu");
    System.out.print("Wybierz opcję: ");
    
    numer = skaner.nextInt();
    return numer;
  }

  public static void OP1(){
    Scanner skaner = new Scanner(System.in);
    try {
      Service1 s = new Service1();
      int wiek;
      String imie;

      System.out.print("Podaj imie: ");
      imie=skaner.nextLine();
      System.out.print("Podaj wiek: ");
      wiek=skaner.nextInt();
          
      s.addStudent(new Student(imie, wiek));
    } catch (IOException e) {

    }
  }

  public static void OP2(){
    try {
      Service1 s = new Service1();
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {

    }
  }
      
}