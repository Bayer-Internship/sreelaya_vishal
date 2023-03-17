import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogNew {
     static Logger loggervar=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void setlogger() {

        LogManager.getLogManager().reset();
        loggervar.setLevel(Level.OFF);
        ConsoleHandler ch= new ConsoleHandler();
        ch.setLevel(Level.ALL);
        loggervar.addHandler(ch);
    }
}
