import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class BooleanSearchEngine implements SearchEngine {
    private static int count;
    private static int page;
    private String pdf;
    PdfDocument doc;
    private static String pdfName;

    public BooleanSearchEngine(File pdfsDir, java.io.File pdf) throws IOException {
        doc = new PdfDocument(new PdfReader(this.pdf));
        doc.getPage(0-100);
        int i = 101;
        var text = PdfTextExtractor.getTextFromPage(page(101));
        var words = text.split("\\P{IsAlphabetic}+");
        // прочтите тут все pdf и сохраните нужные данные,
        // тк во время поиска сервер не должен уже читать файлы
    }

    public BooleanSearchEngine(File pdfs) {

    }

    public BooleanSearchEngine() {

    }

    private PdfPage page(int i) {
        return null;
    }

    public BooleanSearchEngine(File pdfs, File var, Object pdf, int page, String pdfName) {
        this.page = page;
        this.pdfName = pdfName;
    }

    private BooleanSearchEngine(
            @JsonProperty String pdfName,
            @JsonProperty int page,
            @JsonProperty int count
    ) {
        this.pdfName = pdfName;
        this.page = page;
        this.count = count;
    }

    public String getPdfName() {
        return String.valueOf(Integer.parseInt(pdfName));
    }
    public static int getPage() {
        return page;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "\n pdfName=" + pdfName +
                "\n page=" + page +
                "\n count=" + count;
    }
    
    @Override
    public List<PageEntry> search(String word) {
        List<PageEntry> words = new ArrayList<>();
        Map<String, Integer> freqs = new HashMap<>();
        for (PageEntry s : words) {
            if (word.isEmpty()) {
                continue;
            }
            BooleanSearchEngine engine = null;
            System.out.println(engine.search("бизнес"));
            word = word.toLowerCase();
            freqs.put(word.toString(), freqs.getOrDefault(word, 0) + 1);
        }
        // тут реализуйте поиск по слову
        return Collections.emptyList();
    }

    private Object setPdfs(File pdfs) {
        return null;
    }

    public String valueOf(int page) {
        return null;
    }
}
