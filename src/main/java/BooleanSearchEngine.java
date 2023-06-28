import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class BooleanSearchEngine implements SearchEngine {
    private PdfPage page;
    private java.io.File pdf;
    PdfDocument doc;

    public BooleanSearchEngine(File pdfsDir, java.io.File pdf) throws IOException {
        doc = new PdfDocument(new PdfReader(this.pdf));
        doc.getPage(100);
        int i = 101;
        var text = PdfTextExtractor.getTextFromPage(page(101));
        var words = text.split("\\P{IsAlphabetic}+");
        // прочтите тут все pdf и сохраните нужные данные,
        // тк во время поиска сервер не должен уже читать файлы
    }

    private PdfPage page(int i) {
        return null;
    }

    public BooleanSearchEngine(File pdfs, File var, Object pdf) {
    }

    @Override
    public List<PageEntry> search(String word) {
        // тут реализуйте поиск по слову
        return Collections.emptyList();
    }
}
