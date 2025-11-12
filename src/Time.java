public class Time {
    private int horas, minutos, segundos;

    public Time(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public String formatarTempo() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
