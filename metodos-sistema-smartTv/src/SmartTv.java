public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar() {
        ligada = true;
        System.out.println("TV Ligada");
    }
    public void desligar() {
        ligada = false;
        System.out.println("TV Desligada");
    }
    public void aumentarVolume() {
        ++volume;
        System.out.println("Volume: " + volume);
    }
    public void diminuirVolume() {
        --volume;
        System.out.println("Volume: " + volume);
    }
    public void subirCanal() {
        ++canal;
        System.out.println("Canal: " + canal);
    }
    public void descerCanal() {
        --canal;
        System.out.println("Canal: " + canal);
    }
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }
}