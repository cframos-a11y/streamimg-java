import usuario.*;
import conteudo.*;
import auxiliares.*;
import pagamento.*;
import album.Album;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando aplicativo de streaming de áudio");

        UsuarioGratuito usuarioGratuito = new UsuarioGratuito(1, "João Pedro", "joaopedro@email.com", true);
        UsuarioPremium usuarioPremium = new UsuarioPremium(2, "Mariana", "mariana@email.com", 19.90);
        UsuarioFamilia usuarioFamilia = new UsuarioFamilia(3, "Família Oliveira", "familia.oliveira@email.com", 3);

        Artista artista = new Artista(4, "Roberto Carlos", "roberto@email.com", "MPB");
        Narrador narrador = new Narrador(5, "Carlos Alberto", "carlos@email.com", "Dramático");
        Apresentador apresentador = new Apresentador(6, "Ana Paula", "ana@email.com", "Tech Talk");

        System.out.println("\n--- Informações dos Usuários ---");
        usuarioGratuito.exibirInfo();
        usuarioPremium.exibirInfo();
        usuarioFamilia.exibirInfo();
        artista.exibirInfo();
        narrador.exibirInfo();
        apresentador.exibirInfo();

        Album album1 = new Album("Grandes Sucessos", 2022);
        Album album2 = new Album("Novidades", 2023);

        Musica musica = new Musica(1, "Emoções", 4.5, artista, album1);
        Podcast podcast = new Podcast(2, "Tecnologia Hoje", 45.0, apresentador, 10);
        Audiobook audiobook = new Audiobook(3, "O Poder do Hábito", 360.0, narrador, 12);

        album2.addMusica("Lançamento 1");
        album2.addMusica("Lançamento 2");

        System.out.println("\n--- Manipulação de Conteúdos ---");
        musica.tocar();
        podcast.ouvir();
        audiobook.ouvir();

        System.out.println("\n--- Playlists e Histórico ---");
        Playlist playlist = new Playlist(apresentador, 5);
        playlist.adicionar(musica);
        playlist.adicionar(podcast);
        playlist.reproduzir();

        Historico historico = new Historico("Músicas ouvidas recentemente");
        historico.registrar(musica.getTitulo());
        historico.exibir();

        album1.addMusica("Detalhes");
        album1.addMusica("Como é grande o meu amor por você");

        System.out.println("\n--- Informações dos Álbuns ---");
        album1.exibirInfo();
        album2.exibirInfo();

        System.out.println("\n--- Pagamentos e Assinaturas ---");
        Pagamento pagamento = new Pagamento("Cartão de Crédito", 19.90);
        pagamento.processar();

        Assinatura assinatura = new Assinatura();
        assinatura.setTipo("Premium");
        assinatura.setPreco(19.90);
        assinatura.exibir();

        System.out.println("\n--- Avaliações e Comentários ---");
        Avaliacao avaliacao = new Avaliacao("Ótima música!", 5);
        avaliacao.avaliar();

        Comentario comentario = new Comentario("Adorei esse podcast!", usuarioPremium);
        System.out.println("Comentário de " + comentario.getUsuario().getNome() + ": " + comentario.getTexto());

        auxiliares.Genero genero = new auxiliares.Genero("Rock");
        System.out.println("Gênero criado: " + genero.getNome());
        Recomendacao recomendacao = new Recomendacao("Baseado nos seus gostos musicais");
        recomendacao.sugerir();

        System.out.println("\n--- Funcionalidades Específicas ---");
        usuarioPremium.baixar("Música: Emoções");
        usuarioGratuito.ouvirAnuncio();
        usuarioFamilia.adicionarMembro();
        artista.publicarConteudo();
        narrador.narrar();
        apresentador.apresentar();

        System.out.println("\nAplicativo encerrado com sucesso!");
    }
}
