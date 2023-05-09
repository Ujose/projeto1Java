import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String personagem = JOptionPane.showInputDialog(null, "Digite o nome de um personagem de Dragon Ball.", null, 0);
        String nomeImagem = "";
        String origem = "";
        
        switch (personagem){
            case "Bulma":
                origem = "Bulma é um personagem fictício do mangá e anime Dragon Ball, criado por Akira Toriyama. ";
                nomeImagem = "bulma-icone";
                break;
            case "Goku":
                origem = " Goku é membro de uma raça fictícia de extraterrestres, os Saiyajins. ";
                nomeImagem = "goku-icone";
                break;
            case "Kuririn":
                origem = "Nascido e crescido em um templo shaolin.";
                nomeImagem = "kuririn-icone";
                break;
            case "Piccolo":
                origem = "Piccolo surgiu dos desenhos que Akira fazia de humanos mas depois foi planejado para ser um demônio. ";
                nomeImagem = "Piccolo-icone";
                break;

            default:
                origem = "";
                break;
        }
        String caminhoImage = String.format("C:/Users/user/Desktop/ProjetosEcurso/Java.curso/ProjetoDragB/src/iimg/%s.png", nomeImagem);
        ImageIcon icone = new ImageIcon(caminhoImage);
        String informacoesPersonagem = String.format(": %s \nPOV: %s", personagem, origem);
        JOptionPane.showConfirmDialog(null, informacoesPersonagem, "Descricao", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icone );

    }
}
