import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class BooleanSearchEngine implements SearchEngine {
    private int page;
    private String pdf;
    PdfDocument doc;
    private String pdfName;

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

    public BooleanSearchEngine(File pdfs, File var, Object pdf, int page, String pdfName) {
        this.page = page;
        this.pdfName = pdfName;
    }

    @Override
    public List<PageEntry> search(String word) {
        List<PageEntry> words = new ArrayList<>();
        Map<String, Integer> freqs = new HashMap<>();
        for (PageEntry s : words) {
            if (word.isEmpty()) {
                continue;
            }
            word = word.toLowerCase();
            freqs.put(word.toString(), freqs.getOrDefault(word, 0) + 1);
        }
        // тут реализуйте поиск по слову
        return Collections.emptyList();
    }
}
