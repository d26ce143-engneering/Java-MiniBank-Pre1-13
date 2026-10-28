package pre11mini;
import java.io.IOException;import java.nio.file.*;import java.nio.charset.StandardCharsets;
public class TransactionLog {public static void append(Path file,String line)throws IOException{Path parent=file.getParent();if(parent!=null)Files.createDirectories(parent);Files.write(file,(line+System.lineSeparator()).getBytes(StandardCharsets.UTF_8),StandardOpenOption.CREATE,StandardOpenOption.APPEND);}}
