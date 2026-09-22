package ej6tp3p;

public class prueba_ej6tp3 {
    public static void main(String[] args) {
            // 1. Creación de la estructura base
            Directorio discoC = new Directorio("C:.", "2024-01-01");
            Directorio dirMp3 = new Directorio("mp3", "2024-01-05");
            Directorio dirQueen = new Directorio("Queen", "2024-01-06");
            Archivo recordatorio = new Archivo("Recordatorio.txt", "2024-01-02", "2024-01-02", 5.0);
            Archivo boRhapsody = new Archivo("Bohemian Rhapsody.mp3", "2024-01-06", "2024-01-06", 5300.0);
            Archivo saveMe = new Archivo("Save me.mp3", "2024-01-06", "2024-01-06", 2500.0);
            dirQueen.agregar(boRhapsody);
            dirQueen.agregar(saveMe);
            dirMp3.agregar(dirQueen);
            ArchivoComprimido zipQueen = new ArchivoComprimido("Queen.zip", "2024-01-10", 0.8);
            zipQueen.agregar(boRhapsody); 
            zipQueen.agregar(saveMe);
             Link linkSaveMe = new Link("Acceso directo a Save me.mp3.lnk", "2024-01-11", saveMe);
            Link linkRaiz = new Link("Acceso directo a raiz.lnk", "2024-01-12", discoC);
            discoC.agregar(linkSaveMe);
            discoC.agregar(zipQueen);
            discoC.agregar(recordatorio);
            discoC.agregar(dirMp3);
             Directorio fotos = new Directorio("fotos", "2024-01-02");
            Directorio viaje = new Directorio("viaje", "2024-01-03");
            viaje.agregar(linkRaiz);
            fotos.agregar(viaje);
            discoC.agregar(fotos);
            discoC.listar("");
     }
}
