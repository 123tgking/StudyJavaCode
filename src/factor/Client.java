package factor;

import factor.factorImp.dataBaseLoggerFactor;
import factor.factorImp.fileLoggerFactor;
import factor.factorUtils.XMLUtil;

public class Client {
    public static void main(String[] args){
        loggerFactor factor;
        logger log;

        factor = (loggerFactor) XMLUtil.getBean();
        log = factor.createLogger();
        log.writeLog();
    }
}
