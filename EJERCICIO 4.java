class Cadena {
    private int lon;
    private String cont;

    //Constructor
    public Cadena(String contn) {
        this.cont = contn;
        this.lon = contn.length();
    }

    // Métodos de acceso
    public int getLongitud() {
        return lon;
    }

    public String getContenido() {
        return cont;
    }

    // Método para obtener un carácter en un índice dado
    public char caracter(int i) {
        if (i >= 0 && i < lon) {
            return cont.charAt(i);
        } else {
            return (char) -1; 
        }
    }

    // Método para visualizar la cadena
    public void visualizar() {
        System.out.println("Contenido de la cadena: " + cont);
        System.out.println("Longitud de la cadena: " + lon);
    }
                           
}

class poo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crea un objeto cadena
        Cadena cad = new Cadena("Programacion");
        
        char c1, c2;
        int i1, i2;
        
        // Visualizar la cadena y su longitud
        cad.visualizar();

        // Obtener y mostrar caracteres en varios índices
        i1 = 3;
        i2 = 8;

        c1 = cad.caracter(i1);
        c2 = cad.caracter(i2);

        System.out.println("Carácter en el índice " + i1 + ": " + c1);
        System.out.println("Carácter en el índice " + i2 + ": " + c2);
    }
    
}