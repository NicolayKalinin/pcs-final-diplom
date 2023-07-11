import java.io.File;
import java.io.IOException;

public class BooleanSearchEngineBuilder {
    private File pdfsDir;
    private File pdf;
    private File pdfs;
    private File var;
    private Object pdf0;
    private int page = 0;
    private String pdfName = null;
    private int count = 0;

    public BooleanSearchEngineBuilder setPdfsDir(File pdfsDir) {
        this.pdfsDir = pdfsDir;
        return this;
    }

    public BooleanSearchEngineBuilder setPdf(File pdf) {
        this.pdf = pdf;
        return this;
    }

    public BooleanSearchEngineBuilder setPdfs(File pdfs) {
        this.pdfs = pdfs;
        return this;
    }

    public BooleanSearchEngineBuilder setVar(File var) {
        this.var = var;
        return this;
    }

    public BooleanSearchEngineBuilder setPdf0(Object pdf0) {
        this.pdf0 = pdf0;
        return this;
    }

    public BooleanSearchEngineBuilder setPage(int page) {
        this.page = page;
        return this;
    }

    public BooleanSearchEngineBuilder setPdfName(String pdfName) {
        this.pdfName = pdfName;
        return this;
    }

    public BooleanSearchEngineBuilder setCount(int count) {
        this.count = count;
        return this;
    }

    public BooleanSearchEngine createBooleanSearchEngine() throws IOException {
        return new BooleanSearchEngine(pdfsDir, pdf);
    }

    public BooleanSearchEngineBuilder setPdf(String pdf) {
        return this;
    }
}