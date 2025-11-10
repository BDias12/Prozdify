public class Principal {
    public static void main(String[] args) {
        Podcast prozdcast = new Podcast("Prozdify Talks", "Bruno Dev");

        Episodio ep1 = new Episodio("Introdução ao Java", new Time(0,45,12), 1,
                "Falando sobre conceitos básicos de Java.", false);
        Episodio ep2 = new Episodio("POO na prática", new Time(1,12,8), 2,
                "Entendendo herança e composição com exemplos reais.", true);
        Episodio ep3 = new Episodio("Coleções em Java", new Time(0,52,30), 3,
                "Aprendendo sobre ArrayList, HashMap e Set.", false);
        Episodio ep4 = new Episodio("Tratamento de Exceções", new Time(0,40,25), 4,
                "Como lidar com erros sem quebrar o código.", true);

        prozdcast.adicionarEpisodio(ep1);
        prozdcast.adicionarEpisodio(ep2);
        prozdcast.adicionarEpisodio(ep3);
        prozdcast.adicionarEpisodio(ep4);

        Musica musica1 = new Musica("Imagine", new Time(0,3,15), "John Lennon", "Rock", 1971);
        Musica musica2 = new Musica("Billie Jean", new Time(0,4,54), "Michael Jackson", "Pop", 1982);
        Musica musica3 = new Musica("Bohemian Rhapsody", new Time(0,5,55), "Queen", "Rock", 1975);
        Musica musica4 = new Musica("Shape of You", new Time(0,4,24), "Ed Sheeran", "Pop", 2017);
        Musica musica5 = new Musica("Viva La Vida", new Time(0,4,2), "Coldplay", "Alternative Rock", 2008);
        Musica m1 = new Musica("Skyfall", new Time(4, 45,30), "Adele", "Pop", 2012);
        m1.reproduzir();
        m1.reproduzir();
        System.out.println("Total de reproduções: " + m1.getReproducoes());

        Video video1 = new Video("Documentário: História da Internet", new Time(1,30,0), "1080p");
        Video video2 = new Video("Tutorial de Git e GitHub", new Time(0,25,45), "720p");
        Video video3 = new Video("Highlights da Computação 2024", new Time(0,15,10), "4K");

        System.out.println("\n========= 🎧 Podcasts =========");
        prozdcast.listarEpisodios();

        System.out.println("\n========= 🎵 Músicas =========");
        System.out.println(musica1);
        System.out.println(musica2);
        System.out.println(musica3);
        System.out.println(musica4);
        System.out.println(musica5);

        System.out.println("\n========= 🎬 Vídeos =========");
        System.out.println(video1);
        System.out.println(video2);
        System.out.println(video3);

        musica3.curtir();
        musica3.curtir();
        ep2.curtir();
        video1.curtir();

        musica2.reproduzir();
        musica2.pausar();
        ep4.reproduzir();
        ep4.pausar();

        System.out.println("\n📈 Total de episódios: " + prozdcast.getEpisodios().size());
        System.out.println("📀 Primeiro episódio: " + prozdcast.getEpisodios().get(0).getTitulo());

        System.out.println(musica1);
    }
}
