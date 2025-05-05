package Clase12;

public class EjecutarConverter {
    public static void main(String[] args) {
        
        Converter objASCII = new ASCIIConverter("Libro", "c:Libros");
        Converter objPostScript = new PostScriptConverter("Libro", "c:Libros");
        Converter objPDF = new PDFConverter("Libro", "c:Libros");

        Reader objLector1 = new Reader("LINE", objPDF); //Elemento --> LINE, PARAGRAPH, TABLE / objeto --> ASCII, PostScript, PDF.
        Reader objLector2 = new Reader("PARAGRAPH", objASCII);
        Reader objLector3 = new Reader("TABLE", objPostScript);
        
        objLector1.parseInput();
        
        objLector2.parseInput();

        objLector3.parseInput();
    }
}
