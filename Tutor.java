import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tutor{
   // Atributos
   private int codigo;
   private String nome;
   private String endereco;
   private LocalDate dataNasc;
   private ArrayList<Pet> pet=new ArrayList<Pet>();
   
   // Construtor
   public Tutor(int c, String n, String e, LocalDate d){
      codigo = c;
      nome = n;
      endereco = e;
      dataNasc = d;
   }
   
   // Getters
   public int getCodigo() {return codigo;}
   public String getNome() {return nome;}
   public String getEndereco() {return endereco;}
   public LocalDate getDataNasc() {return dataNasc;}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}