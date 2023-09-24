package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		
		
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um nome para a playlist
        System.out.print("Digite um nome para a playlist: ");
        String nomePlaylist = scanner.nextLine();

        // Cria uma instância da Playlist com o nome fornecido pelo usuário
        Playlist playlist = new Playlist(nomePlaylist);

        // Lista de músicas predefinidas
        List<Musica> musicasDisponiveis = new ArrayList<>();
        musicasDisponiveis.add(new Musica("Veigh", "Novo Balanço"));
        musicasDisponiveis.add(new Musica("Imagine Dragons", "Believer"));
        musicasDisponiveis.add(new Musica("Turma do Pagode", "Deixa em off"));
        // Adicione mais músicas conforme necessário

        boolean continuar = true;

        while (continuar) {
            // Exibe opções para o usuário
            System.out.println("----------------------------------------\n");
            System.out.println("Opções:");
            System.out.println("1. Adicionar música à playlist");
            System.out.println("2. Remover música da playlist");
            System.out.println("3. Mostrar a playlist");
            System.out.println("4. Excluir a playlist");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: \n");
            System.out.println("\n----------------------------------------\n");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    // Exibe as músicas disponíveis para escolha
                    System.out.println("----------------------------------------\n");
                    System.out.println("Músicas disponíveis para adicionar à playlist:");
                    for (int i = 0; i < musicasDisponiveis.size(); i++) {
                        System.out.println((i + 1) + ". " + musicasDisponiveis.get(i).getNomeMusica()
                                + " - " + musicasDisponiveis.get(i).getAutor());
                    }

                    System.out.print("Escolha o número da música a ser adicionada: ");
                    int escolhaMusica = scanner.nextInt();

                    // Verifica se a escolha é válida
                    if (escolhaMusica >= 1 && escolhaMusica <= musicasDisponiveis.size()) {
                        Musica musicaEscolhida = musicasDisponiveis.get(escolhaMusica - 1);
                        playlist.adicionarMusica(musicaEscolhida);
                        System.out.println("Música adicionada à playlist.\n");
                        System.out.println("----------------------------------------\n");
                    } else {
                        System.out.println("Escolha inválida. Tente novamente.\npl1");
                        System.out.println("----------------------------------------\n");
                    }
                    break;
                case 2:
                    playlist.mostrarPlaylist();  // Mostra a playlist atual

                    // Solicita ao usuário o número da música a ser removida
                    System.out.print("Escolha o número da música a ser removida: ");
                    int escolhaMusicaRemover = scanner.nextInt();

                    // Verifica se a escolha é válida
                    if (escolhaMusicaRemover >= 1 && escolhaMusicaRemover <= playlist.getTamanho()) {
                        // Chama o método para excluir a música
                        playlist.excluirMusica(escolhaMusicaRemover - 1);
                        System.out.println("Música removida da playlist.\n");
                        System.out.println("----------------------------------------\n");
                    } else {
                        System.out.println("Escolha inválida. Tente novamente.\n");
                        System.out.println("----------------------------------------\n");
                    }
                    break;
                case 3:
                    playlist.mostrarPlaylist();
                    break;
                case 4:
                	playlist.excluirPlayList();
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
    
}
