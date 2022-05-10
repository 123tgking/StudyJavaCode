package factor.factorImp;

import factor.logger;
import factor.loggerFactor;
import factor.loggerImp.fileLogger;

public class fileLoggerFactor implements loggerFactor {

    @Override
    public logger createLogger() {
        return new fileLogger();
    }
}
