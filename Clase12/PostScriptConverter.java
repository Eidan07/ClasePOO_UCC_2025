package Clase12;

public class PostScriptConverter extends Converter{
    
    private String rutaArchivo;

    public PostScriptConverter(String rutaArchivo , String document){
        super(document);
        this.rutaArchivo = rutaArchivo;
    }
    
    public void makeLine(){
        System.out.println("makeLine PostScript"+ rutaArchivo);
    }

    public void makeParagraph(){
        System.out.println("makeParagraph PostScript"+ rutaArchivo);
    }

    public void makeTable () {
        System.out.println("makeTable PostScript"+ rutaArchivo);
    }
}
