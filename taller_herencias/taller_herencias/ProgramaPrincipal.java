package taller_herencias;
// Clase principal del programa
public class ProgramaPrincipal {
  public static void main(String[] args) {
    // Creamos objetos de las clases hijas
    Hija1 objHija1 = new Hija1();
    Hija2 objHija2 = new Hija2();

    // Llamamos al método de cada objeto
    objHija1.metodoHija1();
    objHija2.metodoHija2();
  }
}

// Clase padre
class Padre {
  public void metodoPadre() {
    System.out.println("Este es el método de la clase Padre");
  }
}

// Clase hija 1 que hereda de Padre
class Hija1 extends Padre {
  public void metodoHija1() {
    System.out.println("Este es el método de la clase Hija1");
    super.metodoPadre(); // Llamamos al método de la clase Padre usando "super"
  }
}

// Clase hija 2 que hereda de Padre
class Hija2 extends Padre {
  public void metodoHija2() {
    System.out.println("Este es el método de la clase Hija2");
  }
}
 