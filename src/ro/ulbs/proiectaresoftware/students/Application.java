package ro.ulbs.proiectaresoftware.students;

import java.util.*;

public class Application {

    public void main()
    {
        Student s1 = new Student(112, "Ioan", "Popa", "TI21/1");
        Student s2 = new Student(112, "Maria", "Oprea", "TI21/1");
        Student s3 = new Student(120, "Alis", "Popa", "TI21/2");
        Student s4 = new Student(122, "Mihai", "Vecerdea", "TI22/1");
        Student s5 = new Student(122, "Eugen", "Uritescu", "TI22/2");

        System.out.printf("%15s %15s %15s %15s\n", "numar matricol", "prenume", "nume", "formatie de studiu");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        List<Student> lista_studenti = new ArrayList<Student>();
        lista_studenti.add(s1);
        lista_studenti.add(s2);
        lista_studenti.add(s3);
        lista_studenti.add(s4);
        lista_studenti.add(s5);

        System.out.println("lista:");
        for(Student s: lista_studenti)
            System.out.println(s);

        //tema casa
        Set<Student> set_studenti = new HashSet<>(lista_studenti);

        System.out.println("//lista");

        Student s6=new Student(120, "Alis", "Popa", "TI21/2");
        if(lista_studenti.contains(s6))
            System.out.println(s6 + " este in lista");
        else
            System.out.println(s6 + " nu este in lista");

        Student s7=new Student(112, "Maria", "Popa", "TI21/1");
        if(lista_studenti.contains(s7))
            System.out.println(s7 + " este in lista");
        else
            System.out.println(s7 + " nu este in lista");

        System.out.println("//set");

        if(set_studenti.contains(s6))
            System.out.println(s6 + " este in lista");
        else
            System.out.println(s6 + " nu este in lista");

        if(set_studenti.contains(s7))
            System.out.println(s7 + " este in lista");
        else
            System.out.println(s7 + " nu este in lista");

    }
}
