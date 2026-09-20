package entregas.PaguagaJavier.Scr;

public class SimulacionCCCF {
    public static void main(String[] args) {
       
        final int TOTAL_MINUTOS = 4*60;
        final double PROBABILIDAD_LLEGADA = 0.6;
        final double PROBABILIDAD_APERTURA_CAJA = 0.4;

        int personasEnFila = 0;
        int personasAtendidas = 0;

        for (int minuto = 1; minuto <= TOTAL_MINUTOS; minuto++) {
            if (Math.random() < PROBABILIDAD_LLEGADA) {
                personasEnFila++;
            }

            if (Math.random() < PROBABILIDAD_APERTURA_CAJA && personasEnFila > 0) {
                personasEnFila--;
                personasAtendidas++;
            }
        }

        System.out.println("Registro final de atención en caja del CCCF");
        System.out.println("Personas atendidas: " + personasAtendidas);
        System.out.println("Personas en fila al final: " + personasEnFila);
    }
}