public class Student {

    private String Name;
    private String Nazwisko;
    private int Age;
    private String Data;

    public Student(String name, String nazwisko, String data, int age) {
        Name = name;
        Nazwisko = nazwisko;
        Age = age;
        Data = data;
    }

    public String GetName() {
        return Name;
    }

    public String GetNazwisko() {
        return Nazwisko;
    }

    public int GetAge() {
        return Age;
    }

    public String GetData() {
        return Data;
    }

    public String ToString() {
        return Name + " " + Nazwisko + " " + Data + " " + Integer.toString(Age);
    }

    public static Student Parse(String str) {
        String[] data = str.split(" ");
        return new Student(data[0], data[1], data[2], Integer.parseInt(data[3]));
    }
}