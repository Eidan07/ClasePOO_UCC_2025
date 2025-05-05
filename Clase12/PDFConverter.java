package Clase12;

public class PDFConverter extends Converter {
        
    private String rutaArchivo;

    public PDFConverter(String rutaArchivo , String document){
        super(document);
        this.rutaArchivo = rutaArchivo;
    }
    
    public void makeLine(){
        System.out.println("makeLine PDF"+ rutaArchivo);
    }

    public void makeParagraph(){
        System.out.println("makeParagraph PDF"+ rutaArchivo);
    }

    public void makeTable () {
        System.out.println("makeTable PDF"+ rutaArchivo);
    }
}
