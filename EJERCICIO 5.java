class Nodo {
    private static int tamanoPa;
    private String nombreN;

    public Nodo(String nom) {
        this.nombreN = nom;
    }

    public static void establecerTamanoPaquete(int tam) {
        tamanoPa = tam;
    }

    public void enviarPaquete(Nodo destino, String mensaje) {
        System.out.println("Paquete enviado desde " + nombreN + " a " + destino.nombreN + ": " + mensaje);
    }

    public void difundirPaquete(Nodo[] nd, String mensaje, int cantidad) {
        System.out.println("Difundiendo paquete desde " + nombreN + " a todos los nodos: " + mensaje);
        for (int i = 0; i < cantidad; i++) {
            if (nd[i] != this) {
                System.out.println("Recibido por " + nd[i].nombreN);
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Nodo: " + nombreN;
    }
}

class LAN {
    protected Nodo[] nod;
    protected int cantidadN;
    protected String topl;

    public LAN(String tpl, int capMax) {
        this.topl = tpl;
        this.nod = new Nodo[capMax];
        this.cantidadN = 0;
    }

    public void agregarNodo(Nodo n) {
        if (cantidadN < nod.length) {
            nod[cantidadN++] = n;
        } else {
            System.out.println("No se puede agregar más nodos. Capacidad máxima alcanzada.");
        }
    }

    public void quitarNodo(Nodo n) {
        for (int i = 0; i < cantidadN; i++) {
            if (nod[i] == n) {
                // Mover nodos restantes para llenar el espacio
                for (int j = i; j < cantidadN - 1; j++) {
                    nod[j] = nod[j + 1];
                }
                nod[cantidadN - 1] = null; // Eliminar la última referencia
                cantidadN--;
                System.out.println("Nodo eliminado.");
                return;
            }
        }
        System.out.println("Nodo no encontrado.");
    }

    public void listarNodos() {
        System.out.println("Nodos en la LAN:");
        for (int i = 0; i < cantidadN; i++) {
            System.out.println(nod[i]);
        }
        System.out.println();
    }

    public void configurarRed(String top) {
        this.topl = top;
        System.out.println("Red configurada con topología " + top + ".\n");
    }

    public void establecerTamanoPaquete(int tam) {
        Nodo.establecerTamanoPaquete(tam);
        System.out.println("Tamaño del paquete establecido en " + tam + " bytes.\n");
    }

    public void enviarPaquete(Nodo origen, Nodo destino, String mensaje) {
        origen.enviarPaquete(destino, mensaje);
    }

    public void difundirPaquete(Nodo origen, String mensaje) {
        origen.difundirPaquete(nod, mensaje, cantidadN);
    }

    public void calcularEstadisticas() {
        
        System.out.println("Calculando estadísticas de la LAN...");
    
    }
             
}

class poo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LAN l = new LAN("Estrella", 3);

        Nodo n1 = new Nodo("Nodo 1");
        Nodo n2 = new Nodo("Nodo 2");
        Nodo n3 = new Nodo("Nodo 3");

        l.agregarNodo(n1);
        l.agregarNodo(n2);
        l.agregarNodo(n3);

        l.listarNodos();

        l.configurarRed("Bus");

        l.establecerTamanoPaquete(50);

        l.enviarPaquete(n1, n2, "¡Hola!");

        l.difundirPaquete(n3, "Mensaje para usted");

        l.calcularEstadisticas();
    }
    
}