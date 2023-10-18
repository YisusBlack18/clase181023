// Componente base
abstract class Bebida {
    public abstract String getDescripcion();
    public abstract double getCosto();
}

// Concreto: Café
class Cafe extends Bebida {
    public String getDescripcion() {
        return "Café";
    }

    public double getCosto() {
        return 50;
    }
}

// Decorator: Leche
class ConLeche extends Bebida {
    Bebida bebida;

    public ConLeche(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + " con leche";
    }

    public double getCosto() {
        return bebida.getCosto() + 10;
    }
}

// Decorator: Caramelo
class ConCaramelo extends Bebida {
    Bebida bebida;

    public ConCaramelo(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + " con caramelo";
    }

    public double getCosto() {
        return bebida.getCosto() + 20;
    }
}

// Decorator: Chocolate
class ConChocolate extends Bebida {
    Bebida bebida;

    public ConChocolate(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + " con chocolate";
    }

    public double getCosto() {
        return bebida.getCosto() + 30;
    }
}

// Uso:
class cafeteria {
    public static void main(String[] args) {
        Bebida miCafe = new Cafe();
        miCafe = new ConLeche(miCafe);
        System.out.println(miCafe.getDescripcion() + " - Costo: " + miCafe.getCosto());
        miCafe = new ConCaramelo(miCafe);
        System.out.println(miCafe.getDescripcion() + " - Costo: " + miCafe.getCosto());
        miCafe = new ConChocolate(miCafe);
        System.out.println(miCafe.getDescripcion() + " - Costo: " + miCafe.getCosto());
    }
}
