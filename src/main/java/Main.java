import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    private static final Marker QuestionMarker = MarkerManager.getMarker("question");
    private static final Marker StatementMarker = MarkerManager.getMarker("statement");

    public static void main(String[] args) throws InterruptedException {
         int iterations = Integer.parseInt(args[0]);
         int iterationAll = Integer.parseInt(args[0]);
        for(int j =1; j<=iterations;j++){
            ThreadContext.put("iterationAll",String.valueOf(iterations));
            ThreadContext.put("iterations",String.valueOf(j));
            logger.fatal(StatementMarker,"Húsvét napján korán keltem,");
            logger.warn(StatementMarker,"Ünneplőbe felöltöztem.");
            logger.info(StatementMarker,"Rózsvízzel elindultam,");
            logger.error(StatementMarker,"E kis házba bekopogtam");
            logger.info(StatementMarker,"Üdvözlöm a ház lakóit");
            logger.fatal(StatementMarker,"Keresek egy kis leányt itt.");
            logger.warn(StatementMarker,"Rózsvízzel locsolkodom,");
            logger.error("Piros tojást elfogadom!");
            logger.info(QuestionMarker,"Szabad-e locsolni?");
            Thread.sleep(3000);
            ThreadContext.clearMap();
        }






    }

}
