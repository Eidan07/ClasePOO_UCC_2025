package Clase12;

public class ASCIIConverter extends Converter {
    
    private String rutaArchivo;

    public ASCIIConverter(String rutaArchivo , String document){
        super(document);
        this.rutaArchivo = rutaArchivo;
    }
    
    public void makeLine(){
        System.out.println("makeLine ASCCII" + rutaArchivo);
    }

    public void makeParagraph(){
        System.out.println("makeParagraph ASCCII"+ rutaArchivo);
    }

    public void makeTable () {
        System.out.println("makeTable ASCCII"+ rutaArchivo);
    }
}

