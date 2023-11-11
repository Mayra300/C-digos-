class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    //Constructor
    public Hora(int h, int m, int s) {
        this.horas = h;
        this.minutos = m;
        this.segundos = s;
    }

    // Métodos de acceso 
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    // Método para avanzar la hora actual
    public void avanzar() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
            if (minutos >= 60) {
                minutos = 0;
                horas++;
                if (horas >= 24) {
                    horas = 0;
                }
            }
        }
    }

    // Método para poner a cero la hora actual
    public void ponerACero() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    // Método para visualizar la hora 
    public void visualizar() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }
  }

class poo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Crear un objeto
        Hora horAc = new Hora(12, 30, 45);

        System.out.print("Hora actual: ");
        horAc.visualizar();
        
        horAc.avanzar();
        System.out.print("Hora después de avanzar: ");
        horAc.visualizar();

        horAc.ponerACero();
        System.out.print("Hora después de poner a cero: ");
        horAc.visualizar();
    }
    
}