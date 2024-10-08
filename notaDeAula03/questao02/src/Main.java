public class Main {
  public static void main(String[] args) {
    
    Animal animal = new Animal("Animal Genérico");
    
    Cachorro cachorro = new Cachorro();
    cachorro.setNome("Caramelo Brazileirus");
    
    Gato gato = new Gato();
    gato.setNome("Arnaldo");
    
    
    animal.caminha();
    
    gato.caminha();
    gato.mia();
    
    cachorro.caminha();
    cachorro.late();
  }
}