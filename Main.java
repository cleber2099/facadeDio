public class Main {

    // Música
    static class ReproducaoMusica {
        public void iniciarMusica() {
            System.out.println("Iniciando a reprodução de música.");
        }

        public void pararMusica() {
            System.out.println("Parando a reprodução de música.");
        }
    }

    //  Vídeo
    static class ReproducaoVideo {
        public void iniciarVideo() {
            System.out.println("Iniciando a reprodução de vídeo.");
        }

        public void pararVideo() {
            System.out.println("Parando a reprodução de vídeo.");
        }
    }

    //  Jogos
    static class ReproducaoJogo {
        public void iniciarJogo() {
            System.out.println("Iniciando a reprodução de jogo.");
        }

        public void pararJogo() {
            System.out.println("Parando a reprodução de jogo.");
        }
    }

    // Facade
    static class SistemaEntretenimento {
        private ReproducaoMusica musica;
        private ReproducaoVideo video;
        private ReproducaoJogo jogo;

        public SistemaEntretenimento() {
            this.musica = new ReproducaoMusica();
            this.video = new ReproducaoVideo();
            this.jogo = new ReproducaoJogo();
        }

        public void reproduzirMusica() {
            musica.iniciarMusica();
        }

        public void pararMusica() {
            musica.pararMusica();
        }

        public void reproduzirVideo() {
            video.iniciarVideo();
        }

        public void pararVideo() {
            video.pararVideo();
        }

        public void jogar() {
            jogo.iniciarJogo();
        }

        public void pararJogo() {
            jogo.pararJogo();
        }
    }

    public static void main(String[] args) {
        SistemaEntretenimento sistema = new SistemaEntretenimento();
        sistema.reproduzirMusica();

        sistema.reproduzirVideo();

        sistema.jogar();
        sistema.pararMusica();
        sistema.pararVideo();
        sistema.pararJogo();
    }
}
