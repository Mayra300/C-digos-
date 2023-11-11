 class Hora {
    private int hor;
    private int min;
    private int seg;

    // Constructor que inicializa datos
    public Hora() {
        hor = 0;
        min = 0;
        seg = 0;
    }

    // Inicializa a valores dados
    public Hora(int horas, int minutos, int segundos) {
        this.hor = horas;
        this.min = minutos;
        this.seg = segundos;
    }

    // Método para visualizar la hora en formato HH:MM:SS
    public void visualizarHora() {
        System.out.printf("%02d:%02d:%02d\n", hor, min, seg);
    }

    // Método para sumar dos objetos de tipo Hora y guardar el resultado en el objeto actual
    public void sumarHoras(Hora H1, Hora H2) {
        this.hor = H1.hor + H2.hor;
        this.min = H1.min + H2.min;
        this.seg = H1.seg + H2.seg;

        // Ajustar los valores si los segundos o minutos superan 59
        if (this.seg >= 60) {
            this.min += this.seg / 60;
            this.seg %= 60;
        }
        if (this.min >= 60) {
            this.hor += this.min / 60;
            this.min %= 60;
        }
    }

  
}
 class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Objetos inicializados
        Hora hora1 = new Hora(1, 30, 45);
        Hora hora2 = new Hora(2, 15, 20);

        //Objeto no inicializado
        Hora hora3 = new Hora();

        // Sumar los dos valores Y guarda el resultado en el 3 objeto
        hora3.sumarHoras(hora1, hora2);

        // Visualizar el resultado
        System.out.print("Hora 1: ");
        hora1.visualizarHora();

        System.out.print("Hora 2: ");
        hora2.visualizarHora();

        System.out.print("Resultado de la suma - hora final: ");
        hora3.visualizarHora();
    }
} 