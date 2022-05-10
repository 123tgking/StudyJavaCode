package factor.factorImp;

import factor.logger;
import factor.loggerFactor;
import factor.loggerImp.dataBaseLogger;

public class dataBaseLoggerFactor implements loggerFactor {
    @Override
    public logger createLogger() {
        return new dataBaseLogger();
    }
}
