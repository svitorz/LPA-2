package Encapsulamento_EX04;

public class MediaCTR {
    MediaDAO mediaDAO = new MediaDAO();
    
    public String imprimir(MediaDTO mediaDTO) {
        return mediaDAO.calcularMedia(mediaDTO);
    }
}
